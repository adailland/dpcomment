/**
 */
package ca.ubc.cs.gentlebot.model.discussions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utterance Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getUtterance <em>Utterance</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getTfidfVector <em>Tfidf Vector</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isAuthorIsProjectMember <em>Author Is Project Member</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getNumberOfWords <em>Number Of Words</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getCommentsSoFar <em>Comments So Far</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getAllUtterancesSoFar <em>All Utterances So Far</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getUtterancesInCommentSoFar <em>Utterances In Comment So Far</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isUtteredByOriginalPoster <em>Uttered By Original Poster</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isHasCapitalizedWord <em>Has Capitalized Word</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isContainsShould <em>Contains Should</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getTopicVector <em>Topic Vector</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getDesignPoints <em>Design Points</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getName <em>Name</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getContent <em>Content</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isAuthorInvited <em>Author Invited</em>}</li>
 * </ul>
 *
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription()
 * @model
 * @generated
 */
public interface UtteranceDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Utterance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.ubc.cs.gentlebot.model.discussions.Utterance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utterance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utterance</em>' reference.
	 * @see #setUtterance(Utterance)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_Utterance()
	 * @see ca.ubc.cs.gentlebot.model.discussions.Utterance#getDescription
	 * @model opposite="description" required="true"
	 * @generated
	 */
	Utterance getUtterance();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getUtterance <em>Utterance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utterance</em>' reference.
	 * @see #getUtterance()
	 * @generated
	 */
	void setUtterance(Utterance value);

	/**
	 * Returns the value of the '<em><b>Tfidf Vector</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tfidf Vector</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tfidf Vector</em>' attribute list.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_TfidfVector()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getTfidfVector();

	/**
	 * Returns the value of the '<em><b>Author Is Project Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Is Project Member</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Is Project Member</em>' attribute.
	 * @see #setAuthorIsProjectMember(boolean)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_AuthorIsProjectMember()
	 * @model
	 * @generated
	 */
	boolean isAuthorIsProjectMember();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isAuthorIsProjectMember <em>Author Is Project Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Is Project Member</em>' attribute.
	 * @see #isAuthorIsProjectMember()
	 * @generated
	 */
	void setAuthorIsProjectMember(boolean value);

	/**
	 * Returns the value of the '<em><b>Number Of Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Words</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Words</em>' attribute.
	 * @see #setNumberOfWords(int)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_NumberOfWords()
	 * @model
	 * @generated
	 */
	int getNumberOfWords();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getNumberOfWords <em>Number Of Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Words</em>' attribute.
	 * @see #getNumberOfWords()
	 * @generated
	 */
	void setNumberOfWords(int value);

	/**
	 * Returns the value of the '<em><b>Comments So Far</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments So Far</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments So Far</em>' attribute.
	 * @see #setCommentsSoFar(int)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_CommentsSoFar()
	 * @model
	 * @generated
	 */
	int getCommentsSoFar();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getCommentsSoFar <em>Comments So Far</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments So Far</em>' attribute.
	 * @see #getCommentsSoFar()
	 * @generated
	 */
	void setCommentsSoFar(int value);

	/**
	 * Returns the value of the '<em><b>All Utterances So Far</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Utterances So Far</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Utterances So Far</em>' attribute.
	 * @see #setAllUtterancesSoFar(int)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_AllUtterancesSoFar()
	 * @model
	 * @generated
	 */
	int getAllUtterancesSoFar();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getAllUtterancesSoFar <em>All Utterances So Far</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Utterances So Far</em>' attribute.
	 * @see #getAllUtterancesSoFar()
	 * @generated
	 */
	void setAllUtterancesSoFar(int value);

	/**
	 * Returns the value of the '<em><b>Utterances In Comment So Far</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utterances In Comment So Far</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utterances In Comment So Far</em>' attribute.
	 * @see #setUtterancesInCommentSoFar(int)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_UtterancesInCommentSoFar()
	 * @model
	 * @generated
	 */
	int getUtterancesInCommentSoFar();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getUtterancesInCommentSoFar <em>Utterances In Comment So Far</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utterances In Comment So Far</em>' attribute.
	 * @see #getUtterancesInCommentSoFar()
	 * @generated
	 */
	void setUtterancesInCommentSoFar(int value);

	/**
	 * Returns the value of the '<em><b>Uttered By Original Poster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uttered By Original Poster</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uttered By Original Poster</em>' attribute.
	 * @see #setUtteredByOriginalPoster(boolean)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_UtteredByOriginalPoster()
	 * @model
	 * @generated
	 */
	boolean isUtteredByOriginalPoster();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isUtteredByOriginalPoster <em>Uttered By Original Poster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uttered By Original Poster</em>' attribute.
	 * @see #isUtteredByOriginalPoster()
	 * @generated
	 */
	void setUtteredByOriginalPoster(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Capitalized Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Capitalized Word</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Capitalized Word</em>' attribute.
	 * @see #setHasCapitalizedWord(boolean)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_HasCapitalizedWord()
	 * @model
	 * @generated
	 */
	boolean isHasCapitalizedWord();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isHasCapitalizedWord <em>Has Capitalized Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Capitalized Word</em>' attribute.
	 * @see #isHasCapitalizedWord()
	 * @generated
	 */
	void setHasCapitalizedWord(boolean value);

	/**
	 * Returns the value of the '<em><b>Contains Should</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Should</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Should</em>' attribute.
	 * @see #setContainsShould(boolean)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_ContainsShould()
	 * @model default="false"
	 * @generated
	 */
	boolean isContainsShould();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isContainsShould <em>Contains Should</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Should</em>' attribute.
	 * @see #isContainsShould()
	 * @generated
	 */
	void setContainsShould(boolean value);

	/**
	 * Returns the value of the '<em><b>Topic Vector</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Vector</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Vector</em>' attribute list.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_TopicVector()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getTopicVector();

	/**
	 * Returns the value of the '<em><b>Design Points</b></em>' reference list.
	 * The list contents are of type {@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint}.
	 * It is bidirectional and its opposite is '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getUtteranceDescription <em>Utterance Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Points</em>' reference list.
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_DesignPoints()
	 * @see ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getUtteranceDescription
	 * @model opposite="utteranceDescription"
	 * @generated
	 */
	EList<DesignPoint> getDesignPoints();

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
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_Name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_Content()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Author Invited</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Invited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Invited</em>' attribute.
	 * @see #setAuthorInvited(boolean)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getUtteranceDescription_AuthorInvited()
	 * @model default="false"
	 * @generated
	 */
	boolean isAuthorInvited();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription#isAuthorInvited <em>Author Invited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Invited</em>' attribute.
	 * @see #isAuthorInvited()
	 * @generated
	 */
	void setAuthorInvited(boolean value);

} // UtteranceDescription
