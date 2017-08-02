/**
 */
package ca.ubc.cs.gentlebot.model.discussions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage
 * @generated
 */
public interface DiscussionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiscussionsFactory eINSTANCE = ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Discussion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discussion</em>'.
	 * @generated
	 */
	Discussion createDiscussion();

	/**
	 * Returns a new object of class '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant</em>'.
	 * @generated
	 */
	Participant createParticipant();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Design Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design Point</em>'.
	 * @generated
	 */
	DesignPoint createDesignPoint();

	/**
	 * Returns a new object of class '<em>Utterance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Utterance</em>'.
	 * @generated
	 */
	Utterance createUtterance();

	/**
	 * Returns a new object of class '<em>Utterance Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Utterance Description</em>'.
	 * @generated
	 */
	UtteranceDescription createUtteranceDescription();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiscussionsPackage getDiscussionsPackage();

} //DiscussionsFactory
