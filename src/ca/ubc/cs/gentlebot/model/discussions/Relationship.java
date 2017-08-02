/**
 */
package ca.ubc.cs.gentlebot.model.discussions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Relationship#getType <em>Type</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Relationship#getDesignpoint <em>Designpoint</em>}</li>
 *   <li>{@link ca.ubc.cs.gentlebot.model.discussions.Relationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.ubc.cs.gentlebot.model.discussions.RelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ca.ubc.cs.gentlebot.model.discussions.RelationshipType
	 * @see #setType(RelationshipType)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getRelationship_Type()
	 * @model required="true"
	 * @generated
	 */
	RelationshipType getType();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ca.ubc.cs.gentlebot.model.discussions.RelationshipType
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationshipType value);

	/**
	 * Returns the value of the '<em><b>Designpoint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designpoint</em>' reference.
	 * @see #setDesignpoint(DesignPoint)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getRelationship_Designpoint()
	 * @see ca.ubc.cs.gentlebot.model.discussions.DesignPoint#getRelationship
	 * @model opposite="relationship" required="true"
	 * @generated
	 */
	DesignPoint getDesignpoint();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.Relationship#getDesignpoint <em>Designpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designpoint</em>' reference.
	 * @see #getDesignpoint()
	 * @generated
	 */
	void setDesignpoint(DesignPoint value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DesignPoint)
	 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getRelationship_Target()
	 * @model
	 * @generated
	 */
	DesignPoint getTarget();

	/**
	 * Sets the value of the '{@link ca.ubc.cs.gentlebot.model.discussions.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DesignPoint value);

} // Relationship
