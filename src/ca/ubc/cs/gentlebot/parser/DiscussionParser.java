package ca.ubc.cs.gentlebot.parser;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import ca.ubc.cs.gentlebot.model.discussions.Discussion;
import ca.ubc.cs.gentlebot.model.discussions.DiscussionsFactory;

public class DiscussionParser {

	private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private DiscussionsFactory factory = DiscussionsFactory.eINSTANCE;;
	private Discussion discussion;

	/**
	 * The constructor. Given a discussion file, it creates a discussion model,
	 * which can be accessed by getDiscussionModel().
	 * 
	 * @param discussionFile
	 *            a File containing the discussion. Assummed to have been
	 *            created as a w3m text dump.
	 */
	public DiscussionParser(File discussionFile) throws IOException {

		this.discussion = factory.createDiscussion();
		this.discussion.setTitle(discussionFile.getName());

		log.info("Parsing the participants");
		ParticipantsParser pp = new ParticipantsParser(discussionFile, this.discussion);
		pp.parseParticipants();
		
		log.info("Separating the discussion into comments");
		CommentParser cp = new CommentParser(discussionFile, this.discussion);
		cp.parseRawComments();
		log.fine("Found " + this.discussion.getComments().size() + " comments");

		log.info("Identifying utterances and annotations");
		cp.refineComments();

	}

	public Discussion getDiscussionModel() {
		return this.discussion;
	}
}
