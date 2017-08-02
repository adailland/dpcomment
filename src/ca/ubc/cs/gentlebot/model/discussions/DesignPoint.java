/**
 */
package ca.ubc.cs.gentlebot.model.discussions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getRole <em>Role</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getForm <em>Form</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getSentiment <em>Sentiment</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getSummary <em>Summary</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getId <em>Id</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getUtteranceDescription <em>Utterance Description</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#isPostedBeforeCommits <em>Posted Before Commits</em>}</li>
 * </ul>
 *
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getDesignPoint()
 * @model
 * @generated
 */
public interface DesignPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute list.
	 * The list contents are of type {@link ca.ubc.cs.gentlebot.model.discussions.Role}.
	 * The literals are from the enumeration {@link ca.ubc.cs.gentlebot.model.discussions.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute list.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Role
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getDesignPoint_Role()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<Role> getRole();

	/**
	 * Returns the value of the '<em><b>Form</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.ubc.cs.gentlebot.model.discussions.Form}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' attribute.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Form
	 * @see #setForm(Form)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getDesignPoint_Form()
	 * @model required="true"
	 * @generated
	 */
	Form getForm();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getForm <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' attribute.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Form
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Form value);

	/**
	 * Returns the value of the '<em><b>Sentiment</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.ubc.cs.gentlebot.model.discussions.Sentiment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentiment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentiment</em>' attribute.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Sentiment
	 * @see #setSentiment(Sentiment)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getDesignPoint_Sentiment()
	 * @model required="true"
	 * @generated
	 */
	Sentiment getSentiment();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getSentiment <em>Sentiment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sentiment</em>' attribute.
	 * @see ca.ubc.cs.gentlebot.model.discussions.Sentiment
	 * @see #getSentiment()
	 * @generated
	 */
	void setSentiment(Sentiment value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference list.
	 * The list contents are of type {@link ca.ubc.cs.gentlebot.model.discussions.Relationship}.
	 * It is bidirectional and its opposite is '{@link ca.ubc.cs.gentlebot.model.discussions.Relationship#getDesignpoint <em>Designpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference list.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getDesignPoint_Relationship()
	 * @see ca.ubc.cs.gentlebot.model.discussions.Relationship#getDesignpoint
	 * @model opposite="designpoint" required="true"
	 * @generated
	 */
	EList<Relationship> getRelationship();

	/**
	 * Returns the value of the '<em><b>Posted Before Commits</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted Before Commits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted Before Commits</em>' attribute.
	 * @see #setPostedBeforeCommits(boolean)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getDesignPoint_PostedBeforeCommits()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isPostedBeforeCommits();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#isPostedBeforeCommits <em>Posted Before Commits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted Before Commits</em>' attribute.
	 * @see #isPostedBeforeCommits()
	 * @generated
	 */
	void setPostedBeforeCommits(boolean value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getDesignPoint_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

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
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getDesignPoint_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Utterance Description</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getDesignPoints <em>Design Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utterance Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utterance Description</em>' reference.
	 * @see #setUtteranceDescription(UtteranceDescription)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getDesignPoint_UtteranceDescription()
	 * @see ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getDesignPoints
	 * @model opposite="designPoints" required="true"
	 * @generated
	 */
	UtteranceDescription getUtteranceDescription();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getUtteranceDescription <em>Utterance Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utterance Description</em>' reference.
	 * @see #getUtteranceDescription()
	 * @generated
	 */
	void setUtteranceDescription(UtteranceDescription value);

} // DesignPoint
