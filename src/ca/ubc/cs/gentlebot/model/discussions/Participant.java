/**
 */
package ca.ubc.cs.gentlebot.model.discussions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Participant#getName <em>Name</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Participant#isMember <em>Member</em>}</li>
 * </ul>
 *
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getParticipant_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.Participant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' attribute.
	 * @see #setMember(boolean)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getParticipant_Member()
	 * @model default="false"
	 * @generated
	 */
	boolean isMember();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.Participant#isMember <em>Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' attribute.
	 * @see #isMember()
	 * @generated
	 */
	void setMember(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

} // Participant
