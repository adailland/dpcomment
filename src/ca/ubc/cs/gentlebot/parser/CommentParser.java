package ca.ubc.cs.gentlebot.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import ca.ubc.cs.gentlebot.Gentlebot;
import ca.ubc.cs.gentlebot.model.discussions.Comment;
import ca.ubc.cs.gentlebot.model.discussions.Discussion;
import ca.ubc.cs.gentlebot.model.discussions.DiscussionsFactory;
import ca.ubc.cs.gentlebot.model.discussions.Participant;
import ca.ubc.cs.gentlebot.model.discussions.Utterance;
import ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription;
import ca.ubc.cs.gentlebot.util.StringUtils;

public class CommentParser {

	private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private final Discussion discussionObject;

	private final File discussionFile;

	private final DesignPointParser designPointParser;

	public CommentParser(File discussionFile, Discussion discussion) {
		this.discussionObject = discussion;
		this.discussionFile = discussionFile;
		this.designPointParser = new DesignPointParser();
	}

	public void parseRawComments() {
		try {
			final BufferedReader reader = new BufferedReader(new FileReader(discussionFile));
			String line;

			final ArrayList<String> content = new ArrayList<>();
			final ArrayList<String> lookahead = new ArrayList<>();
			
			log.fine("Initializing regular expression patterns");
			
			
			final Pattern singleUsername = Pattern.compile("[>]{3}\\w+(-\\w+)*[,]{1}\\W\\w+(-\\w+)*$");
			final Pattern thread = Pattern.compile("[>]{3}Thread\\W\\w+(-\\w+)*$");
			
			Comment previouslySeenComment = null;
			Participant lastSeenParticipant = null;
			
			int previousCommentID = 0;
			
			// Find the first participant
			if((line=reader.readLine())!=null){
				final String firstParticipant = line.substring(line.indexOf(">") + 3, line.indexOf(",", line.indexOf(">")));
				for (final Participant p : this.discussionObject.getParticipants()) {
					if (p.getName().equals(firstParticipant)) {
						lastSeenParticipant = p;
						break; 
					}
				}
			}
			

			while ((line=reader.readLine())!=null){
				if(!thread.matcher(line).matches()){
					if(!singleUsername.matcher(line).matches()){
						content.add(line.trim());
						continue;
					}else{
						lookahead.add(line.trim());
						final String newCommentPoster = line.substring(line.indexOf(">") + 3, line.indexOf(",", line.indexOf(">")));
						line = reader.readLine();
						
						final Comment comment = DiscussionsFactory.eINSTANCE.createComment();
						comment.setRawContent(StringUtils.flatten(content));
						comment.setId(++previousCommentID);
						
						this.discussionObject.getComments().add(comment);
						
						if (previouslySeenComment != null) {
							previouslySeenComment.setNext(comment);
						}
						previouslySeenComment = comment;
						comment.setAuthor(lastSeenParticipant);
						
						for (final Participant p : this.discussionObject.getParticipants()) {
							if (p.getName().equals(newCommentPoster)) {
								lastSeenParticipant = p;
								break; 
							}
						}
						
						lastSeenParticipant.setMember(false);
						content.clear();
						lookahead.clear();
						continue;
					}
				}
				
			}
			
			// Last comment
			final Comment comment = DiscussionsFactory.eINSTANCE.createComment();
			comment.setRawContent(StringUtils.flatten(content));
			comment.setId(++previousCommentID);
			this.discussionObject.getComments().add(comment);
			if (previouslySeenComment != null) {
				previouslySeenComment.setNext(comment);
			}
			previouslySeenComment = comment;
			comment.setAuthor(lastSeenParticipant);
			
			reader.close();

		} catch (final FileNotFoundException e) {
			log.severe(e.getMessage());
		} catch (final IOException e) {
			log.severe(e.getMessage());
		}

	}

	/**
	 * Break raw comments into utterances and annotations, creating appropriate
	 * Utterance and DesignPoint objects.
	 * <p>
	 *
	 * It only keeps those annotations starting with the sequence ";##". All
	 * other annotations are ignored.
	 *
	 */
	public void refineComments() {
		final String nl = System.lineSeparator();
		if (!this.discussionObject.getComments().isEmpty()) {
			final HashSet<Participant> participantsInThisDiscussion = new HashSet<>();
			for (final Comment comment : this.discussionObject.getComments()) {
				
				log.info("Splitting comment " + comment.getId() + " to paragraphs");
				// Separate by looking for at least two consecutive newlines
				final String[] rawParagraphs = comment.getRawContent().split(nl + nl + "+");
				// Get rid of "paragraphs" only consisting of whitespace
				final ArrayList<String> paragraphs = new ArrayList<>();
				for (final String p : rawParagraphs) {
					if (!p.matches("\\s*")) {
						paragraphs.add(p);
					}
				}
				
				log.info("Parsing annotations for the paragraphs of comment " + comment.getId());
				for (final String paragraph : paragraphs) {
					final ArrayList<String> annotationBlock = new ArrayList<>();
					final ArrayList<String> rest = new ArrayList<>();
					for (final String line : paragraph.split(nl)) {
						if (line.startsWith(Gentlebot.ANNOTATION_PREFIX)) {
							annotationBlock.add(line);
						} else {
							rest.add(line);
						}
						
					}
					log.info("Creating one utterance for comment " + comment.getId());
					final Utterance utterance = DiscussionsFactory.eINSTANCE.createUtterance();
					utterance.setComment(comment);
					utterance.setContent(rest.stream().collect(Collectors.joining(nl)));
					final UtteranceDescription ud = DiscussionsFactory.eINSTANCE.createUtteranceDescription();
					utterance.setDescription(ud);
					// For non DP paragraphs, annotationBlock is empty
					this.designPointParser.parseAnnotationBlocks(utterance, annotationBlock, this.discussionObject);
					
					if (this.discussionObject.getInvitedUsernames().contains("@" + comment.getAuthor().getName())) {
						utterance.getDescription().setAuthorInvited(true);
					}
					checkIfAnyoneIsBeingInvited(utterance, participantsInThisDiscussion);
					participantsInThisDiscussion.add(comment.getAuthor());
				}
			}
		}
	}

	/**
	 * Purge lines that are not annotatable, i.e. things that cannot be
	 * utterances These include code, version control excerpts, commits,
	 * extraneous annotations (i.e., ones not starting with ;##).
	 * <p>
	 *
	 * Currently, it discards any lines NOT starting with:<br>
	 * <ul>
	 * <li>A text character or a digit</li>
	 * <li>The characters: @, " as they could be usernames or quotations</li>
	 * <li>The characters :, + in order to preserve ":+1:" comments</li>
	 * </ul>
	 *
	 * <p>
	 *
	 * @param participantsInThisDiscussion
	 *
	 * @param rawLinesWithoutAnnotations
	 *            A list of lines. The only assumption is that DPs have already
	 *            been parsed out and removed and mapped to lines with the
	 *            whatLineEachDesignPointAnnotates map
	 * @return The list "purged". Each purged line has been replaced with the
	 *         empty string ("") so that the map
	 *         whatLineEachDesignPointAnnotates still maps lines to DPs
	 *         correctly.
	 */
	private void checkIfAnyoneIsBeingInvited(Utterance utterance, HashSet<Participant> participantsInThisDiscussion) {

		final List<String> mentionedUsernames = new ArrayList<>();
		final Matcher m = Pattern.compile("@\\w+(-\\w+)*").matcher(utterance.getContent());
		while (m.find()) {
			mentionedUsernames.add(m.group());
		}
		for (final String us : mentionedUsernames) {
			boolean hasAppearedBefore = false;
			for (final Participant p : participantsInThisDiscussion) {
				if (p.getName().contentEquals(us)) {
					hasAppearedBefore = true;
				}
			}
			if (!hasAppearedBefore) {
				if (!this.discussionObject.getInvitedUsernames().contains(us)) {
					this.discussionObject.getInvitedUsernames().add(us);
				}
			}
		}
	}

}
