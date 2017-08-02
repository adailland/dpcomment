/**
 */
package ca.ubc.cs.gentlebot.model.discussions.impl;

import ca.ubc.cs.gentlebot.model.discussions.Comment;
import ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage;
import ca.ubc.cs.gentlebot.model.discussions.Utterance;

import ca.ubc.cs.gentlebot.model.discussions.UtteranceDescription;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Utterance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceImpl#getContent <em>Content</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.UtteranceImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtteranceImpl extends MinimalEObjectImpl.Container implements Utterance {
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
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected Comment comment;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected UtteranceDescription description;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtteranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiscussionsPackage.Literals.UTTERANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getComment() {
		if (comment != null && comment.eIsProxy()) {
			InternalEObject oldComment = (InternalEObject)comment;
			comment = (Comment)eResolveProxy(oldComment);
			if (comment != oldComment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscussionsPackage.UTTERANCE__COMMENT, oldComment, comment));
			}
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(Comment newComment, NotificationChain msgs) {
		Comment oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(Comment newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, DiscussionsPackage.COMMENT__UTTERANCES, Comment.class, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, DiscussionsPackage.COMMENT__UTTERANCES, Comment.class, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtteranceDescription getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (UtteranceDescription)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscussionsPackage.UTTERANCE__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtteranceDescription basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(UtteranceDescription newDescription, NotificationChain msgs) {
		UtteranceDescription oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(UtteranceDescription newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCE, UtteranceDescription.class, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCE, UtteranceDescription.class, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.UTTERANCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiscussionsPackage.UTTERANCE__COMMENT:
				if (comment != null)
					msgs = ((InternalEObject)comment).eInverseRemove(this, DiscussionsPackage.COMMENT__UTTERANCES, Comment.class, msgs);
				return basicSetComment((Comment)otherEnd, msgs);
			case DiscussionsPackage.UTTERANCE__DESCRIPTION:
				if (description != null)
					msgs = ((InternalEObject)description).eInverseRemove(this, DiscussionsPackage.UTTERANCE_DESCRIPTION__UTTERANCE, UtteranceDescription.class, msgs);
				return basicSetDescription((UtteranceDescription)otherEnd, msgs);
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
			case DiscussionsPackage.UTTERANCE__COMMENT:
				return basicSetComment(null, msgs);
			case DiscussionsPackage.UTTERANCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case DiscussionsPackage.UTTERANCE__CONTENT:
				return getContent();
			case DiscussionsPackage.UTTERANCE__COMMENT:
				if (resolve) return getComment();
				return basicGetComment();
			case DiscussionsPackage.UTTERANCE__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiscussionsPackage.UTTERANCE__CONTENT:
				setContent((String)newValue);
				return;
			case DiscussionsPackage.UTTERANCE__COMMENT:
				setComment((Comment)newValue);
				return;
			case DiscussionsPackage.UTTERANCE__DESCRIPTION:
				setDescription((UtteranceDescription)newValue);
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
			case DiscussionsPackage.UTTERANCE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case DiscussionsPackage.UTTERANCE__COMMENT:
				setComment((Comment)null);
				return;
			case DiscussionsPackage.UTTERANCE__DESCRIPTION:
				setDescription((UtteranceDescription)null);
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
			case DiscussionsPackage.UTTERANCE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case DiscussionsPackage.UTTERANCE__COMMENT:
				return comment != null;
			case DiscussionsPackage.UTTERANCE__DESCRIPTION:
				return description != null;
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
//		if (eIsProxy()) return super.toString();
//
//		StringBuffer result = new StringBuffer(super.toString());
//		result.append(" (content: ");
//		result.append(content);
//		result.append(')');
//		return result.toString();
		return "U> "+this.content+(this.description==null?"":System.lineSeparator()+"\t\t>>>> "+this.description);
	}

} //UtteranceImpl
