/**
 */
package ca.ubc.cs.gentlebot.model.discussions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discussion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Discussion#getParticipants <em>Participants</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Discussion#getComments <em>Comments</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Discussion#getTitle <em>Title</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Discussion#getInvitedUsernames <em>Invited Usernames</em>}</li>
 * </ul>
 *
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getDiscussion()
 * @model
 * @generated
 */
public interface Discussion extends EObject {
	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link ca.ubc.cs.gentlebot.model.discussions.Participant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getDiscussion_Participants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Participant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link ca.ubc.cs.gentlebot.model.discussions.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getDiscussion_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>"TITLE NOT SET"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getDiscussion_Title()
	 * @model default="TITLE NOT SET"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.Discussion#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Invited Usernames</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invited Usernames</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invited Usernames</em>' attribute list.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getDiscussion_InvitedUsernames()
	 * @model id="true"
	 * @generated
	 */
	EList<String> getInvitedUsernames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toARFF();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Utterance> getAllUtterances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DesignPoint> getAllDesignPoints();

} // Discussion
