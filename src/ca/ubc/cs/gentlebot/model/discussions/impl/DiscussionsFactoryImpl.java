/**
 */
package ca.ubc.cs.gentlebot.model.discussions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.ubc.cs.gentlebot.model.discussions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscussionsFactoryImpl extends EFactoryImpl implements DiscussionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiscussionsFactory init() {
		try {
			DiscussionsFactory theDiscussionsFactory = (DiscussionsFactory)EPackage.Registry.INSTANCE.getEFactory(DiscussionsPackage.eNS_URI);
			if (theDiscussionsFactory != null) {
				return theDiscussionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiscussionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscussionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DiscussionsPackage.DISCUSSION: return createDiscussion();
			case DiscussionsPackage.PARTICIPANT: return createParticipant();
			case DiscussionsPackage.COMMENT: return createComment();
			case DiscussionsPackage.DESIGN_POINT: return createDesignPoint();
			case DiscussionsPackage.UTTERANCE: return createUtterance();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION: return createUtteranceDescription();
			case DiscussionsPackage.RELATIONSHIP: return createRelationship();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DiscussionsPackage.ROLE:
				return createRoleFromString(eDataType, initialValue);
			case DiscussionsPackage.FORM:
				return createFormFromString(eDataType, initialValue);
			case DiscussionsPackage.SENTIMENT:
				return createSentimentFromString(eDataType, initialValue);
			case DiscussionsPackage.RELATIONSHIP_TYPE:
				return createRelationshipTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DiscussionsPackage.ROLE:
				return convertRoleToString(eDataType, instanceValue);
			case DiscussionsPackage.FORM:
				return convertFormToString(eDataType, instanceValue);
			case DiscussionsPackage.SENTIMENT:
				return convertSentimentToString(eDataType, instanceValue);
			case DiscussionsPackage.RELATIONSHIP_TYPE:
				return convertRelationshipTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discussion createDiscussion() {
		DiscussionImpl discussion = new DiscussionImpl();
		return discussion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPoint createDesignPoint() {
		DesignPointImpl designPoint = new DesignPointImpl();
		return designPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utterance createUtterance() {
		UtteranceImpl utterance = new UtteranceImpl();
		return utterance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtteranceDescription createUtteranceDescription() {
		UtteranceDescriptionImpl utteranceDescription = new UtteranceDescriptionImpl();
		return utteranceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRoleFromString(EDataType eDataType, String initialValue) {
		Role result = Role.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createFormFromString(EDataType eDataType, String initialValue) {
		Form result = Form.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentiment createSentimentFromString(EDataType eDataType, String initialValue) {
		Sentiment result = Sentiment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSentimentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType createRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		RelationshipType result = RelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscussionsPackage getDiscussionsPackage() {
		return (DiscussionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiscussionsPackage getPackage() {
		return DiscussionsPackage.eINSTANCE;
	}

} //DiscussionsFactoryImpl
