/**
 */
package ca.ubc.cs.gentlebot.model.discussions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.ubc.cs.gentlebot.model.discussions.Comment;
import ca.ubc.cs.gentlebot.model.discussions.DesignPoint;
import ca.ubc.cs.gentlebot.model.discussions.Discussion;
import ca.ubc.cs.gentlebot.model.discussions.DiscussionsFactory;
import ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage;
import ca.ubc.cs.gentlebot.model.discussions.Form;
import ca.ubc.cs.gentlebot.model.discussions.Participant;
import ca.ubc.cs.gentlebot.model.discussions.Relationship;
import ca.ubc.cs.gentlebot.model.discussions.RelationshipType;
import ca.ubc.cs.gentlebot.model.discussions.Role;
import ca.ubc.cs.gentlebot.model.discussions.Sentiment;
import ca.ubc.cs.gentlebot.model.discussions.Utterance;
import ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscussionsPackageImpl extends EPackageImpl implements DiscussionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discussionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utteranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utteranceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sentimentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationshipTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiscussionsPackageImpl() {
		super(eNS_URI, DiscussionsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DiscussionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiscussionsPackage init() {
		if (isInited) return (DiscussionsPackage)EPackage.Registry.INSTANCE.getEPackage(DiscussionsPackage.eNS_URI);

		// Obtain or create and register package
		DiscussionsPackageImpl theDiscussionsPackage = (DiscussionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiscussionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiscussionsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDiscussionsPackage.createPackageContents();

		// Initialize created meta-data
		theDiscussionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiscussionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiscussionsPackage.eNS_URI, theDiscussionsPackage);
		return theDiscussionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscussion() {
		return discussionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscussion_Participants() {
		return (EReference)discussionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscussion_Comments() {
		return (EReference)discussionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussion_Title() {
		return (EAttribute)discussionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussion_InvitedUsernames() {
		return (EAttribute)discussionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiscussion__ToString() {
		return discussionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiscussion__ToARFF() {
		return discussionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiscussion__GetAllUtterances() {
		return discussionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiscussion__GetAllDesignPoints() {
		return discussionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipant_Name() {
		return (EAttribute)participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipant_Member() {
		return (EAttribute)participantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipant__ToString() {
		return participantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_Author() {
		return (EReference)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_RawContent() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_Next() {
		return (EReference)commentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_Previous() {
		return (EReference)commentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Id() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_Utterances() {
		return (EReference)commentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComment__ToString() {
		return commentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignPoint() {
		return designPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignPoint_Role() {
		return (EAttribute)designPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignPoint_Form() {
		return (EAttribute)designPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignPoint_Sentiment() {
		return (EAttribute)designPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignPoint_Relationship() {
		return (EReference)designPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignPoint_PostedBeforeCommits() {
		return (EAttribute)designPointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignPoint_Summary() {
		return (EAttribute)designPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignPoint_Id() {
		return (EAttribute)designPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignPoint_UtteranceDescription() {
		return (EReference)designPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtterance() {
		return utteranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtterance_Content() {
		return (EAttribute)utteranceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtterance_Comment() {
		return (EReference)utteranceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtterance_Description() {
		return (EReference)utteranceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtteranceDescription() {
		return utteranceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtteranceDescription_Utterance() {
		return (EReference)utteranceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtteranceDescription_TfidfVector() {
		return (EAttribute)utteranceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtteranceDescription_AuthorIsProjectMember() {
		return (EAttribute)utteranceDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtteranceDescription_NumberOfWords() {
		return (EAttribute)utteranceDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtteranceDescription_CommentsSoFar() {
		return (EAttribute)utteranceDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtteranceDescription_AllUtterancesSoFar() {
		return (EAttribute)utteranceDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtteranceDescription_UtterancesInCommentSoFar() {
		return (EAttribute)utteranceDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtteranceDescription_UtteredByOriginalPoster() {
		return (EAttribute)utteranceDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtteranceDescription_HasCapitalizedWord() {
		return (EAttribute)utteranceDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtteranceDescription_ContainsShould() {
		return (EAttribute)utteranceDescriptionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtteranceDescription_TopicVector() {
		return (EAttribute)utteranceDescriptionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtteranceDescription_DesignPoints() {
		return (EReference)utteranceDescriptionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtteranceDescription_Name() {
		return (EAttribute)utteranceDescriptionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtteranceDescription_Content() {
		return (EAttribute)utteranceDescriptionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtteranceDescription_AuthorInvited() {
		return (EAttribute)utteranceDescriptionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRole() {
		return roleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getForm() {
		return formEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSentiment() {
		return sentimentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationshipType() {
		return relationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Type() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Designpoint() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscussionsFactory getDiscussionsFactory() {
		return (DiscussionsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		discussionEClass = createEClass(DISCUSSION);
		createEReference(discussionEClass, DISCUSSION__PARTICIPANTS);
		createEReference(discussionEClass, DISCUSSION__COMMENTS);
		createEAttribute(discussionEClass, DISCUSSION__TITLE);
		createEAttribute(discussionEClass, DISCUSSION__INVITED_USERNAMES);
		createEOperation(discussionEClass, DISCUSSION___TO_STRING);
		createEOperation(discussionEClass, DISCUSSION___TO_ARFF);
		createEOperation(discussionEClass, DISCUSSION___GET_ALL_UTTERANCES);
		createEOperation(discussionEClass, DISCUSSION___GET_ALL_DESIGN_POINTS);

		participantEClass = createEClass(PARTICIPANT);
		createEAttribute(participantEClass, PARTICIPANT__NAME);
		createEAttribute(participantEClass, PARTICIPANT__MEMBER);
		createEOperation(participantEClass, PARTICIPANT___TO_STRING);

		commentEClass = createEClass(COMMENT);
		createEReference(commentEClass, COMMENT__AUTHOR);
		createEAttribute(commentEClass, COMMENT__RAW_CONTENT);
		createEReference(commentEClass, COMMENT__NEXT);
		createEReference(commentEClass, COMMENT__PREVIOUS);
		createEAttribute(commentEClass, COMMENT__ID);
		createEReference(commentEClass, COMMENT__UTTERANCES);
		createEOperation(commentEClass, COMMENT___TO_STRING);

		designPointEClass = createEClass(DESIGN_POINT);
		createEAttribute(designPointEClass, DESIGN_POINT__ROLE);
		createEAttribute(designPointEClass, DESIGN_POINT__FORM);
		createEAttribute(designPointEClass, DESIGN_POINT__SENTIMENT);
		createEAttribute(designPointEClass, DESIGN_POINT__SUMMARY);
		createEAttribute(designPointEClass, DESIGN_POINT__ID);
		createEReference(designPointEClass, DESIGN_POINT__UTTERANCE_DESCRIPTION);
		createEReference(designPointEClass, DESIGN_POINT__RELATIONSHIP);
		createEAttribute(designPointEClass, DESIGN_POINT__POSTED_BEFORE_COMMITS);

		utteranceEClass = createEClass(UTTERANCE);
		createEAttribute(utteranceEClass, UTTERANCE__CONTENT);
		createEReference(utteranceEClass, UTTERANCE__COMMENT);
		createEReference(utteranceEClass, UTTERANCE__DESCRIPTION);

		utteranceDescriptionEClass = createEClass(UTTERANCE_DESCRIPTION);
		createEReference(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__UTTERANCE);
		createEAttribute(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__TFIDF_VECTOR);
		createEAttribute(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__AUTHOR_IS_PROJECT_MEMBER);
		createEAttribute(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__NUMBER_OF_WORDS);
		createEAttribute(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__COMMENTS_SO_FAR);
		createEAttribute(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__ALL_UTTERANCES_SO_FAR);
		createEAttribute(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__UTTERANCES_IN_COMMENT_SO_FAR);
		createEAttribute(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__UTTERED_BY_ORIGINAL_POSTER);
		createEAttribute(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__HAS_CAPITALIZED_WORD);
		createEAttribute(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__CONTAINS_SHOULD);
		createEAttribute(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__TOPIC_VECTOR);
		createEReference(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__DESIGN_POINTS);
		createEAttribute(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__NAME);
		createEAttribute(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__CONTENT);
		createEAttribute(utteranceDescriptionEClass, UTTERANCE_DESCRIPTION__AUTHOR_INVITED);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__TYPE);
		createEReference(relationshipEClass, RELATIONSHIP__DESIGNPOINT);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);

		// Create enums
		roleEEnum = createEEnum(ROLE);
		formEEnum = createEEnum(FORM);
		sentimentEEnum = createEEnum(SENTIMENT);
		relationshipTypeEEnum = createEEnum(RELATIONSHIP_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(discussionEClass, Discussion.class, "Discussion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscussion_Participants(), this.getParticipant(), null, "participants", null, 0, -1, Discussion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscussion_Comments(), this.getComment(), null, "comments", null, 0, -1, Discussion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussion_Title(), ecorePackage.getEString(), "title", "TITLE NOT SET", 0, 1, Discussion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussion_InvitedUsernames(), ecorePackage.getEString(), "invitedUsernames", null, 0, -1, Discussion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDiscussion__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDiscussion__ToARFF(), ecorePackage.getEString(), "toARFF", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDiscussion__GetAllUtterances(), this.getUtterance(), "getAllUtterances", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDiscussion__GetAllDesignPoints(), this.getDesignPoint(), "getAllDesignPoints", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParticipant_Name(), ecorePackage.getEString(), "name", null, 1, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParticipant_Member(), ecorePackage.getEBoolean(), "member", "false", 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getParticipant__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComment_Author(), this.getParticipant(), null, "author", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_RawContent(), ecorePackage.getEString(), "rawContent", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComment_Next(), this.getComment(), this.getComment_Previous(), "next", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComment_Previous(), this.getComment(), this.getComment_Next(), "previous", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComment_Utterances(), this.getUtterance(), this.getUtterance_Comment(), "utterances", null, 0, -1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComment__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(designPointEClass, DesignPoint.class, "DesignPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDesignPoint_Role(), this.getRole(), "role", null, 1, 2, DesignPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignPoint_Form(), this.getForm(), "form", null, 1, 1, DesignPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignPoint_Sentiment(), this.getSentiment(), "sentiment", null, 1, 1, DesignPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignPoint_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, DesignPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignPoint_Id(), ecorePackage.getEInt(), "id", null, 1, 1, DesignPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignPoint_UtteranceDescription(), this.getUtteranceDescription(), this.getUtteranceDescription_DesignPoints(), "utteranceDescription", null, 1, 1, DesignPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignPoint_Relationship(), this.getRelationship(), this.getRelationship_Designpoint(), "relationship", null, 1, -1, DesignPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignPoint_PostedBeforeCommits(), ecorePackage.getEBoolean(), "postedBeforeCommits", "true", 1, 1, DesignPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utteranceEClass, Utterance.class, "Utterance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUtterance_Content(), ecorePackage.getEString(), "content", null, 0, 1, Utterance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtterance_Comment(), this.getComment(), this.getComment_Utterances(), "comment", null, 1, 1, Utterance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtterance_Description(), this.getUtteranceDescription(), this.getUtteranceDescription_Utterance(), "description", null, 1, 1, Utterance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utteranceDescriptionEClass, UtteranceDescription.class, "UtteranceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUtteranceDescription_Utterance(), this.getUtterance(), this.getUtterance_Description(), "utterance", null, 1, 1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtteranceDescription_TfidfVector(), ecorePackage.getEDouble(), "tfidfVector", null, 0, -1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtteranceDescription_AuthorIsProjectMember(), ecorePackage.getEBoolean(), "authorIsProjectMember", null, 0, 1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtteranceDescription_NumberOfWords(), ecorePackage.getEInt(), "numberOfWords", null, 0, 1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtteranceDescription_CommentsSoFar(), ecorePackage.getEInt(), "commentsSoFar", null, 0, 1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtteranceDescription_AllUtterancesSoFar(), ecorePackage.getEInt(), "allUtterancesSoFar", null, 0, 1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtteranceDescription_UtterancesInCommentSoFar(), ecorePackage.getEInt(), "utterancesInCommentSoFar", null, 0, 1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtteranceDescription_UtteredByOriginalPoster(), ecorePackage.getEBoolean(), "utteredByOriginalPoster", null, 0, 1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtteranceDescription_HasCapitalizedWord(), ecorePackage.getEBoolean(), "hasCapitalizedWord", null, 0, 1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtteranceDescription_ContainsShould(), ecorePackage.getEBoolean(), "containsShould", "false", 0, 1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtteranceDescription_TopicVector(), ecorePackage.getEDouble(), "topicVector", null, 0, -1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtteranceDescription_DesignPoints(), this.getDesignPoint(), this.getDesignPoint_UtteranceDescription(), "designPoints", null, 0, -1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtteranceDescription_Name(), ecorePackage.getEString(), "name", null, 0, 1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUtteranceDescription_Content(), ecorePackage.getEString(), "content", null, 0, 1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUtteranceDescription_AuthorInvited(), ecorePackage.getEBoolean(), "authorInvited", "false", 0, 1, UtteranceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationship_Type(), this.getRelationshipType(), "type", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Designpoint(), this.getDesignPoint(), this.getDesignPoint_Relationship(), "designpoint", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Target(), this.getDesignPoint(), null, "target", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(roleEEnum, Role.class, "Role");
		addEEnumLiteral(roleEEnum, Role.ORIGINAL);
		addEEnumLiteral(roleEEnum, Role.CORE);
		addEEnumLiteral(roleEEnum, Role.OTHER);

		initEEnum(formEEnum, Form.class, "Form");
		addEEnumLiteral(formEEnum, Form.OPEN_QUESTION);
		addEEnumLiteral(formEEnum, Form.CANDIDATE_ENUMERATION);
		addEEnumLiteral(formEEnum, Form.SOLUTION);

		initEEnum(sentimentEEnum, Sentiment.class, "Sentiment");
		addEEnumLiteral(sentimentEEnum, Sentiment.NEUTRAL);
		addEEnumLiteral(sentimentEEnum, Sentiment.POSITIVE);
		addEEnumLiteral(sentimentEEnum, Sentiment.NEGATIVE);

		initEEnum(relationshipTypeEEnum, RelationshipType.class, "RelationshipType");
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.NEW);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.ELABORATES);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.GENERALIZES);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.REFRAMES);

		// Create resource
		createResource(eNS_URI);
	}

} //DiscussionsPackageImpl
