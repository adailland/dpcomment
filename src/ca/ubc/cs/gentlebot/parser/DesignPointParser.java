package ca.ubc.cs.gentlebot.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import ca.ubc.cs.gentlebot.Gentlebot;
import ca.ubc.cs.gentlebot.model.discussions.DesignPoint;
import ca.ubc.cs.gentlebot.model.discussions.Discussion;
import ca.ubc.cs.gentlebot.model.discussions.DiscussionsFactory;
import ca.ubc.cs.gentlebot.model.discussions.Form;
import ca.ubc.cs.gentlebot.model.discussions.Relationship;
import ca.ubc.cs.gentlebot.model.discussions.RelationshipType;
import ca.ubc.cs.gentlebot.model.discussions.Role;
import ca.ubc.cs.gentlebot.model.discussions.Sentiment;
import ca.ubc.cs.gentlebot.model.discussions.Utterance;

public class DesignPointParser {

	private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private String PREFIX = Gentlebot.ANNOTATION_PREFIX;

	private String ROLE;
	private String ROLE_OP;
	private String ROLE_MEMBER;
	private String ROLE_OTHER;

	private String INVITED;
	private String INVITED_YES;
	private String INVITED_NO;

	private String BEFORE_COMMITS;
	private String BEFORE_COMMITS_YES;
	private String BEFORE_COMMITS_NO;

	private String FORM;
	private String FORM_OPEN_QUESTION;
	private String FORM_ENUMERATION;
	private String FORM_SOLUTION;

	private String RELATIONSHIP;
	private String RELATIONSHIP_NEW;
	private String RELATIONSHIP_ELABORATES;
	private String RELATIONSHIP_GENERALIZES;
	private String RELATIONSHIP_REFRAMES;

	private String SENTIMENT;
	private String SENTIMENT_POSITIVE;
	private String SENTIMENT_NEGATIVE;
	private String SENTIMENT_NEUTRAL;

	public DesignPointParser() {
		log.info("Initializing Design Point Annotation Parser with the Codebook");
		Properties codebook = new Properties();
		String codebookFileName = "/codebook.properties";
		InputStream codebookStream = Gentlebot.class.getClass().getResourceAsStream(codebookFileName);
		if (codebookStream == null) {
			System.err.println("Could not locate the codebook file");
			return;
		}
		try {
			codebook.load(codebookStream);

			ROLE = codebook.getProperty("ROLE");
			ROLE_OP = codebook.getProperty("ROLE_OP");
			ROLE_MEMBER = codebook.getProperty("ROLE_MEMBER");
			ROLE_OTHER = codebook.getProperty("ROLE_OTHER");

			INVITED = codebook.getProperty("INVITED");
			INVITED_YES = codebook.getProperty("INVITED_YES");
			INVITED_NO = codebook.getProperty("INVITED_NO");

			BEFORE_COMMITS = codebook.getProperty("BEFORE_COMMITS");
			BEFORE_COMMITS_YES = codebook.getProperty("BEFORE_COMMITS_YES");
			BEFORE_COMMITS_NO = codebook.getProperty("BEFORE_COMMITS_NO");

			FORM = codebook.getProperty("FORM");
			FORM_OPEN_QUESTION = codebook.getProperty("FORM_OPEN_QUESTION");
			FORM_ENUMERATION = codebook.getProperty("FORM_ENUMERATION");
			FORM_SOLUTION = codebook.getProperty("FORM_SOLUTION");

			RELATIONSHIP = codebook.getProperty("RELATIONSHIP");
			RELATIONSHIP_NEW = codebook.getProperty("RELATIONSHIP_NEW");
			RELATIONSHIP_ELABORATES = codebook.getProperty("RELATIONSHIP_ELABORATES");
			RELATIONSHIP_GENERALIZES = codebook.getProperty("RELATIONSHIP_GENERALIZES");
			RELATIONSHIP_REFRAMES = codebook.getProperty("RELATIONSHIP_REFRAMES");

			SENTIMENT = codebook.getProperty("SENTIMENT");
			SENTIMENT_POSITIVE = codebook.getProperty("SENTIMENT_POSITIVE");
			SENTIMENT_NEGATIVE = codebook.getProperty("SENTIMENT_NEGATIVE");
			SENTIMENT_NEUTRAL = codebook.getProperty("SENTIMENT_NEUTRAL");
		} catch (IOException e) {
			log.severe("Failed to load codebook from file. " + e.getMessage());
			return;
		}
	}

	/**
	 * 
	 * Parses an annotation block into DesignPoint objects.
	 * 
	 * 
	 * @param comment
	 *            the utterance which the annotationBlock was found
	 * @param annotationBlock
	 *            a list of ;## annotations.
	 * @param discussionObject
	 *            where everything takes place
	 */
	public void parseAnnotationBlocks(Utterance utterance, ArrayList<String> annotationBlock,
			Discussion discussionObject) {

		// Nothing to do if it doesn't have any design points
		if (annotationBlock.isEmpty())
			return;

		// Find the starting index of each DP in the annotationBlock
		Vector<Integer> dpBlockStartingIndices = new Vector<Integer>();
		for (int i = 0; i < annotationBlock.size(); i++)
			if (annotationBlock.get(i).startsWith(PREFIX + "D"))
				dpBlockStartingIndices.add(i);

		// split the annotationBlock into sublists, each with one DP
		List<List<String>> distinctDPs = new Vector<List<String>>();
		for (int j = 0; j < dpBlockStartingIndices.size(); j++) {
			int from = dpBlockStartingIndices.get(j);
			int to;
			if (j + 1 > dpBlockStartingIndices.size()){
				to = dpBlockStartingIndices.get(j + 1) - 1;
			}else{
				to = annotationBlock.size() - 1;
			}
			distinctDPs.add(annotationBlock.subList(from, to));
		}
		for (List<String> oneDP : distinctDPs)
			try {
				parseOneBlock(utterance, oneDP, discussionObject);
			} catch (UnknownTagException e) {
				log.warning("Error parsing comment " + utterance.getComment().getId() + ": " + e.getMessage());
			}
	}

	/**
	 * Parse a single block, containing info about exactly one DP. Possible
	 * annotations:
	 * 
	 * <pre>
	 *	;##D[id] [summary]
	 *	;##ROLE OP
	 *	;##ROLE PM
	 *	;##ROLE ETC
	 *	;##INV  T
	 *	;##INV  F
	 *	;##BCOM T
	 *	;##BCOM F
	 *	;##FORM OPQ
	 *	;##FORM ENU
	 *	;##FORM SOL
	 *	;##REL  NEW
	 *	;##REL  ELAB D[id]
	 *	;##REL  GEN D[id]
	 *	;##REL  REFR D[id]
	 *	;##SEN  POS
	 *	;##SEN  NEG
	 *	;##SEN  NEU
	 * </pre>
	 * 
	 * @param utterance
	 *            that the DP is about
	 * @param annotation
	 *            the lines comprising annotations about a single DP
	 * @param discussionObject
	 *            where everything takes place
	 * @throws UnknownTagException
	 *             if asked to parse a tag not in the codebook
	 */
	private void parseOneBlock(Utterance utterance, List<String> annotation, Discussion discussionObject)
			throws UnknownTagException {
		DesignPoint dp = DiscussionsFactory.eINSTANCE.createDesignPoint();

		String s = "\\s*";
		dp.setId(Integer.valueOf(annotation.get(0).split("D| ")[1]));
		dp.setSummary(annotation.get(0));
		utterance.getDescription().getDesignPoints().add(dp);

		for (String line : annotation)
			if (line.matches(PREFIX + ROLE + s + ROLE_OP))
				dp.getRole().add(Role.ORIGINAL);
			else if (line.matches(PREFIX + ROLE + s + ROLE_MEMBER))
				dp.getRole().add(Role.CORE);
			else if (line.matches(PREFIX + ROLE + s + ROLE_OTHER))
				dp.getRole().add(Role.OTHER);
			else if (line.matches(PREFIX + INVITED + s + INVITED_YES))
				dp.getUtteranceDescription().setAuthorInvited(true);
			else if (line.matches(PREFIX + INVITED + s + INVITED_NO))
				dp.getUtteranceDescription().setAuthorInvited(false);
			else if (line.matches(PREFIX + BEFORE_COMMITS + s + BEFORE_COMMITS_YES))
				dp.setPostedBeforeCommits(true);
			else if (line.matches(PREFIX + BEFORE_COMMITS + s + BEFORE_COMMITS_NO))
				dp.setPostedBeforeCommits(false);
			else if (line.matches(PREFIX + FORM + s + FORM_OPEN_QUESTION))
				dp.setForm(Form.OPEN_QUESTION);
			else if (line.matches(PREFIX + FORM + s + FORM_ENUMERATION))
				dp.setForm(Form.CANDIDATE_ENUMERATION);
			else if (line.matches(PREFIX + FORM + s + FORM_SOLUTION))
				dp.setForm(Form.SOLUTION);
			else if (line.matches(PREFIX + SENTIMENT + s + SENTIMENT_POSITIVE))
				dp.setSentiment(Sentiment.POSITIVE);
			else if (line.matches(PREFIX + SENTIMENT + s + SENTIMENT_NEGATIVE))
				dp.setSentiment(Sentiment.NEGATIVE);
			else if (line.matches(PREFIX + SENTIMENT + s + SENTIMENT_NEUTRAL))
				dp.setSentiment(Sentiment.NEUTRAL);
			else if (line.matches(PREFIX + RELATIONSHIP + s + RELATIONSHIP_ELABORATES + s + "D\\d*"))
				createTargetedRelationship(line, dp, RelationshipType.ELABORATES, discussionObject);
			else if (line.matches(PREFIX + RELATIONSHIP + s + RELATIONSHIP_GENERALIZES + s + "D\\d*"))
				createTargetedRelationship(line, dp, RelationshipType.GENERALIZES, discussionObject);
			else if (line.matches(PREFIX + RELATIONSHIP + s + RELATIONSHIP_REFRAMES + s + "D\\d*"))
				createTargetedRelationship(line, dp, RelationshipType.REFRAMES, discussionObject);
			else if (line.matches(PREFIX + RELATIONSHIP + s + RELATIONSHIP_NEW)) {
				Relationship r = DiscussionsFactory.eINSTANCE.createRelationship();
				r.setType(RelationshipType.NEW);
				dp.getRelationship().add(r);
			} else if (line.startsWith(PREFIX + "D")) {
				// This is just the DP declaration line, nothing to do
			} else
				throw new UnknownTagException("Unknown annotation: " + line);

	}

	private void createTargetedRelationship(String line, DesignPoint dp, RelationshipType rtype,
			Discussion discussionObject) {
		Relationship r = DiscussionsFactory.eINSTANCE.createRelationship();
		r.setType(rtype);
		try {
			int targetID = Integer.valueOf(line.split("D")[1]);
			r.setTarget(this.findDesignPoint(targetID, discussionObject));
		} catch (UnknownTargetDPException e) {
			log.warning(e.getMessage());
		}
		dp.getRelationship().add(r);
	}

	private DesignPoint findDesignPoint(int targetID, Discussion discussionObject) throws UnknownTargetDPException {
		for (DesignPoint d : discussionObject.getAllDesignPoints())
			if (d.getId() == targetID)
				return d;
		throw new UnknownTargetDPException("Cannot find DP with ID: " + targetID + ". Known DP IDs: "
				+ discussionObject.getAllDesignPoints().stream().map(x -> x.getId()).collect(Collectors.toList()));
	}

}
