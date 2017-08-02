/**
 */
package ca.ubc.cs.gentlebot.model.discussions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utterance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Utterance#getContent <em>Content</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Utterance#getComment <em>Comment</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Utterance#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtterance()
 * @model
 * @generated
 */
public interface Utterance extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtterance_Content()
	 * @model id="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.Utterance#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getUtterances <em>Utterances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' reference.
	 * @see #setComment(Comment)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtterance_Comment()
	 * @see ca.ubc.cs.gentlebot.model.discussions.Comment#getUtterances
	 * @model opposite="utterances" required="true"
	 * @generated
	 */
	Comment getComment();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.Utterance#getComment <em>Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Comment value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getUtterance <em>Utterance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(UtteranceDescription)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtterance_Description()
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getUtterance
	 * @model opposite="utterance" required="true"
	 * @generated
	 */
	UtteranceDescription getDescription();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.Utterance#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(UtteranceDescription value);

} // Utterance
