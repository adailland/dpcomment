package ca.ubc.cs.gentlebot.util;

import org.eclipse.emf.common.util.EList;

import ca.ubc.cs.gentlebot.model.discussions.Comment;
import ca.ubc.cs.gentlebot.model.discussions.Discussion;
import ca.ubc.cs.gentlebot.model.discussions.Utterance;

/**
 * Export a discussion in an XML following Enamul Hoque's schema. <br>
 * Enamul is: http://www.cs.ubc.ca/~enamul/
 * 
 * @author famelis
 *
 */
public class EnamulExporter {

	private static String nl = System.lineSeparator();

	private static String articleS = "<article>";
	private static String articleE = "</article>";

	private static String idS = "<id>";
	private static String idE = "</id>";

	private static String titleS = "<title>";
	private static String titleE = "</title>";

	private static String commentS = "<comment>";
	private static String commentE = "</comment>";

	private static String authorS = "<author>";
	private static String authorE = "</author>";

	private static String sentencetextS = "<sentencetext>";
	private static String sentencetextE = "</sentencetext>";

	private static String parentS = "<parent>";
	private static String parentE = "</parent>";

	public static String export(Discussion d) {
		EList<Comment> comments = d.getComments();

		String r = "";

		// the first comment becomes the "article"
		r += articleS + nl;
		Comment first = comments.get(0);
		r += idS + first.getId() + idE + nl;
		r += titleS + d.getTitle() + titleE + nl;
		r += sentencetextS;
		for (Utterance u : first.getUtterances())
			r += u.getContent() + nl;
		r += sentencetextE + nl;
		r += articleE + nl;

		// start from the second comment
		for (int i = 1; i < comments.size(); i++) {
			Comment c = comments.get(i);
			Comment parent = comments.get(i - 1);
			r += commentS + nl;
			r += idS + c.getId() + idE + nl;
			r += authorS + c.getAuthor().getName() + authorE + nl;
			r += sentencetextS;
			for (Utterance u : c.getUtterances())
				r += u.getContent() + nl;
			r += sentencetextE + nl;
			r += parentS + parent.getId() + parentE + nl;
			r += commentE + nl;
		}

		return r;

	}

}
