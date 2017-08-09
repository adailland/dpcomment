package ca.ubc.cs.gentlebot.query;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import ca.ubc.cs.gentlebot.model.discussions.Comment;
import ca.ubc.cs.gentlebot.model.discussions.Discussion;
import ca.ubc.cs.gentlebot.model.discussions.Utterance;
import ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription;

public class DiscussionARFFExporter {

	private Discussion discussion;

	private String ARFFString;

	private String nl = System.lineSeparator();

	public DiscussionARFFExporter(Discussion d) {
		this.discussion = d;
		ARFFString = this.constructARFF();
	}

	public String getARFF() {
		return this.ARFFString;
	}

	private String constructARFF() {
		String s = "";
		s += constructHeader();
		s += nl;
		s += constructAttributes();
		s += nl;
		s += constructData();

		return s;

	}

	private String constructHeader() {
		String relationName = "pr";
		String s = "";
		s += "% Generated by Discussion model " + this.discussion.getTitle() + nl;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		s += "% File generated on " + dateFormat.format(cal.getTime()) + nl;
		s += nl;
		s += "@relation " + relationName + System.currentTimeMillis() + nl;
		return s;
	}

	/**
	 * Generates attribute declarations, each on a line
	 * 
	 * @return
	 */
	private String constructAttributes() {
		String s = "";
		s += "@attribute author String" + nl;
		s += "@attribute textual String" + nl;
		s += "@attribute isProjectMember {TRUE, FALSE}" + nl;
		s += "@attribute isInvited {TRUE, FALSE}" + nl;
		s += "@attribute numberOfWords numeric" + nl;
		s += "@attribute commentsSoFar numeric" + nl;
		s += "@attribute allUtterancesSoFar numeric" + nl;
		s += "@attribute utterancesInCommentSoFar numeric" + nl;
		s += "@attribute utteredByOriginalPoster {TRUE, FALSE}" + nl;
		s += "@attribute hasCapitalizedWord {TRUE, FALSE}" + nl;
		s += "@attribute containsShould {TRUE, FALSE}" + nl;
		// s += addTFIDFAttributes();
		s += "@attribute hasDecisions {TRUE, FALSE}" + nl;
		s += "@attribute howManyDecisions numeric" + nl;
		s += "@attribute idComment numeric" + nl;
		s += "@attribute idPara numeric" + nl;
		return s;
	}

	private String constructData() {
		String s = "";
		s += "@data" + nl;
		for (Comment c : this.discussion.getComments()){
			int previousParaId = 0;
			for (Utterance u : c.getUtterances()) {
				String content = u.getDescription().getContent();
				String author = u.getDescription().getName();

				if (!(content.equals("\"\"") || content.startsWith("\"" + author)
						|| content.contains("Foundation member") || content.contains("commented on an outdated diff")
						|| !content.contains(" ") || content.contains("added a commit that referenced")
						|| content.contains("This was referenced"))) {
//					System.out.println(u.getDescription().getContent());
					s += toARFFInstanceLine(u,c, ++previousParaId);
				}
			}
		}
		return s;
	}

	/*
	private String addTFIDFAttributes() {
		String s = "";

		// Check sanity and find the common size of the vectors
		int howMany = this.checkThatTFIDFVectorsAreAllTheSameSize();
		for (int i = 0; i < howMany; i++)
			s += "@attribute tfidf" + i + " numeric" + nl;

		return s;
	}
	*/

	/**
	 * Checks to see that all TF/IDF vectors have the same size.
	 * 
	 * @return the common size of all TF/IDF vectors.
	 */
	/*
	private Integer checkThatTFIDFVectorsAreAllTheSameSize() {
		ArrayList<EList<Double>> allVectors = new ArrayList<EList<Double>>();
		for (Comment c : this.discussion.getComments())
			for (Utterance u : c.getUtterances())
				allVectors.add(u.getDescription().getTfidfVector());
		ArrayList<Integer> sizes = new ArrayList<Integer>();
		for (EList<Double> v : allVectors)
			sizes.add(v.size());
		boolean allTheSame = true;
		Integer first = sizes.get(0);
		for (Integer i : sizes)
			if (!i.equals(first)) {
				allTheSame = false;
				break;
			}
		assert (allTheSame);
		return (first);
	}
	*/

	/**
	 * Generates a full line (including the newline character) for an Utterance.
	 * 
	 * @param u
	 *            the Utterance
	 * @return the comma separated values of the UD
	 */
	private String toARFFInstanceLine(Utterance u, Comment c, int previousParaId) {
		UtteranceDescription d = u.getDescription();

		String s = "";

		s += d.getName();
		s += ",";

		s += d.getContent();
		s += ",";

		// @attribute isProjectMember
		s += bool(d.isAuthorIsProjectMember());
		s += ",";

		// @attribute isInvited
		s += bool(d.isAuthorInvited());
		s += ",";

		// @attribute numberOfWords
		s += d.getNumberOfWords();
		s += ",";

		// @attribute commentsSoFar
		s += d.getCommentsSoFar();
		s += ",";

		// @attribute allUtterancesSoFar
		s += d.getAllUtterancesSoFar();
		s += ",";

		// @attribute utterancesInCommentSoFar
		s += d.getUtterancesInCommentSoFar();
		s += ",";

		// @attribute utteredByOriginalPoster
		s += bool(d.isUtteredByOriginalPoster());
		s += ",";

		// @attribute hasCapitalizedWord
		s += bool(d.isHasCapitalizedWord());
		s += ",";

		// @attribute containsShould
		s += bool(d.isContainsShould());
		// no "," because tfidf adds its own commas

		// @attributes tfidfXX
		/*
		 * EList<Double> tfidf = d.getTfidfVector(); for (Double val : tfidf) s
		 * += "," + val.toString();
		 */
		s += ",";

		// @attribute hasDecisions
		s += bool(d.getDesignPoints().isEmpty());
		s += ",";

		// @attribute howManyDecisions
		s += d.getDesignPoints().size();
		s += ",";
		
		// @attribute idComment
		s += c.getId();
		s += ",";
		
		// @attribute idComment
		s += previousParaId;
		s += nl;

		return s;
	}

	private String bool(boolean test) {
		return test ? "TRUE" : "FALSE";
	}

}
