/**
 */
package ca.ubc.cs.gentlebot.model.discussions.impl;

import ca.ubc.cs.gentlebot.model.discussions.DesignPoint;
import ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage;
import ca.ubc.cs.gentlebot.model.discussions.Utterance;
import ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Utterance Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#getUtterance <em>Utterance</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#getTfidfVector <em>Tfidf Vector</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#isAuthorIsProjectMember <em>Author Is Project Member</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#getNumberOfWords <em>Number Of Words</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#getCommentsSoFar <em>Comments So Far</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#getAllUtterancesSoFar <em>All Utterances So Far</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#getUtterancesInCommentSoFar <em>Utterances In Comment So Far</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#isUtteredByOriginalPoster <em>Uttered By Original Poster</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#isHasCapitalizedWord <em>Has Capitalized Word</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#isContainsShould <em>Contains Should</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#getTopicVector <em>Topic Vector</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#getDesignPoints <em>Design Points</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#getContent <em>Content</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceDescriptionImpl#isAuthorInvited <em>Author Invited</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtteranceDescriptionImpl extends MinimalEObjectImpl.Container implements UtteranceDescription {
	/**
	 * The cached value of the '{@link #getUtterance() <em>Utterance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtterance()
	 * @generated
	 * @ordered
	 */
	protected Utterance utterance;

	/**
	 * The cached value of the '{@link #getTfidfVector() <em>Tfidf Vector</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTfidfVector()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> tfidfVector;

	/**
	 * The default value of the '{@link #isAuthorIsProjectMember() <em>Author Is Project Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthorIsProjectMember()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHOR_IS_PROJECT_MEMBER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuthorIsProjectMember() <em>Author Is Project Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthorIsProjectMember()
	 * @generated
	 * @ordered
	 */
	protected boolean authorIsProjectMember = AUTHOR_IS_PROJECT_MEMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfWords() <em>Number Of Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfWords()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_WORDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfWords() <em>Number Of Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfWords()
	 * @generated
	 * @ordered
	 */
	protected int numberOfWords = NUMBER_OF_WORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentsSoFar() <em>Comments So Far</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsSoFar()
	 * @generated
	 * @ordered
	 */
	protected static final int COMMENTS_SO_FAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCommentsSoFar() <em>Comments So Far</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsSoFar()
	 * @generated
	 * @ordered
	 */
	protected int commentsSoFar = COMMENTS_SO_FAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllUtterancesSoFar() <em>All Utterances So Far</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllUtterancesSoFar()
	 * @generated
	 * @ordered
	 */
	protected static final int ALL_UTTERANCES_SO_FAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAllUtterancesSoFar() <em>All Utterances So Far</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllUtterancesSoFar()
	 * @generated
	 * @ordered
	 */
	protected int allUtterancesSoFar = ALL_UTTERANCES_SO_FAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtterancesInCommentSoFar() <em>Utterances In Comment So Far</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtterancesInCommentSoFar()
	 * @generated
	 * @ordered
	 */
	protected static final int UTTERANCES_IN_COMMENT_SO_FAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUtterancesInCommentSoFar() <em>Utterances In Comment So Far</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtterancesInCommentSoFar()
	 * @generated
	 * @ordered
	 */
	protected int utterancesInCommentSoFar = UTTERANCES_IN_COMMENT_SO_FAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isUtteredByOriginalPoster() <em>Uttered By Original Poster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUtteredByOriginalPoster()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UTTERED_BY_ORIGINAL_POSTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUtteredByOriginalPoster() <em>Uttered By Original Poster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUtteredByOriginalPoster()
	 * @generated
	 * @ordered
	 */
	protected boolean utteredByOriginalPoster = UTTERED_BY_ORIGINAL_POSTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasCapitalizedWord() <em>Has Capitalized Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasCapitalizedWord()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_CAPITALIZED_WORD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasCapitalizedWord() <em>Has Capitalized Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasCapitalizedWord()
	 * @generated
	 * @ordered
	 */
	protected boolean hasCapitalizedWord = HAS_CAPITALIZED_WORD_EDEFAULT;

	/**
	 * The default value of the '{@link #isContainsShould() <em>Contains Should</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainsShould()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINS_SHOULD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainsShould() <em>Contains Should</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainsShould()
	 * @generated
	 * @ordered
	 */
	protected boolean containsShould = CONTAINS_SHOULD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTopicVector() <em>Topic Vector</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicVector()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> topicVector;

	/**
	 * The cached value of the '{@link #getDesignPoints() <em>Design Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignPoint> designPoints;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAuthorInvited() <em>Author Invited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthorInvited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHOR_INVITED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuthorInvited() <em>Author Invited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthorInvited()
	 * @generated
	 * @ordered
	 */
	protected boolean authorInvited = AUTHOR_INVITED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtteranceDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiscussionsPackage.Literals.UTTERANCE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utterance getUtterance() {
		if (utterance != null && utterance.eIsProxy()) {
			InternalEObject oldUtterance = (InternalEObject)utterance;
			utterance = (Utterance)eResolveProxy(oldUtterance);
			if (utterance != oldUtterance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCE, oldUtterance, utterance));
			}
		}
		return utterance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utterance basicGetUtterance() {
		return utterance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUtterance(Utterance newUtterance, NotificationChain msgs) {
		Utterance oldUtterance = utterance;
		utterance = newUtterance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCE, oldUtterance, newUtterance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtterance(Utterance newUtterance) {
		if (newUtterance != utterance) {
			NotificationChain msgs = null;
			if (utterance != null)
				msgs = ((InternalEObject)utterance).eInverseRemove(this, DiscussionsPackage.UTTERANCE__DESCRIPTION, Utterance.class, msgs);
			if (newUtterance != null)
				msgs = ((InternalEObject)newUtterance).eInverseAdd(this, DiscussionsPackage.UTTERANCE__DESCRIPTION, Utterance.class, msgs);
			msgs = basicSetUtterance(newUtterance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCE, newUtterance, newUtterance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getTfidfVector() {
		if (tfidfVector == null) {
			tfidfVector = new EDataTypeEList<Double>(Double.class, this, DiscussionsPackage.UTTERANCE_DESCRIPTION__TFIDF_VECTOR);
		}
		return tfidfVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuthorIsProjectMember() {
		return authorIsProjectMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorIsProjectMember(boolean newAuthorIsProjectMember) {
		boolean oldAuthorIsProjectMember = authorIsProjectMember;
		authorIsProjectMember = newAuthorIsProjectMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE_DESCRIPTION__AUTHOR_IS_PROJECT_MEMBER, oldAuthorIsProjectMember, authorIsProjectMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfWords() {
		return numberOfWords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfWords(int newNumberOfWords) {
		int oldNumberOfWords = numberOfWords;
		numberOfWords = newNumberOfWords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE_DESCRIPTION__NUMBER_OF_WORDS, oldNumberOfWords, numberOfWords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommentsSoFar() {
		return commentsSoFar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentsSoFar(int newCommentsSoFar) {
		int oldCommentsSoFar = commentsSoFar;
		commentsSoFar = newCommentsSoFar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE_DESCRIPTION__COMMENTS_SO_FAR, oldCommentsSoFar, commentsSoFar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAllUtterancesSoFar() {
		return allUtterancesSoFar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllUtterancesSoFar(int newAllUtterancesSoFar) {
		int oldAllUtterancesSoFar = allUtterancesSoFar;
		allUtterancesSoFar = newAllUtterancesSoFar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE_DESCRIPTION__ALL_UTTERANCES_SO_FAR, oldAllUtterancesSoFar, allUtterancesSoFar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUtterancesInCommentSoFar() {
		return utterancesInCommentSoFar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtterancesInCommentSoFar(int newUtterancesInCommentSoFar) {
		int oldUtterancesInCommentSoFar = utterancesInCommentSoFar;
		utterancesInCommentSoFar = newUtterancesInCommentSoFar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCES_IN_COMMENT_SO_FAR, oldUtterancesInCommentSoFar, utterancesInCommentSoFar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUtteredByOriginalPoster() {
		return utteredByOriginalPoster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtteredByOriginalPoster(boolean newUtteredByOriginalPoster) {
		boolean oldUtteredByOriginalPoster = utteredByOriginalPoster;
		utteredByOriginalPoster = newUtteredByOriginalPoster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERED_BY_ORIGINAL_POSTER, oldUtteredByOriginalPoster, utteredByOriginalPoster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasCapitalizedWord() {
		return hasCapitalizedWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasCapitalizedWord(boolean newHasCapitalizedWord) {
		boolean oldHasCapitalizedWord = hasCapitalizedWord;
		hasCapitalizedWord = newHasCapitalizedWord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE_DESCRIPTION__HAS_CAPITALIZED_WORD, oldHasCapitalizedWord, hasCapitalizedWord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainsShould() {
		return containsShould;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsShould(boolean newContainsShould) {
		boolean oldContainsShould = containsShould;
		containsShould = newContainsShould;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE_DESCRIPTION__CONTAINS_SHOULD, oldContainsShould, containsShould));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getTopicVector() {
		if (topicVector == null) {
			topicVector = new EDataTypeEList<Double>(Double.class, this, DiscussionsPackage.UTTERANCE_DESCRIPTION__TOPIC_VECTOR);
		}
		return topicVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignPoint> getDesignPoints() {
		if (designPoints == null) {
			designPoints = new EObjectWithInverseResolvingEList<DesignPoint>(DesignPoint.class, this, DiscussionsPackage.UTTERANCE_DESCRIPTION__DESIGN_POINTS, DiscussionsPackage.DESIGN_POINT__UTTERANCE_DESCRIPTION);
		}
		return designPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE_DESCRIPTION__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuthorInvited() {
		return authorInvited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorInvited(boolean newAuthorInvited) {
		boolean oldAuthorInvited = authorInvited;
		authorInvited = newAuthorInvited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE_DESCRIPTION__AUTHOR_INVITED, oldAuthorInvited, authorInvited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCE:
				if (utterance != null)
					msgs = ((InternalEObject)utterance).eInverseRemove(this, DiscussionsPackage.UTTERANCE__DESCRIPTION, Utterance.class, msgs);
				return basicSetUtterance((Utterance)otherEnd, msgs);
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__DESIGN_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignPoints()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCE:
				return basicSetUtterance(null, msgs);
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__DESIGN_POINTS:
				return ((InternalEList<?>)getDesignPoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCE:
				if (resolve) return getUtterance();
				return basicGetUtterance();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__TFIDF_VECTOR:
				return getTfidfVector();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__AUTHOR_IS_PROJECT_MEMBER:
				return isAuthorIsProjectMember();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__NUMBER_OF_WORDS:
				return getNumberOfWords();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__COMMENTS_SO_FAR:
				return getCommentsSoFar();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__ALL_UTTERANCES_SO_FAR:
				return getAllUtterancesSoFar();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCES_IN_COMMENT_SO_FAR:
				return getUtterancesInCommentSoFar();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERED_BY_ORIGINAL_POSTER:
				return isUtteredByOriginalPoster();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__HAS_CAPITALIZED_WORD:
				return isHasCapitalizedWord();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__CONTAINS_SHOULD:
				return isContainsShould();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__TOPIC_VECTOR:
				return getTopicVector();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__DESIGN_POINTS:
				return getDesignPoints();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__NAME:
				return getName();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__CONTENT:
				return getContent();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__AUTHOR_INVITED:
				return isAuthorInvited();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCE:
				setUtterance((Utterance)newValue);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__TFIDF_VECTOR:
				getTfidfVector().clear();
				getTfidfVector().addAll((Collection<? extends Double>)newValue);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__AUTHOR_IS_PROJECT_MEMBER:
				setAuthorIsProjectMember((Boolean)newValue);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__NUMBER_OF_WORDS:
				setNumberOfWords((Integer)newValue);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__COMMENTS_SO_FAR:
				setCommentsSoFar((Integer)newValue);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__ALL_UTTERANCES_SO_FAR:
				setAllUtterancesSoFar((Integer)newValue);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCES_IN_COMMENT_SO_FAR:
				setUtterancesInCommentSoFar((Integer)newValue);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERED_BY_ORIGINAL_POSTER:
				setUtteredByOriginalPoster((Boolean)newValue);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__HAS_CAPITALIZED_WORD:
				setHasCapitalizedWord((Boolean)newValue);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__CONTAINS_SHOULD:
				setContainsShould((Boolean)newValue);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__TOPIC_VECTOR:
				getTopicVector().clear();
				getTopicVector().addAll((Collection<? extends Double>)newValue);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__DESIGN_POINTS:
				getDesignPoints().clear();
				getDesignPoints().addAll((Collection<? extends DesignPoint>)newValue);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__NAME:
				setName((String)newValue);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__CONTENT:
				setContent((String)newValue);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__AUTHOR_INVITED:
				setAuthorInvited((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCE:
				setUtterance((Utterance)null);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__TFIDF_VECTOR:
				getTfidfVector().clear();
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__AUTHOR_IS_PROJECT_MEMBER:
				setAuthorIsProjectMember(AUTHOR_IS_PROJECT_MEMBER_EDEFAULT);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__NUMBER_OF_WORDS:
				setNumberOfWords(NUMBER_OF_WORDS_EDEFAULT);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__COMMENTS_SO_FAR:
				setCommentsSoFar(COMMENTS_SO_FAR_EDEFAULT);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__ALL_UTTERANCES_SO_FAR:
				setAllUtterancesSoFar(ALL_UTTERANCES_SO_FAR_EDEFAULT);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCES_IN_COMMENT_SO_FAR:
				setUtterancesInCommentSoFar(UTTERANCES_IN_COMMENT_SO_FAR_EDEFAULT);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERED_BY_ORIGINAL_POSTER:
				setUtteredByOriginalPoster(UTTERED_BY_ORIGINAL_POSTER_EDEFAULT);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__HAS_CAPITALIZED_WORD:
				setHasCapitalizedWord(HAS_CAPITALIZED_WORD_EDEFAULT);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__CONTAINS_SHOULD:
				setContainsShould(CONTAINS_SHOULD_EDEFAULT);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__TOPIC_VECTOR:
				getTopicVector().clear();
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__DESIGN_POINTS:
				getDesignPoints().clear();
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__AUTHOR_INVITED:
				setAuthorInvited(AUTHOR_INVITED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCE:
				return utterance != null;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__TFIDF_VECTOR:
				return tfidfVector != null && !tfidfVector.isEmpty();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__AUTHOR_IS_PROJECT_MEMBER:
				return authorIsProjectMember != AUTHOR_IS_PROJECT_MEMBER_EDEFAULT;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__NUMBER_OF_WORDS:
				return numberOfWords != NUMBER_OF_WORDS_EDEFAULT;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__COMMENTS_SO_FAR:
				return commentsSoFar != COMMENTS_SO_FAR_EDEFAULT;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__ALL_UTTERANCES_SO_FAR:
				return allUtterancesSoFar != ALL_UTTERANCES_SO_FAR_EDEFAULT;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCES_IN_COMMENT_SO_FAR:
				return utterancesInCommentSoFar != UTTERANCES_IN_COMMENT_SO_FAR_EDEFAULT;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERED_BY_ORIGINAL_POSTER:
				return utteredByOriginalPoster != UTTERED_BY_ORIGINAL_POSTER_EDEFAULT;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__HAS_CAPITALIZED_WORD:
				return hasCapitalizedWord != HAS_CAPITALIZED_WORD_EDEFAULT;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__CONTAINS_SHOULD:
				return containsShould != CONTAINS_SHOULD_EDEFAULT;
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__TOPIC_VECTOR:
				return topicVector != null && !topicVector.isEmpty();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__DESIGN_POINTS:
				return designPoints != null && !designPoints.isEmpty();
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case DiscussionsPackage.UTTERANCE_DESCRIPTION__AUTHOR_INVITED:
				return authorInvited != AUTHOR_INVITED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tfidfVector: ");
		result.append(tfidfVector);
		result.append(", authorIsProjectMember: ");
		result.append(authorIsProjectMember);
		result.append(", numberOfWords: ");
		result.append(numberOfWords);
		result.append(", commentsSoFar: ");
		result.append(commentsSoFar);
		result.append(", allUtterancesSoFar: ");
		result.append(allUtterancesSoFar);
		result.append(", utterancesInCommentSoFar: ");
		result.append(utterancesInCommentSoFar);
		result.append(", utteredByOriginalPoster: ");
		result.append(utteredByOriginalPoster);
		result.append(", hasCapitalizedWord: ");
		result.append(hasCapitalizedWord);
		result.append(", containsShould: ");
		result.append(containsShould);
		result.append(", topicVector: ");
		result.append(topicVector);
		result.append(", name: ");
		result.append(name);
		result.append(", content: ");
		result.append(content);
		result.append(", authorInvited: ");
		result.append(authorInvited);
		result.append(')');
		return result.toString();
	}

} //UtteranceDescriptionImpl
