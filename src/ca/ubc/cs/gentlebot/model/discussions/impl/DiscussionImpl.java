/**
 */
package ca.ubc.cs.gentlebot.model.discussions.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.ubc.cs.gentlebot.model.discussions.Comment;
import ca.ubc.cs.gentlebot.model.discussions.DesignPoint;
import ca.ubc.cs.gentlebot.model.discussions.Discussion;
import ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage;
import ca.ubc.cs.gentlebot.model.discussions.Participant;
import ca.ubc.cs.gentlebot.model.discussions.Utterance;
import ca.ubc.cs.gentlebot.query.DiscussionARFFExporter;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Discussion</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.DiscussionImpl#getInvitedUsernames <em>Invited Usernames</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscussionImpl extends MinimalEObjectImpl.Container implements Discussion {
	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participants;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = "TITLE NOT SET";

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvitedUsernames() <em>Invited Usernames</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvitedUsernames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> invitedUsernames;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscussionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiscussionsPackage.Literals.DISCUSSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<Participant>(Participant.class, this, DiscussionsPackage.DISCUSSION__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentEList<Comment>(Comment.class, this, DiscussionsPackage.DISCUSSION__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.DISCUSSION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInvitedUsernames() {
		if (invitedUsernames == null) {
			invitedUsernames = new EDataTypeUniqueEList<String>(String.class, this, DiscussionsPackage.DISCUSSION__INVITED_USERNAMES);
		}
		return invitedUsernames;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String toString() {
		// Ensure that you remove @generated or mark it @generated NOT
		String nl = System.lineSeparator();
		String ret = "";
		ret += "Title: " + this.title + nl;
		ret += "---------------------------" + nl;
		ret += "Participants:" + nl;
		if (this.participants != null)
			for (Participant p : this.participants) {
				ret += p.toString() + ", ";
			}
		ret += nl + "---------------------------" + nl;
		ret += "Comments:" + nl;
		if (!this.comments.isEmpty())
			for (Comment c : this.comments)
				ret += c.toString() + nl;
		return ret;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String toARFF() {
		DiscussionARFFExporter e = new DiscussionARFFExporter(this);
		return e.getARFF();
	}

	/**
	 * <!-- begin-user-doc --> Return a list of all Utterances, ordered
	 * following the order of comments. <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Utterance> getAllUtterances() {
		BasicEList<Utterance> allUtterances = new BasicEList<Utterance>();
		for (Comment c : this.comments)
			for (Utterance u : c.getUtterances())
				allUtterances.add(u);
		return allUtterances;
	}

	/**
	 * <!-- begin-user-doc --> Return a list of all DesignPoints, ordered as
	 * encountered in the conversation. <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<DesignPoint> getAllDesignPoints() {
		BasicEList<DesignPoint> allDesignPoints = new BasicEList<DesignPoint>();
		for (Utterance u : this.getAllUtterances())
			for (DesignPoint d : u.getDescription().getDesignPoints())
				allDesignPoints.add(d);
		return allDesignPoints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiscussionsPackage.DISCUSSION__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case DiscussionsPackage.DISCUSSION__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiscussionsPackage.DISCUSSION__PARTICIPANTS:
				return getParticipants();
			case DiscussionsPackage.DISCUSSION__COMMENTS:
				return getComments();
			case DiscussionsPackage.DISCUSSION__TITLE:
				return getTitle();
			case DiscussionsPackage.DISCUSSION__INVITED_USERNAMES:
				return getInvitedUsernames();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiscussionsPackage.DISCUSSION__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant>)newValue);
				return;
			case DiscussionsPackage.DISCUSSION__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case DiscussionsPackage.DISCUSSION__TITLE:
				setTitle((String)newValue);
				return;
			case DiscussionsPackage.DISCUSSION__INVITED_USERNAMES:
				getInvitedUsernames().clear();
				getInvitedUsernames().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiscussionsPackage.DISCUSSION__PARTICIPANTS:
				getParticipants().clear();
				return;
			case DiscussionsPackage.DISCUSSION__COMMENTS:
				getComments().clear();
				return;
			case DiscussionsPackage.DISCUSSION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DiscussionsPackage.DISCUSSION__INVITED_USERNAMES:
				getInvitedUsernames().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiscussionsPackage.DISCUSSION__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case DiscussionsPackage.DISCUSSION__COMMENTS:
				return comments != null && !comments.isEmpty();
			case DiscussionsPackage.DISCUSSION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DiscussionsPackage.DISCUSSION__INVITED_USERNAMES:
				return invitedUsernames != null && !invitedUsernames.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DiscussionsPackage.DISCUSSION___TO_STRING:
				return toString();
			case DiscussionsPackage.DISCUSSION___TO_ARFF:
				return toARFF();
			case DiscussionsPackage.DISCUSSION___GET_ALL_UTTERANCES:
				return getAllUtterances();
			case DiscussionsPackage.DISCUSSION___GET_ALL_DESIGN_POINTS:
				return getAllDesignPoints();
		}
		return super.eInvoke(operationID, arguments);
	}

} // DiscussionImpl
