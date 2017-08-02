package ca.ubc.cs.gentlebot.query;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.math3.linear.RealVector;
import org.eclipse.emf.common.util.EList;

import ca.ubc.cs.gentlebot.model.discussions.Comment;
import ca.ubc.cs.gentlebot.model.discussions.Discussion;
import ca.ubc.cs.gentlebot.model.discussions.Participant;
import ca.ubc.cs.gentlebot.model.discussions.Utterance;
import ca.ubc.cs.leetcat.TFIDFPreprocess;
import ca.ubc.cs.leetcat.TFIDFVectorCreator;

/**
 * Computes and constructs all instance data for a discussion.
 *
 * @author Michalis Famelis
 *
 */
public class InstanceComputer {

	private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private final Discussion discussion;
	private final EList<Utterance> allUtterances;
	private final EList<Comment> comments;

	public InstanceComputer(Discussion d) {
		this.discussion = d;
		this.allUtterances = d.getAllUtterances();
		this.comments = d.getComments();
	}

	public Discussion computeInstances() {
		computeAuthors();
		computetextualContent();
		computeHasCapitalizedWord();
		computeProjectMembership();
		computeWhetherAuthorInvited();
		computeNumberOfWords();
		computeCommentsSoFar();
		computeAllUtterancesSoFar();
		computeUtterancesInCommentSoFar();
		computeUtteredByOriginalPoster();
		computeHasShould();
		computeTFIDF();
		computeTopicVector();
		return this.discussion;
	}

	/**
	 * Computes the INV feature for all Utterances, not just manually annotated
	 * ones. If an utterance has a DP, the manual annotation is respected.
	 */
	private void computeWhetherAuthorInvited() {
		for (final Utterance u : allUtterances) {
			// if (!u.getDescription().getDesignPoints().isEmpty())
			// then it has a DP, so there is nothing to do because
			// u.getDescription().isAuthorInvited()
			// has been set in DesignPointParser
			// ;
			// else {
			// this utterance does not have a DP
			// by default (from the metamodel) isAuthorInvited is false
			assert u.getDescription().isAuthorInvited() == false;
			final Participant author = u.getComment().getAuthor();
			if (this.discussion.getInvitedUsernames().contains(author.getName())) {
				u.getDescription().setAuthorInvited(true);
				// }
			}
		}
	}

	private void computetextualContent() {

		final Pattern p = Pattern.compile("\t|\r|\n");

		for (final Comment c : comments) {
			for (final Utterance u : c.getUtterances()) {
				assert u != null;
				final String content = u.getContent();
				final Matcher m = p.matcher(content);
				String dest = m.replaceAll("");
				dest = dest.replaceAll("\"", " ");
				u.getDescription().setContent("\"" + dest + "\"");
			}
		}

	}

	private void computeAuthors() {
		log.info("Calculating feature: project member name");
		for (final Comment c : comments) {
			final Participant author = c.getAuthor();

			for (final Utterance u : c.getUtterances()) {
				u.getDescription().setName(author.getName().replace("@", ""));
			}
		}

	}

	// xin: need to change soon
	private void computeTopicVector() {

	}

	private void computeHasShould() {
		log.info("Calculating feature: contains the word should");
		for (final Utterance u : allUtterances) {
			u.getDescription().setContainsShould(u.getContent().contains("should"));
		}
	}

	private void computeHasCapitalizedWord() {
		log.info("Calculating feature: has capitalized word");
		for (final Utterance u : allUtterances) {
			u.getDescription().setHasCapitalizedWord(false);
			for (final String w : u.getContent().split(" ")) {
				if (w.length() > 0 && Character.isUpperCase(w.codePointAt(0))) {
					u.getDescription().setHasCapitalizedWord(true);
					break;
				}
			}
		}
	}

	private void computeUtteredByOriginalPoster() {
		log.info("Calculating feature: uttered by original poster");
		final Participant op = comments.get(0).getAuthor();
		for (final Comment c : comments) {
			for (final Utterance u : c.getUtterances()) {
				u.getDescription().setUtteredByOriginalPoster(c.getAuthor().equals(op));
			}
		}
	}

	private void computeUtterancesInCommentSoFar() {
		log.info("Calculating feature: number of utterances in comment so far");
		for (final Comment c : comments) {
			final EList<Utterance> utterances = c.getUtterances();
			for (final Utterance u : utterances) {
				u.getDescription().setUtterancesInCommentSoFar(utterances.indexOf(u));
			}
		}
	}

	private void computeAllUtterancesSoFar() {
		log.info("Calculating feature: number of utterances in discussion so far");
		for (final Utterance u : allUtterances) {
			u.getDescription().setAllUtterancesSoFar(allUtterances.indexOf(u));
		}
	}

	private void computeCommentsSoFar() {
		log.info("Calculating feature: number of comments so far");
		for (final Comment c : comments) {
			final int count = comments.indexOf(c);
			for (final Utterance u : c.getUtterances()) {
				u.getDescription().setCommentsSoFar(count);
			}
		}
	}

	private void computeNumberOfWords() {
		log.info("Calculating feature: number of words");
		for (final Utterance u : allUtterances) {
			u.getDescription().setNumberOfWords(u.getContent().split(" ").length);
		}
	}

	private void computeProjectMembership() {
		log.info("Calculating feature: project membership");
		for (final Comment c : comments) {
			final Participant author = c.getAuthor();
			for (final Utterance u : c.getUtterances()) {
				u.getDescription().setAuthorIsProjectMember(author.isMember());
			}
		}
	}

	/**
	 * Based on example code by Albert.
	 *
	 * @param d
	 */
	private void computeTFIDF() {
		try {
			log.info("Calculating TF/IDF");
			final TFIDFVectorCreator aTFIDFVector = TFIDFVectorCreator.getTFIDFVectorCreator();
			for (final Comment c : comments) {
				for (final Utterance u : c.getUtterances()) {
					assert u != null;
					final String content = u.getContent();
					// remove anything that is not a word pdoc is a string like
					// this: "word1 word2 word3 wor.d4"
					final String pdoc = TFIDFPreprocess.simplePreprocessor(content);
					aTFIDFVector.addDocument(pdoc);
				}
			}
			aTFIDFVector.endDocuments();
			TFIDFVectorCreator.deleteTFIDFVectorCreator();
			// Get set of vectors.
			final ArrayList<RealVector> vectorList = aTFIDFVector.getVector();

			// ASSERTION: the order of vectors is the same as the order of
			// allUtterances. So this at least must be true:
			assert allUtterances.size() == vectorList.size();
			for (int i = 0; i < allUtterances.size(); i++) {
				final Utterance u = allUtterances.get(i);
				final RealVector v = vectorList.get(i);
				// Read the values of v and put them in the description of U
				for (int j = 0; j < v.getDimension(); j++) {
					u.getDescription().getTfidfVector().add(v.getEntry(j));
				}
			}

		} catch (final IOException e) {
			log.severe(e.getMessage());
		}
	}

}
