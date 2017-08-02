/**
 */
package ca.ubc.cs.gentlebot.model.discussions.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.ubc.cs.gentlebot.model.discussions.Comment;
import ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage;
import ca.ubc.cs.gentlebot.model.discussions.Participant;
import ca.ubc.cs.gentlebot.model.discussions.Utterance;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Comment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.CommentImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.CommentImpl#getRawContent <em>Raw Content</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.CommentImpl#getNext <em>Next</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.CommentImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.CommentImpl#getId <em>Id</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.CommentImpl#getUtterances <em>Utterances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends MinimalEObjectImpl.Container implements Comment {
	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Participant author;

	/**
	 * The default value of the '{@link #getRawContent() <em>Raw Content</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRawContent()
	 * @generated
	 * @ordered
	 */
	protected static final String RAW_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRawContent() <em>Raw Content</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRawContent()
	 * @generated
	 * @ordered
	 */
	protected String rawContent = RAW_CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Comment next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Comment previous;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUtterances() <em>Utterances</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUtterances()
	 * @generated
	 * @ordered
	 */
	protected EList<Utterance> utterances;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiscussionsPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (Participant)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscussionsPackage.COMMENT__AUTHOR, oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Participant newAuthor) {
		Participant oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.COMMENT__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getRawContent() {
		return rawContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawContent(String newRawContent) {
		String oldRawContent = rawContent;
		rawContent = newRawContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.COMMENT__RAW_CONTENT, oldRawContent, rawContent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (Comment)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscussionsPackage.COMMENT__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(Comment newNext, NotificationChain msgs) {
		Comment oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiscussionsPackage.COMMENT__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Comment newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, DiscussionsPackage.COMMENT__PREVIOUS, Comment.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, DiscussionsPackage.COMMENT__PREVIOUS, Comment.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.COMMENT__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (Comment)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscussionsPackage.COMMENT__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(Comment newPrevious, NotificationChain msgs) {
		Comment oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiscussionsPackage.COMMENT__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(Comment newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, DiscussionsPackage.COMMENT__NEXT, Comment.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, DiscussionsPackage.COMMENT__NEXT, Comment.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.COMMENT__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.COMMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Utterance> getUtterances() {
		if (utterances == null) {
			utterances = new EObjectWithInverseResolvingEList<Utterance>(Utterance.class, this, DiscussionsPackage.COMMENT__UTTERANCES, DiscussionsPackage.UTTERANCE__COMMENT);
		}
		return utterances;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiscussionsPackage.COMMENT__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, DiscussionsPackage.COMMENT__PREVIOUS, Comment.class, msgs);
				return basicSetNext((Comment)otherEnd, msgs);
			case DiscussionsPackage.COMMENT__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, DiscussionsPackage.COMMENT__NEXT, Comment.class, msgs);
				return basicSetPrevious((Comment)otherEnd, msgs);
			case DiscussionsPackage.COMMENT__UTTERANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUtterances()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiscussionsPackage.COMMENT__NEXT:
				return basicSetNext(null, msgs);
			case DiscussionsPackage.COMMENT__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case DiscussionsPackage.COMMENT__UTTERANCES:
				return ((InternalEList<?>)getUtterances()).basicRemove(otherEnd, msgs);
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
			case DiscussionsPackage.COMMENT__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case DiscussionsPackage.COMMENT__RAW_CONTENT:
				return getRawContent();
			case DiscussionsPackage.COMMENT__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case DiscussionsPackage.COMMENT__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case DiscussionsPackage.COMMENT__ID:
				return getId();
			case DiscussionsPackage.COMMENT__UTTERANCES:
				return getUtterances();
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
			case DiscussionsPackage.COMMENT__AUTHOR:
				setAuthor((Participant)newValue);
				return;
			case DiscussionsPackage.COMMENT__RAW_CONTENT:
				setRawContent((String)newValue);
				return;
			case DiscussionsPackage.COMMENT__NEXT:
				setNext((Comment)newValue);
				return;
			case DiscussionsPackage.COMMENT__PREVIOUS:
				setPrevious((Comment)newValue);
				return;
			case DiscussionsPackage.COMMENT__ID:
				setId((Integer)newValue);
				return;
			case DiscussionsPackage.COMMENT__UTTERANCES:
				getUtterances().clear();
				getUtterances().addAll((Collection<? extends Utterance>)newValue);
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
			case DiscussionsPackage.COMMENT__AUTHOR:
				setAuthor((Participant)null);
				return;
			case DiscussionsPackage.COMMENT__RAW_CONTENT:
				setRawContent(RAW_CONTENT_EDEFAULT);
				return;
			case DiscussionsPackage.COMMENT__NEXT:
				setNext((Comment)null);
				return;
			case DiscussionsPackage.COMMENT__PREVIOUS:
				setPrevious((Comment)null);
				return;
			case DiscussionsPackage.COMMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case DiscussionsPackage.COMMENT__UTTERANCES:
				getUtterances().clear();
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
			case DiscussionsPackage.COMMENT__AUTHOR:
				return author != null;
			case DiscussionsPackage.COMMENT__RAW_CONTENT:
				return RAW_CONTENT_EDEFAULT == null ? rawContent != null : !RAW_CONTENT_EDEFAULT.equals(rawContent);
			case DiscussionsPackage.COMMENT__NEXT:
				return next != null;
			case DiscussionsPackage.COMMENT__PREVIOUS:
				return previous != null;
			case DiscussionsPackage.COMMENT__ID:
				return id != ID_EDEFAULT;
			case DiscussionsPackage.COMMENT__UTTERANCES:
				return utterances != null && !utterances.isEmpty();
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
			case DiscussionsPackage.COMMENT___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString() {
		// Ensure that you remove @generated or mark it @generated NOT
		// String prettyPrintedRawContent="";
		// if(Gentlebot.FOLD_COMMENTS)
		// for(String s: this.rawContent.split(System.lineSeparator()))
		// prettyPrintedRawContent+=s;
		// else
		// prettyPrintedRawContent=rawContent;
		// return this.id+"|"+this.author+">> "+prettyPrintedRawContent;

		String prettyUtterances = this.utterances==null || this.utterances.isEmpty() ? ""
				: this.utterances.stream().map(u -> u.toString()).reduce("\t", (s1, s2) -> s1 + "\n\t" + s2);

		return this.id + "|" + this.author + ">> " + prettyUtterances;
	}

} // CommentImpl
