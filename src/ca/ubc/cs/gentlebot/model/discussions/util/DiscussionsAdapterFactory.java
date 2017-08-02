/**
 */
package ca.ubc.cs.gentlebot.model.discussions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ca.ubc.cs.gentlebot.model.discussions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage
 * @generated
 */
public class DiscussionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiscussionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscussionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DiscussionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscussionsSwitch<Adapter> modelSwitch =
		new DiscussionsSwitch<Adapter>() {
			@Override
			public Adapter caseDiscussion(Discussion object) {
				return createDiscussionAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseDesignPoint(DesignPoint object) {
				return createDesignPointAdapter();
			}
			@Override
			public Adapter caseUtterance(Utterance object) {
				return createUtteranceAdapter();
			}
			@Override
			public Adapter caseUtteranceDescription(UtteranceDescription object) {
				return createUtteranceDescriptionAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ca.ubc.cs.gentlebot.model.discussions.Discussion <em>Discussion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Discussion
	 * @generated
	 */
	public Adapter createDiscussionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ubc.cs.gentlebot.model.discussions.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ubc.cs.gentlebot.model.discussions.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint <em>Design Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DesignPoint
	 * @generated
	 */
	public Adapter createDesignPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ubc.cs.gentlebot.model.discussions.Utterance <em>Utterance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Utterance
	 * @generated
	 */
	public Adapter createUtteranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription <em>Utterance Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription
	 * @generated
	 */
	public Adapter createUtteranceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ubc.cs.gentlebot.model.discussions.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DiscussionsAdapterFactory
