/**
 */
package ca.ubc.cs.gentlebot.model.discussions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Theme</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getTheme()
 * @model
 * @generated
 */
public enum Theme implements Enumerator {
	/**
	 * The '<em><b>Structure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE(0, "structure", "structure"),

	/**
	 * The '<em><b>Naming</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMING_VALUE
	 * @generated
	 * @ordered
	 */
	NAMING(1, "naming", "naming"),

	/**
	 * The '<em><b>Requirements</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIREMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIREMENTS(2, "requirements", "requirements"),

	/**
	 * The '<em><b>Functionality</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONALITY_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTIONALITY(3, "functionality", "functionality"),

	/**
	 * The '<em><b>Performance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERFORMANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PERFORMANCE(4, "performance", "performance"),

	/**
	 * The '<em><b>Maintainability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTAINABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	MAINTAINABILITY(5, "maintainability", "maintainability"),

	/**
	 * The '<em><b>Usability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	USABILITY(6, "usability", "usability"),

	/**
	 * The '<em><b>Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY(7, "security", "security"),

	/**
	 * The '<em><b>Implementation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTATION(8, "implementation", "implementation"),

	/**
	 * The '<em><b>Lifecycle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFECYCLE_VALUE
	 * @generated
	 * @ordered
	 */
	LIFECYCLE(9, "lifecycle", "lifecycle");

	/**
	 * The '<em><b>Structure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Structure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE
	 * @model name="structure"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_VALUE = 0;

	/**
	 * The '<em><b>Naming</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Naming</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAMING
	 * @model name="naming"
	 * @generated
	 * @ordered
	 */
	public static final int NAMING_VALUE = 1;

	/**
	 * The '<em><b>Requirements</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Requirements</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUIREMENTS
	 * @model name="requirements"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENTS_VALUE = 2;

	/**
	 * The '<em><b>Functionality</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Functionality</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONALITY
	 * @model name="functionality"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTIONALITY_VALUE = 3;

	/**
	 * The '<em><b>Performance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Performance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERFORMANCE
	 * @model name="performance"
	 * @generated
	 * @ordered
	 */
	public static final int PERFORMANCE_VALUE = 4;

	/**
	 * The '<em><b>Maintainability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maintainability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAINTAINABILITY
	 * @model name="maintainability"
	 * @generated
	 * @ordered
	 */
	public static final int MAINTAINABILITY_VALUE = 5;

	/**
	 * The '<em><b>Usability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Usability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USABILITY
	 * @model name="usability"
	 * @generated
	 * @ordered
	 */
	public static final int USABILITY_VALUE = 6;

	/**
	 * The '<em><b>Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Security</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECURITY
	 * @model name="security"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_VALUE = 7;

	/**
	 * The '<em><b>Implementation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Implementation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTATION
	 * @model name="implementation"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTATION_VALUE = 8;

	/**
	 * The '<em><b>Lifecycle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lifecycle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIFECYCLE
	 * @model name="lifecycle"
	 * @generated
	 * @ordered
	 */
	public static final int LIFECYCLE_VALUE = 9;

	/**
	 * An array of all the '<em><b>Theme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Theme[] VALUES_ARRAY =
		new Theme[] {
			STRUCTURE,
			NAMING,
			REQUIREMENTS,
			FUNCTIONALITY,
			PERFORMANCE,
			MAINTAINABILITY,
			USABILITY,
			SECURITY,
			IMPLEMENTATION,
			LIFECYCLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Theme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Theme> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Theme</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Theme get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Theme result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Theme</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Theme getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Theme result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Theme</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Theme get(int value) {
		switch (value) {
			case STRUCTURE_VALUE: return STRUCTURE;
			case NAMING_VALUE: return NAMING;
			case REQUIREMENTS_VALUE: return REQUIREMENTS;
			case FUNCTIONALITY_VALUE: return FUNCTIONALITY;
			case PERFORMANCE_VALUE: return PERFORMANCE;
			case MAINTAINABILITY_VALUE: return MAINTAINABILITY;
			case USABILITY_VALUE: return USABILITY;
			case SECURITY_VALUE: return SECURITY;
			case IMPLEMENTATION_VALUE: return IMPLEMENTATION;
			case LIFECYCLE_VALUE: return LIFECYCLE;
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
	private Theme(int value, String name, String literal) {
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
	
} //Theme
