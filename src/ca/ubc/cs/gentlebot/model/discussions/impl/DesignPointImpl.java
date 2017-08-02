/**
 */
package ca.ubc.cs.gentlebot.model.discussions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.ubc.cs.gentlebot.model.discussions.DesignPoint;
import ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage;
import ca.ubc.cs.gentlebot.model.discussions.Form;
import ca.ubc.cs.gentlebot.model.discussions.Relationship;
import ca.ubc.cs.gentlebot.model.discussions.Role;
import ca.ubc.cs.gentlebot.model.discussions.Sentiment;
import ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.DesignPointImpl#getRole <em>Role</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.DesignPointImpl#getForm <em>Form</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.DesignPointImpl#getSentiment <em>Sentiment</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.DesignPointImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.DesignPointImpl#getId <em>Id</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.DesignPointImpl#getUtteranceDescription <em>Utterance Description</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.DesignPointImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.DesignPointImpl#isPostedBeforeCommits <em>Posted Before Commits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignPointImpl extends MinimalEObjectImpl.Container implements DesignPoint {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

	/**
	 * The default value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected static final Form FORM_EDEFAULT = Form.OPEN_QUESTION;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected Form form = FORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSentiment() <em>Sentiment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentiment()
	 * @generated
	 * @ordered
	 */
	protected static final Sentiment SENTIMENT_EDEFAULT = Sentiment.NEUTRAL;

	/**
	 * The cached value of the '{@link #getSentiment() <em>Sentiment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentiment()
	 * @generated
	 * @ordered
	 */
	protected Sentiment sentiment = SENTIMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUtteranceDescription() <em>Utterance Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtteranceDescription()
	 * @generated
	 * @ordered
	 */
	protected UtteranceDescription utteranceDescription;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationship;

	/**
	 * The default value of the '{@link #isPostedBeforeCommits() <em>Posted Before Commits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostedBeforeCommits()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSTED_BEFORE_COMMITS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPostedBeforeCommits() <em>Posted Before Commits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostedBeforeCommits()
	 * @generated
	 * @ordered
	 */
	protected boolean postedBeforeCommits = POSTED_BEFORE_COMMITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiscussionsPackage.Literals.DESIGN_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRole() {
		if (role == null) {
			role = new EDataTypeUniqueEList<Role>(Role.class, this, DiscussionsPackage.DESIGN_POINT__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(Form newForm) {
		Form oldForm = form;
		form = newForm == null ? FORM_EDEFAULT : newForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.DESIGN_POINT__FORM, oldForm, form));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentiment getSentiment() {
		return sentiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSentiment(Sentiment newSentiment) {
		Sentiment oldSentiment = sentiment;
		sentiment = newSentiment == null ? SENTIMENT_EDEFAULT : newSentiment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.DESIGN_POINT__SENTIMENT, oldSentiment, sentiment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectWithInverseResolvingEList<Relationship>(Relationship.class, this, DiscussionsPackage.DESIGN_POINT__RELATIONSHIP, DiscussionsPackage.RELATIONSHIP__DESIGNPOINT);
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPostedBeforeCommits() {
		return postedBeforeCommits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostedBeforeCommits(boolean newPostedBeforeCommits) {
		boolean oldPostedBeforeCommits = postedBeforeCommits;
		postedBeforeCommits = newPostedBeforeCommits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.DESIGN_POINT__POSTED_BEFORE_COMMITS, oldPostedBeforeCommits, postedBeforeCommits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.DESIGN_POINT__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.DESIGN_POINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtteranceDescription getUtteranceDescription() {
		if (utteranceDescription != null && utteranceDescription.eIsProxy()) {
			InternalEObject oldUtteranceDescription = (InternalEObject)utteranceDescription;
			utteranceDescription = (UtteranceDescription)eResolveProxy(oldUtteranceDescription);
			if (utteranceDescription != oldUtteranceDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscussionsPackage.DESIGN_POINT__UTTERANCE_DESCRIPTION, oldUtteranceDescription, utteranceDescription));
			}
		}
		return utteranceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtteranceDescription basicGetUtteranceDescription() {
		return utteranceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUtteranceDescription(UtteranceDescription newUtteranceDescription, NotificationChain msgs) {
		UtteranceDescription oldUtteranceDescription = utteranceDescription;
		utteranceDescription = newUtteranceDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiscussionsPackage.DESIGN_POINT__UTTERANCE_DESCRIPTION, oldUtteranceDescription, newUtteranceDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtteranceDescription(UtteranceDescription newUtteranceDescription) {
		if (newUtteranceDescription != utteranceDescription) {
			NotificationChain msgs = null;
			if (utteranceDescription != null)
				msgs = ((InternalEObject)utteranceDescription).eInverseRemove(this, DiscussionsPackage.UTTERANCE_DESCRIPTION__DESIGN_POINTS, UtteranceDescription.class, msgs);
			if (newUtteranceDescription != null)
				msgs = ((InternalEObject)newUtteranceDescription).eInverseAdd(this, DiscussionsPackage.UTTERANCE_DESCRIPTION__DESIGN_POINTS, UtteranceDescription.class, msgs);
			msgs = basicSetUtteranceDescription(newUtteranceDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.DESIGN_POINT__UTTERANCE_DESCRIPTION, newUtteranceDescription, newUtteranceDescription));
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
			case DiscussionsPackage.DESIGN_POINT__UTTERANCE_DESCRIPTION:
				if (utteranceDescription != null)
					msgs = ((InternalEObject)utteranceDescription).eInverseRemove(this, DiscussionsPackage.UTTERANCE_DESCRIPTION__DESIGN_POINTS, UtteranceDescription.class, msgs);
				return basicSetUtteranceDescription((UtteranceDescription)otherEnd, msgs);
			case DiscussionsPackage.DESIGN_POINT__RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelationship()).basicAdd(otherEnd, msgs);
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
			case DiscussionsPackage.DESIGN_POINT__UTTERANCE_DESCRIPTION:
				return basicSetUtteranceDescription(null, msgs);
			case DiscussionsPackage.DESIGN_POINT__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
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
			case DiscussionsPackage.DESIGN_POINT__ROLE:
				return getRole();
			case DiscussionsPackage.DESIGN_POINT__FORM:
				return getForm();
			case DiscussionsPackage.DESIGN_POINT__SENTIMENT:
				return getSentiment();
			case DiscussionsPackage.DESIGN_POINT__SUMMARY:
				return getSummary();
			case DiscussionsPackage.DESIGN_POINT__ID:
				return getId();
			case DiscussionsPackage.DESIGN_POINT__UTTERANCE_DESCRIPTION:
				if (resolve) return getUtteranceDescription();
				return basicGetUtteranceDescription();
			case DiscussionsPackage.DESIGN_POINT__RELATIONSHIP:
				return getRelationship();
			case DiscussionsPackage.DESIGN_POINT__POSTED_BEFORE_COMMITS:
				return isPostedBeforeCommits();
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
			case DiscussionsPackage.DESIGN_POINT__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Role>)newValue);
				return;
			case DiscussionsPackage.DESIGN_POINT__FORM:
				setForm((Form)newValue);
				return;
			case DiscussionsPackage.DESIGN_POINT__SENTIMENT:
				setSentiment((Sentiment)newValue);
				return;
			case DiscussionsPackage.DESIGN_POINT__SUMMARY:
				setSummary((String)newValue);
				return;
			case DiscussionsPackage.DESIGN_POINT__ID:
				setId((Integer)newValue);
				return;
			case DiscussionsPackage.DESIGN_POINT__UTTERANCE_DESCRIPTION:
				setUtteranceDescription((UtteranceDescription)newValue);
				return;
			case DiscussionsPackage.DESIGN_POINT__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case DiscussionsPackage.DESIGN_POINT__POSTED_BEFORE_COMMITS:
				setPostedBeforeCommits((Boolean)newValue);
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
			case DiscussionsPackage.DESIGN_POINT__ROLE:
				getRole().clear();
				return;
			case DiscussionsPackage.DESIGN_POINT__FORM:
				setForm(FORM_EDEFAULT);
				return;
			case DiscussionsPackage.DESIGN_POINT__SENTIMENT:
				setSentiment(SENTIMENT_EDEFAULT);
				return;
			case DiscussionsPackage.DESIGN_POINT__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case DiscussionsPackage.DESIGN_POINT__ID:
				setId(ID_EDEFAULT);
				return;
			case DiscussionsPackage.DESIGN_POINT__UTTERANCE_DESCRIPTION:
				setUtteranceDescription((UtteranceDescription)null);
				return;
			case DiscussionsPackage.DESIGN_POINT__RELATIONSHIP:
				getRelationship().clear();
				return;
			case DiscussionsPackage.DESIGN_POINT__POSTED_BEFORE_COMMITS:
				setPostedBeforeCommits(POSTED_BEFORE_COMMITS_EDEFAULT);
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
			case DiscussionsPackage.DESIGN_POINT__ROLE:
				return role != null && !role.isEmpty();
			case DiscussionsPackage.DESIGN_POINT__FORM:
				return form != FORM_EDEFAULT;
			case DiscussionsPackage.DESIGN_POINT__SENTIMENT:
				return sentiment != SENTIMENT_EDEFAULT;
			case DiscussionsPackage.DESIGN_POINT__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case DiscussionsPackage.DESIGN_POINT__ID:
				return id != ID_EDEFAULT;
			case DiscussionsPackage.DESIGN_POINT__UTTERANCE_DESCRIPTION:
				return utteranceDescription != null;
			case DiscussionsPackage.DESIGN_POINT__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case DiscussionsPackage.DESIGN_POINT__POSTED_BEFORE_COMMITS:
				return postedBeforeCommits != POSTED_BEFORE_COMMITS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer("");// new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id+"\n\t\t");
		result.append(", role: ");
		result.append(role+"\n\t\t");
		result.append(", form: ");
		result.append(form+"\n\t\t");
		result.append(", sentiment: ");
		result.append(sentiment+"\n\t\t");
		result.append(", relationship: ");
		result.append(relationship+"\n\t\t");
		result.append(", summary: ");
		result.append(summary);
		result.append(')');
		return result.toString();
	}

} //DesignPointImpl
