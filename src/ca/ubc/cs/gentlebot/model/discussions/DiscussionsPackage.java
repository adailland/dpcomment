/**
 */
package ca.ubc.cs.gentlebot.model.discussions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsFactory
 * @model kind="package"
 * @generated
 */
public interface DiscussionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "discussions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ubc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ubc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiscussionsPackage eINSTANCE = ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionImpl <em>Discussion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionImpl
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getDiscussion()
	 * @generated
	 */
	int DISCUSSION = 0;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION__PARTICIPANTS = 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION__COMMENTS = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Invited Usernames</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION__INVITED_USERNAMES = 3;

	/**
	 * The number of structural features of the '<em>Discussion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION___TO_STRING = 0;

	/**
	 * The operation id for the '<em>To ARFF</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION___TO_ARFF = 1;

	/**
	 * The operation id for the '<em>Get All Utterances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION___GET_ALL_UTTERANCES = 2;

	/**
	 * The operation id for the '<em>Get All Design Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION___GET_ALL_DESIGN_POINTS = 3;

	/**
	 * The number of operations of the '<em>Discussion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.ubc.cs.gentlebot.model.discussions.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.ParticipantImpl
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__MEMBER = 1;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT___TO_STRING = 0;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.ubc.cs.gentlebot.model.discussions.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.CommentImpl
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Raw Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__RAW_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NEXT = 2;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PREVIOUS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ID = 4;

	/**
	 * The feature id for the '<em><b>Utterances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__UTTERANCES = 5;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT___TO_STRING = 0;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 1;


	/**
	 * The meta object id for the '{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl <em>Utterance Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getUtteranceDescription()
	 * @generated
	 */
	int UTTERANCE_DESCRIPTION = 5;

	/**
	 * The meta object id for the '{@link ca.ubc.cs.gentlebot.model.discussions.impl.DesignPointImpl <em>Design Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DesignPointImpl
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getDesignPoint()
	 * @generated
	 */
	int DESIGN_POINT = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_POINT__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_POINT__FORM = 1;

	/**
	 * The feature id for the '<em><b>Sentiment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_POINT__SENTIMENT = 2;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_POINT__SUMMARY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_POINT__ID = 4;


	/**
	 * The feature id for the '<em><b>Utterance Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_POINT__UTTERANCE_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_POINT__RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Posted Before Commits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_POINT__POSTED_BEFORE_COMMITS = 7;

	/**
	 * The number of structural features of the '<em>Design Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_POINT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Design Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_POINT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceImpl <em>Utterance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceImpl
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getUtterance()
	 * @generated
	 */
	int UTTERANCE = 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Utterance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Utterance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Utterance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__UTTERANCE = 0;

	/**
	 * The feature id for the '<em><b>Tfidf Vector</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__TFIDF_VECTOR = 1;

	/**
	 * The feature id for the '<em><b>Author Is Project Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__AUTHOR_IS_PROJECT_MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Number Of Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__NUMBER_OF_WORDS = 3;

	/**
	 * The feature id for the '<em><b>Comments So Far</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__COMMENTS_SO_FAR = 4;

	/**
	 * The feature id for the '<em><b>All Utterances So Far</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__ALL_UTTERANCES_SO_FAR = 5;

	/**
	 * The feature id for the '<em><b>Utterances In Comment So Far</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__UTTERANCES_IN_COMMENT_SO_FAR = 6;

	/**
	 * The feature id for the '<em><b>Uttered By Original Poster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__UTTERED_BY_ORIGINAL_POSTER = 7;

	/**
	 * The feature id for the '<em><b>Has Capitalized Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__HAS_CAPITALIZED_WORD = 8;

	/**
	 * The feature id for the '<em><b>Contains Should</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__CONTAINS_SHOULD = 9;

	/**
	 * The feature id for the '<em><b>Topic Vector</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__TOPIC_VECTOR = 10;

	/**
	 * The feature id for the '<em><b>Design Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__DESIGN_POINTS = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__NAME = 12;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__CONTENT = 13;

	/**
	 * The feature id for the '<em><b>Author Invited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION__AUTHOR_INVITED = 14;

	/**
	 * The number of structural features of the '<em>Utterance Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Utterance Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ubc.cs.gentlebot.model.discussions.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ubc.cs.gentlebot.model.discussions.Role
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 7;

	/**
	 * The meta object id for the '{@link ca.ubc.cs.gentlebot.model.discussions.Form <em>Form</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ubc.cs.gentlebot.model.discussions.Form
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 8;

	/**
	 * The meta object id for the '{@link ca.ubc.cs.gentlebot.model.discussions.Sentiment <em>Sentiment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ubc.cs.gentlebot.model.discussions.Sentiment
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getSentiment()
	 * @generated
	 */
	int SENTIMENT = 9;

	/**
	 * The meta object id for the '{@link ca.ubc.cs.gentlebot.model.discussions.RelationshipType <em>Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ubc.cs.gentlebot.model.discussions.RelationshipType
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 10;

	/**
	 * The meta object id for the '{@link ca.ubc.cs.gentlebot.model.discussions.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.RelationshipImpl
	 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 6;


	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Designpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DESIGNPOINT = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ca.ubc.cs.gentlebot.model.discussions.Discussion <em>Discussion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discussion</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Discussion
	 * @generated
	 */
	EClass getDiscussion();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ubc.cs.gentlebot.model.discussions.Discussion#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Discussion#getParticipants()
	 * @see #getDiscussion()
	 * @generated
	 */
	EReference getDiscussion_Participants();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ubc.cs.gentlebot.model.discussions.Discussion#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Discussion#getComments()
	 * @see #getDiscussion()
	 * @generated
	 */
	EReference getDiscussion_Comments();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.Discussion#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Discussion#getTitle()
	 * @see #getDiscussion()
	 * @generated
	 */
	EAttribute getDiscussion_Title();

	/**
	 * Returns the meta object for the attribute list '{@link ca.ubc.cs.gentlebot.model.discussions.Discussion#getInvitedUsernames <em>Invited Usernames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Invited Usernames</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Discussion#getInvitedUsernames()
	 * @see #getDiscussion()
	 * @generated
	 */
	EAttribute getDiscussion_InvitedUsernames();

	/**
	 * Returns the meta object for the '{@link ca.ubc.cs.gentlebot.model.discussions.Discussion#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Discussion#toString()
	 * @generated
	 */
	EOperation getDiscussion__ToString();

	/**
	 * Returns the meta object for the '{@link ca.ubc.cs.gentlebot.model.discussions.Discussion#toARFF() <em>To ARFF</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To ARFF</em>' operation.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Discussion#toARFF()
	 * @generated
	 */
	EOperation getDiscussion__ToARFF();

	/**
	 * Returns the meta object for the '{@link ca.ubc.cs.gentlebot.model.discussions.Discussion#getAllUtterances() <em>Get All Utterances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Utterances</em>' operation.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Discussion#getAllUtterances()
	 * @generated
	 */
	EOperation getDiscussion__GetAllUtterances();

	/**
	 * Returns the meta object for the '{@link ca.ubc.cs.gentlebot.model.discussions.Discussion#getAllDesignPoints() <em>Get All Design Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Design Points</em>' operation.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Discussion#getAllDesignPoints()
	 * @generated
	 */
	EOperation getDiscussion__GetAllDesignPoints();

	/**
	 * Returns the meta object for class '{@link ca.ubc.cs.gentlebot.model.discussions.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.Participant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Participant#getName()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Name();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.Participant#isMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Participant#isMember()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Member();

	/**
	 * Returns the meta object for the '{@link ca.ubc.cs.gentlebot.model.discussions.Participant#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Participant#toString()
	 * @generated
	 */
	EOperation getParticipant__ToString();

	/**
	 * Returns the meta object for class '{@link ca.ubc.cs.gentlebot.model.discussions.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the reference '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Comment#getAuthor()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Author();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getRawContent <em>Raw Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Content</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Comment#getRawContent()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_RawContent();

	/**
	 * Returns the meta object for the reference '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Comment#getNext()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Next();

	/**
	 * Returns the meta object for the reference '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Comment#getPrevious()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Previous();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Comment#getId()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Id();

	/**
	 * Returns the meta object for the reference list '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getUtterances <em>Utterances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Utterances</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Comment#getUtterances()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Utterances();

	/**
	 * Returns the meta object for the '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Comment#toString()
	 * @generated
	 */
	EOperation getComment__ToString();

	/**
	 * Returns the meta object for class '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint <em>Design Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Point</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DesignPoint
	 * @generated
	 */
	EClass getDesignPoint();

	/**
	 * Returns the meta object for the attribute list '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getRole()
	 * @see #getDesignPoint()
	 * @generated
	 */
	EAttribute getDesignPoint_Role();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getForm()
	 * @see #getDesignPoint()
	 * @generated
	 */
	EAttribute getDesignPoint_Form();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getSentiment <em>Sentiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sentiment</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getSentiment()
	 * @see #getDesignPoint()
	 * @generated
	 */
	EAttribute getDesignPoint_Sentiment();

	/**
	 * Returns the meta object for the reference list '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relationship</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getRelationship()
	 * @see #getDesignPoint()
	 * @generated
	 */
	EReference getDesignPoint_Relationship();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#isPostedBeforeCommits <em>Posted Before Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted Before Commits</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DesignPoint#isPostedBeforeCommits()
	 * @see #getDesignPoint()
	 * @generated
	 */
	EAttribute getDesignPoint_PostedBeforeCommits();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getSummary()
	 * @see #getDesignPoint()
	 * @generated
	 */
	EAttribute getDesignPoint_Summary();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getId()
	 * @see #getDesignPoint()
	 * @generated
	 */
	EAttribute getDesignPoint_Id();

	/**
	 * Returns the meta object for the reference '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getUtteranceDescription <em>Utterance Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Utterance Description</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getUtteranceDescription()
	 * @see #getDesignPoint()
	 * @generated
	 */
	EReference getDesignPoint_UtteranceDescription();

	/**
	 * Returns the meta object for class '{@link ca.ubc.cs.gentlebot.model.discussions.Utterance <em>Utterance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utterance</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Utterance
	 * @generated
	 */
	EClass getUtterance();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.Utterance#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Utterance#getContent()
	 * @see #getUtterance()
	 * @generated
	 */
	EAttribute getUtterance_Content();

	/**
	 * Returns the meta object for the reference '{@link ca.ubc.cs.gentlebot.model.discussions.Utterance#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comment</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Utterance#getComment()
	 * @see #getUtterance()
	 * @generated
	 */
	EReference getUtterance_Comment();

	/**
	 * Returns the meta object for the reference '{@link ca.ubc.cs.gentlebot.model.discussions.Utterance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Utterance#getDescription()
	 * @see #getUtterance()
	 * @generated
	 */
	EReference getUtterance_Description();

	/**
	 * Returns the meta object for class '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription <em>Utterance Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utterance Description</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription
	 * @generated
	 */
	EClass getUtteranceDescription();

	/**
	 * Returns the meta object for the reference '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getUtterance <em>Utterance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Utterance</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getUtterance()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EReference getUtteranceDescription_Utterance();

	/**
	 * Returns the meta object for the attribute list '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getTfidfVector <em>Tfidf Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tfidf Vector</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getTfidfVector()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EAttribute getUtteranceDescription_TfidfVector();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isAuthorIsProjectMember <em>Author Is Project Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Is Project Member</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isAuthorIsProjectMember()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EAttribute getUtteranceDescription_AuthorIsProjectMember();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getNumberOfWords <em>Number Of Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Words</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getNumberOfWords()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EAttribute getUtteranceDescription_NumberOfWords();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getCommentsSoFar <em>Comments So Far</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments So Far</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getCommentsSoFar()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EAttribute getUtteranceDescription_CommentsSoFar();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getAllUtterancesSoFar <em>All Utterances So Far</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Utterances So Far</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getAllUtterancesSoFar()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EAttribute getUtteranceDescription_AllUtterancesSoFar();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getUtterancesInCommentSoFar <em>Utterances In Comment So Far</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utterances In Comment So Far</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getUtterancesInCommentSoFar()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EAttribute getUtteranceDescription_UtterancesInCommentSoFar();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isUtteredByOriginalPoster <em>Uttered By Original Poster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uttered By Original Poster</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isUtteredByOriginalPoster()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EAttribute getUtteranceDescription_UtteredByOriginalPoster();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isHasCapitalizedWord <em>Has Capitalized Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Capitalized Word</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isHasCapitalizedWord()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EAttribute getUtteranceDescription_HasCapitalizedWord();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isContainsShould <em>Contains Should</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contains Should</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isContainsShould()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EAttribute getUtteranceDescription_ContainsShould();

	/**
	 * Returns the meta object for the attribute list '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getTopicVector <em>Topic Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Topic Vector</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getTopicVector()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EAttribute getUtteranceDescription_TopicVector();

	/**
	 * Returns the meta object for the reference list '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getDesignPoints <em>Design Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Points</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getDesignPoints()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EReference getUtteranceDescription_DesignPoints();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getName()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EAttribute getUtteranceDescription_Name();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getContent()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EAttribute getUtteranceDescription_Content();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isAuthorInvited <em>Author Invited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Invited</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isAuthorInvited()
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	EAttribute getUtteranceDescription_AuthorInvited();

	/**
	 * Returns the meta object for enum '{@link ca.ubc.cs.gentlebot.model.discussions.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Role
	 * @generated
	 */
	EEnum getRole();

	/**
	 * Returns the meta object for enum '{@link ca.ubc.cs.gentlebot.model.discussions.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Form</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Form
	 * @generated
	 */
	EEnum getForm();

	/**
	 * Returns the meta object for enum '{@link ca.ubc.cs.gentlebot.model.discussions.Sentiment <em>Sentiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sentiment</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Sentiment
	 * @generated
	 */
	EEnum getSentiment();

	/**
	 * Returns the meta object for enum '{@link ca.ubc.cs.gentlebot.model.discussions.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.RelationshipType
	 * @generated
	 */
	EEnum getRelationshipType();

	/**
	 * Returns the meta object for class '{@link ca.ubc.cs.gentlebot.model.discussions.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link ca.ubc.cs.gentlebot.model.discussions.Relationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Relationship#getType()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Type();

	/**
	 * Returns the meta object for the reference '{@link ca.ubc.cs.gentlebot.model.discussions.Relationship#getDesignpoint <em>Designpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Designpoint</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Relationship#getDesignpoint()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Designpoint();

	/**
	 * Returns the meta object for the reference '{@link ca.ubc.cs.gentlebot.model.discussions.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiscussionsFactory getDiscussionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionImpl <em>Discussion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionImpl
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getDiscussion()
		 * @generated
		 */
		EClass DISCUSSION = eINSTANCE.getDiscussion();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCUSSION__PARTICIPANTS = eINSTANCE.getDiscussion_Participants();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCUSSION__COMMENTS = eINSTANCE.getDiscussion_Comments();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION__TITLE = eINSTANCE.getDiscussion_Title();

		/**
		 * The meta object literal for the '<em><b>Invited Usernames</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION__INVITED_USERNAMES = eINSTANCE.getDiscussion_InvitedUsernames();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCUSSION___TO_STRING = eINSTANCE.getDiscussion__ToString();

		/**
		 * The meta object literal for the '<em><b>To ARFF</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCUSSION___TO_ARFF = eINSTANCE.getDiscussion__ToARFF();

		/**
		 * The meta object literal for the '<em><b>Get All Utterances</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCUSSION___GET_ALL_UTTERANCES = eINSTANCE.getDiscussion__GetAllUtterances();

		/**
		 * The meta object literal for the '<em><b>Get All Design Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCUSSION___GET_ALL_DESIGN_POINTS = eINSTANCE.getDiscussion__GetAllDesignPoints();

		/**
		 * The meta object literal for the '{@link ca.ubc.cs.gentlebot.model.discussions.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.ParticipantImpl
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__NAME = eINSTANCE.getParticipant_Name();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__MEMBER = eINSTANCE.getParticipant_Member();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTICIPANT___TO_STRING = eINSTANCE.getParticipant__ToString();

		/**
		 * The meta object literal for the '{@link ca.ubc.cs.gentlebot.model.discussions.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.CommentImpl
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__AUTHOR = eINSTANCE.getComment_Author();

		/**
		 * The meta object literal for the '<em><b>Raw Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__RAW_CONTENT = eINSTANCE.getComment_RawContent();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__NEXT = eINSTANCE.getComment_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__PREVIOUS = eINSTANCE.getComment_Previous();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__ID = eINSTANCE.getComment_Id();

		/**
		 * The meta object literal for the '<em><b>Utterances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__UTTERANCES = eINSTANCE.getComment_Utterances();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMENT___TO_STRING = eINSTANCE.getComment__ToString();

		/**
		 * The meta object literal for the '{@link ca.ubc.cs.gentlebot.model.discussions.impl.DesignPointImpl <em>Design Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DesignPointImpl
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getDesignPoint()
		 * @generated
		 */
		EClass DESIGN_POINT = eINSTANCE.getDesignPoint();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_POINT__ROLE = eINSTANCE.getDesignPoint_Role();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_POINT__FORM = eINSTANCE.getDesignPoint_Form();

		/**
		 * The meta object literal for the '<em><b>Sentiment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_POINT__SENTIMENT = eINSTANCE.getDesignPoint_Sentiment();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_POINT__RELATIONSHIP = eINSTANCE.getDesignPoint_Relationship();

		/**
		 * The meta object literal for the '<em><b>Posted Before Commits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_POINT__POSTED_BEFORE_COMMITS = eINSTANCE.getDesignPoint_PostedBeforeCommits();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_POINT__SUMMARY = eINSTANCE.getDesignPoint_Summary();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_POINT__ID = eINSTANCE.getDesignPoint_Id();

		/**
		 * The meta object literal for the '<em><b>Utterance Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_POINT__UTTERANCE_DESCRIPTION = eINSTANCE.getDesignPoint_UtteranceDescription();

		/**
		 * The meta object literal for the '{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceImpl <em>Utterance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceImpl
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getUtterance()
		 * @generated
		 */
		EClass UTTERANCE = eINSTANCE.getUtterance();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE__CONTENT = eINSTANCE.getUtterance_Content();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTTERANCE__COMMENT = eINSTANCE.getUtterance_Comment();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTTERANCE__DESCRIPTION = eINSTANCE.getUtterance_Description();

		/**
		 * The meta object literal for the '{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl <em>Utterance Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getUtteranceDescription()
		 * @generated
		 */
		EClass UTTERANCE_DESCRIPTION = eINSTANCE.getUtteranceDescription();

		/**
		 * The meta object literal for the '<em><b>Utterance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTTERANCE_DESCRIPTION__UTTERANCE = eINSTANCE.getUtteranceDescription_Utterance();

		/**
		 * The meta object literal for the '<em><b>Tfidf Vector</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE_DESCRIPTION__TFIDF_VECTOR = eINSTANCE.getUtteranceDescription_TfidfVector();

		/**
		 * The meta object literal for the '<em><b>Author Is Project Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE_DESCRIPTION__AUTHOR_IS_PROJECT_MEMBER = eINSTANCE.getUtteranceDescription_AuthorIsProjectMember();

		/**
		 * The meta object literal for the '<em><b>Number Of Words</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE_DESCRIPTION__NUMBER_OF_WORDS = eINSTANCE.getUtteranceDescription_NumberOfWords();

		/**
		 * The meta object literal for the '<em><b>Comments So Far</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE_DESCRIPTION__COMMENTS_SO_FAR = eINSTANCE.getUtteranceDescription_CommentsSoFar();

		/**
		 * The meta object literal for the '<em><b>All Utterances So Far</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE_DESCRIPTION__ALL_UTTERANCES_SO_FAR = eINSTANCE.getUtteranceDescription_AllUtterancesSoFar();

		/**
		 * The meta object literal for the '<em><b>Utterances In Comment So Far</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE_DESCRIPTION__UTTERANCES_IN_COMMENT_SO_FAR = eINSTANCE.getUtteranceDescription_UtterancesInCommentSoFar();

		/**
		 * The meta object literal for the '<em><b>Uttered By Original Poster</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE_DESCRIPTION__UTTERED_BY_ORIGINAL_POSTER = eINSTANCE.getUtteranceDescription_UtteredByOriginalPoster();

		/**
		 * The meta object literal for the '<em><b>Has Capitalized Word</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE_DESCRIPTION__HAS_CAPITALIZED_WORD = eINSTANCE.getUtteranceDescription_HasCapitalizedWord();

		/**
		 * The meta object literal for the '<em><b>Contains Should</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE_DESCRIPTION__CONTAINS_SHOULD = eINSTANCE.getUtteranceDescription_ContainsShould();

		/**
		 * The meta object literal for the '<em><b>Topic Vector</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE_DESCRIPTION__TOPIC_VECTOR = eINSTANCE.getUtteranceDescription_TopicVector();

		/**
		 * The meta object literal for the '<em><b>Design Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTTERANCE_DESCRIPTION__DESIGN_POINTS = eINSTANCE.getUtteranceDescription_DesignPoints();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE_DESCRIPTION__NAME = eINSTANCE.getUtteranceDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE_DESCRIPTION__CONTENT = eINSTANCE.getUtteranceDescription_Content();

		/**
		 * The meta object literal for the '<em><b>Author Invited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE_DESCRIPTION__AUTHOR_INVITED = eINSTANCE.getUtteranceDescription_AuthorInvited();

		/**
		 * The meta object literal for the '{@link ca.ubc.cs.gentlebot.model.discussions.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ubc.cs.gentlebot.model.discussions.Role
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link ca.ubc.cs.gentlebot.model.discussions.Form <em>Form</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ubc.cs.gentlebot.model.discussions.Form
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getForm()
		 * @generated
		 */
		EEnum FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '{@link ca.ubc.cs.gentlebot.model.discussions.Sentiment <em>Sentiment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ubc.cs.gentlebot.model.discussions.Sentiment
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getSentiment()
		 * @generated
		 */
		EEnum SENTIMENT = eINSTANCE.getSentiment();

		/**
		 * The meta object literal for the '{@link ca.ubc.cs.gentlebot.model.discussions.RelationshipType <em>Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ubc.cs.gentlebot.model.discussions.RelationshipType
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getRelationshipType()
		 * @generated
		 */
		EEnum RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '{@link ca.ubc.cs.gentlebot.model.discussions.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.RelationshipImpl
		 * @see ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

		/**
		 * The meta object literal for the '<em><b>Designpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__DESIGNPOINT = eINSTANCE.getRelationship_Designpoint();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

	}

} //DiscussionsPackage
