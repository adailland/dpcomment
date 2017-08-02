/**
 */
package ca.ubc.cs.gentlebot.model.discussions.impl;

import ca.ubc.cs.gentlebot.model.discussions.DesignPoint;
import ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage;
import ca.ubc.cs.gentlebot.model.discussions.Relationship;
import ca.ubc.cs.gentlebot.model.discussions.RelationshipType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.RelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.RelationshipImpl#getDesignpoint <em>Designpoint</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RelationshipType TYPE_EDEFAULT = RelationshipType.NEW;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RelationshipType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDesignpoint() <em>Designpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignpoint()
	 * @generated
	 * @ordered
	 */
	protected DesignPoint designpoint;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected DesignPoint target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiscussionsPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RelationshipType newType) {
		RelationshipType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.RELATIONSHIP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPoint getDesignpoint() {
		if (designpoint != null && designpoint.eIsProxy()) {
			InternalEObject oldDesignpoint = (InternalEObject)designpoint;
			designpoint = (DesignPoint)eResolveProxy(oldDesignpoint);
			if (designpoint != oldDesignpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscussionsPackage.RELATIONSHIP__DESIGNPOINT, oldDesignpoint, designpoint));
			}
		}
		return designpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPoint basicGetDesignpoint() {
		return designpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignpoint(DesignPoint newDesignpoint, NotificationChain msgs) {
		DesignPoint oldDesignpoint = designpoint;
		designpoint = newDesignpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiscussionsPackage.RELATIONSHIP__DESIGNPOINT, oldDesignpoint, newDesignpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignpoint(DesignPoint newDesignpoint) {
		if (newDesignpoint != designpoint) {
			NotificationChain msgs = null;
			if (designpoint != null)
				msgs = ((InternalEObject)designpoint).eInverseRemove(this, DiscussionsPackage.DESIGN_POINT__RELATIONSHIP, DesignPoint.class, msgs);
			if (newDesignpoint != null)
				msgs = ((InternalEObject)newDesignpoint).eInverseAdd(this, DiscussionsPackage.DESIGN_POINT__RELATIONSHIP, DesignPoint.class, msgs);
			msgs = basicSetDesignpoint(newDesignpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.RELATIONSHIP__DESIGNPOINT, newDesignpoint, newDesignpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPoint getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (DesignPoint)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscussionsPackage.RELATIONSHIP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPoint basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(DesignPoint newTarget) {
		DesignPoint oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.RELATIONSHIP__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiscussionsPackage.RELATIONSHIP__DESIGNPOINT:
				if (designpoint != null)
					msgs = ((InternalEObject)designpoint).eInverseRemove(this, DiscussionsPackage.DESIGN_POINT__RELATIONSHIP, DesignPoint.class, msgs);
				return basicSetDesignpoint((DesignPoint)otherEnd, msgs);
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
			case DiscussionsPackage.RELATIONSHIP__DESIGNPOINT:
				return basicSetDesignpoint(null, msgs);
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
			case DiscussionsPackage.RELATIONSHIP__TYPE:
				return getType();
			case DiscussionsPackage.RELATIONSHIP__DESIGNPOINT:
				if (resolve) return getDesignpoint();
				return basicGetDesignpoint();
			case DiscussionsPackage.RELATIONSHIP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case DiscussionsPackage.RELATIONSHIP__TYPE:
				setType((RelationshipType)newValue);
				return;
			case DiscussionsPackage.RELATIONSHIP__DESIGNPOINT:
				setDesignpoint((DesignPoint)newValue);
				return;
			case DiscussionsPackage.RELATIONSHIP__TARGET:
				setTarget((DesignPoint)newValue);
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
			case DiscussionsPackage.RELATIONSHIP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DiscussionsPackage.RELATIONSHIP__DESIGNPOINT:
				setDesignpoint((DesignPoint)null);
				return;
			case DiscussionsPackage.RELATIONSHIP__TARGET:
				setTarget((DesignPoint)null);
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
			case DiscussionsPackage.RELATIONSHIP__TYPE:
				return type != TYPE_EDEFAULT;
			case DiscussionsPackage.RELATIONSHIP__DESIGNPOINT:
				return designpoint != null;
			case DiscussionsPackage.RELATIONSHIP__TARGET:
				return target != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
