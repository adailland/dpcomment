/**
 */
package ca.ubc.cs.gentlebot.model.discussions.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage;
import ca.ubc.cs.gentlebot.model.discussions.Participant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.ParticipantImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.impl.ParticipantImpl#isMember <em>Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends MinimalEObjectImpl.Container implements Participant {
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
	 * The default value of the '{@link #isMember() <em>Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMember()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEMBER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMember() <em>Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMember()
	 * @generated
	 * @ordered
	 */
	protected boolean member = MEMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiscussionsPackage.Literals.PARTICIPANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.PARTICIPANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMember() {
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMember(boolean newMember) {
		boolean oldMember = member;
		member = newMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscussionsPackage.PARTICIPANT__MEMBER, oldMember, member));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiscussionsPackage.PARTICIPANT__NAME:
				return getName();
			case DiscussionsPackage.PARTICIPANT__MEMBER:
				return isMember();
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
			case DiscussionsPackage.PARTICIPANT__NAME:
				setName((String)newValue);
				return;
			case DiscussionsPackage.PARTICIPANT__MEMBER:
				setMember((Boolean)newValue);
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
			case DiscussionsPackage.PARTICIPANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DiscussionsPackage.PARTICIPANT__MEMBER:
				setMember(MEMBER_EDEFAULT);
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
			case DiscussionsPackage.PARTICIPANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DiscussionsPackage.PARTICIPANT__MEMBER:
				return member != MEMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DiscussionsPackage.PARTICIPANT___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		// Ensure that you remove @generated or mark it @generated NOT
		return this.name+(this.isMember()?"(*)":"");
	}

} //ParticipantImpl
