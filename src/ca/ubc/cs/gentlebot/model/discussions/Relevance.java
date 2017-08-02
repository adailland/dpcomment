/**
 */
package ca.ubc.cs.gentlebot.model.discussions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relevance</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getRelevance()
 * @model
 * @generated
 */
public enum Relevance implements Enumerator {
	/**
	 * The '<em><b>Trivial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIVIAL_VALUE
	 * @generated
	 * @ordered
	 */
	TRIVIAL(0, "trivial", "trivial"),

	/**
	 * The '<em><b>Relevant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELEVANT_VALUE
	 * @generated
	 * @ordered
	 */
	RELEVANT(1, "relevant", "relevant"),

	/**
	 * The '<em><b>Critical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL(2, "critical", "critical");

	/**
	 * The '<em><b>Trivial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trivial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIVIAL
	 * @model name="trivial"
	 * @generated
	 * @ordered
	 */
	public static final int TRIVIAL_VALUE = 0;

	/**
	 * The '<em><b>Relevant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relevant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELEVANT
	 * @model name="relevant"
	 * @generated
	 * @ordered
	 */
	public static final int RELEVANT_VALUE = 1;

	/**
	 * The '<em><b>Critical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Critical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRITICAL
	 * @model name="critical"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Relevance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Relevance[] VALUES_ARRAY =
		new Relevance[] {
			TRIVIAL,
			RELEVANT,
			CRITICAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Relevance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Relevance> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relevance</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Relevance get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Relevance result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relevance</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Relevance getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Relevance result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relevance</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Relevance get(int value) {
		switch (value) {
			case TRIVIAL_VALUE: return TRIVIAL;
			case RELEVANT_VALUE: return RELEVANT;
			case CRITICAL_VALUE: return CRITICAL;
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
	private Relevance(int value, String name, String literal) {
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
	
} //Relevance
