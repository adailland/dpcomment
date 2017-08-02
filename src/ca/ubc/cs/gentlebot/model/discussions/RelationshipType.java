/**
 */
package ca.ubc.cs.gentlebot.model.discussions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relationship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getRelationshipType()
 * @model
 * @generated
 */
public enum RelationshipType implements Enumerator {
	/**
	 * The '<em><b>New</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_VALUE
	 * @generated
	 * @ordered
	 */
	NEW(0, "new", "new"),

	/**
	 * The '<em><b>Elaborates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELABORATES_VALUE
	 * @generated
	 * @ordered
	 */
	ELABORATES(1, "elaborates", "elaborates"),

	/**
	 * The '<em><b>Generalizes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERALIZES_VALUE
	 * @generated
	 * @ordered
	 */
	GENERALIZES(2, "generalizes", "generalizes"),

	/**
	 * The '<em><b>Reframes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFRAMES_VALUE
	 * @generated
	 * @ordered
	 */
	REFRAMES(3, "reframes", "reframes");

	/**
	 * The '<em><b>New</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>New</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEW
	 * @model name="new"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_VALUE = 0;

	/**
	 * The '<em><b>Elaborates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Elaborates</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELABORATES
	 * @model name="elaborates"
	 * @generated
	 * @ordered
	 */
	public static final int ELABORATES_VALUE = 1;

	/**
	 * The '<em><b>Generalizes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generalizes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERALIZES
	 * @model name="generalizes"
	 * @generated
	 * @ordered
	 */
	public static final int GENERALIZES_VALUE = 2;

	/**
	 * The '<em><b>Reframes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reframes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFRAMES
	 * @model name="reframes"
	 * @generated
	 * @ordered
	 */
	public static final int REFRAMES_VALUE = 3;

	/**
	 * An array of all the '<em><b>Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationshipType[] VALUES_ARRAY =
		new RelationshipType[] {
			NEW,
			ELABORATES,
			GENERALIZES,
			REFRAMES,
		};

	/**
	 * A public read-only list of all the '<em><b>Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationshipType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationshipType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationshipType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationshipType get(int value) {
		switch (value) {
			case NEW_VALUE: return NEW;
			case ELABORATES_VALUE: return ELABORATES;
			case GENERALIZES_VALUE: return GENERALIZES;
			case REFRAMES_VALUE: return REFRAMES;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RelationshipType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RelationshipType
