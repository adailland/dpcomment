/**
 */
package ca.ubc.cs.gentlebot.model.discussions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getAuthor <em>Author</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getRawContent <em>Raw Content</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getNext <em>Next</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getPrevious <em>Previous</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getId <em>Id</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getUtterances <em>Utterances</em>}</li>
 * </ul>
 *
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Participant)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getComment_Author()
	 * @model required="true"
	 * @generated
	 */
	Participant getAuthor();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Participant value);

	/**
	 * Returns the value of the '<em><b>Raw Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Content</em>' attribute.
	 * @see #setRawContent(String)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getComment_RawContent()
	 * @model
	 * @generated
	 */
	String getRawContent();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getRawContent <em>Raw Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Content</em>' attribute.
	 * @see #getRawContent()
	 * @generated
	 */
	void setRawContent(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Comment)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getComment_Next()
	 * @see ca.ubc.cs.gentlebot.model.discussions.Comment#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	Comment getNext();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Comment value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Comment)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getComment_Previous()
	 * @see ca.ubc.cs.gentlebot.model.discussions.Comment#getNext
	 * @model opposite="next"
	 * @generated
	 */
	Comment getPrevious();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Comment value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getComment_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.Comment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Utterances</b></em>' reference list.
	 * The list contents are of type {@link ca.ubc.cs.gentlebot.model.discussions.Utterance}.
	 * It is bidirectional and its opposite is '{@link ca.ubc.cs.gentlebot.model.discussions.Utterance#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utterances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utterances</em>' reference list.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getComment_Utterances()
	 * @see ca.ubc.cs.gentlebot.model.discussions.Utterance#getComment
	 * @model opposite="comment"
	 * @generated
	 */
	EList<Utterance> getUtterances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

} // Comment
