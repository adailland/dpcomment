/**
 */
package ca.ubc.cs.gentlebot.model.discussions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Form</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getForm()
 * @model
 * @generated
 */
public enum Form implements Enumerator {
	/**
	 * The '<em><b>Open Question</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_QUESTION_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_QUESTION(0, "openQuestion", "openQuestion"),

	/**
	 * The '<em><b>Candidate Enumeration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANDIDATE_ENUMERATION_VALUE
	 * @generated
	 * @ordered
	 */
	CANDIDATE_ENUMERATION(1, "candidateEnumeration", "candidateEnumeration"),

	/**
	 * The '<em><b>Solution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLUTION_VALUE
	 * @generated
	 * @ordered
	 */
	SOLUTION(2, "solution", "solution");

	/**
	 * The '<em><b>Open Question</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open Question</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_QUESTION
	 * @model name="openQuestion"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_QUESTION_VALUE = 0;

	/**
	 * The '<em><b>Candidate Enumeration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Candidate Enumeration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANDIDATE_ENUMERATION
	 * @model name="candidateEnumeration"
	 * @generated
	 * @ordered
	 */
	public static final int CANDIDATE_ENUMERATION_VALUE = 1;

	/**
	 * The '<em><b>Solution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solution</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLUTION
	 * @model name="solution"
	 * @generated
	 * @ordered
	 */
	public static final int SOLUTION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Form</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Form[] VALUES_ARRAY =
		new Form[] {
			OPEN_QUESTION,
			CANDIDATE_ENUMERATION,
			SOLUTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Form</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Form> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Form</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Form get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Form result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Form</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Form getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Form result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Form</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Form get(int value) {
		switch (value) {
			case OPEN_QUESTION_VALUE: return OPEN_QUESTION;
			case CANDIDATE_ENUMERATION_VALUE: return CANDIDATE_ENUMERATION;
			case SOLUTION_VALUE: return SOLUTION;
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
	private Form(int value, String name, String literal) {
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
	
} //Form
