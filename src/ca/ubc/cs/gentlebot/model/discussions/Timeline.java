/**
 */
package ca.ubc.cs.gentlebot.model.discussions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Timeline</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.ubc.cs.gentlebot.model.discussions.DiscussionsPackage#getTimeline()
 * @model
 * @generated
 */
public enum Timeline implements Enumerator {
	/**
	 * The '<em><b>Pre commit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_COMMIT_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_COMMIT(0, "pre_commit", "pre_commit"),

	/**
	 * The '<em><b>Post commit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_COMMIT_VALUE
	 * @generated
	 * @ordered
	 */
	POST_COMMIT(1, "post_commit", "post_commit"),

	/**
	 * The '<em><b>Pre invitation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_INVITATION_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_INVITATION(2, "pre_invitation", "pre_invitation"),

	/**
	 * The '<em><b>Post invitation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_INVITATION_VALUE
	 * @generated
	 * @ordered
	 */
	POST_INVITATION(3, "post_invitation", "post_invitation");

	/**
	 * The '<em><b>Pre commit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pre commit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE_COMMIT
	 * @model name="pre_commit"
	 * @generated
	 * @ordered
	 */
	public static final int PRE_COMMIT_VALUE = 0;

	/**
	 * The '<em><b>Post commit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Post commit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_COMMIT
	 * @model name="post_commit"
	 * @generated
	 * @ordered
	 */
	public static final int POST_COMMIT_VALUE = 1;

	/**
	 * The '<em><b>Pre invitation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pre invitation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE_INVITATION
	 * @model name="pre_invitation"
	 * @generated
	 * @ordered
	 */
	public static final int PRE_INVITATION_VALUE = 2;

	/**
	 * The '<em><b>Post invitation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Post invitation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_INVITATION
	 * @model name="post_invitation"
	 * @generated
	 * @ordered
	 */
	public static final int POST_INVITATION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Timeline</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Timeline[] VALUES_ARRAY =
		new Timeline[] {
			PRE_COMMIT,
			POST_COMMIT,
			PRE_INVITATION,
			POST_INVITATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Timeline</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Timeline> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Timeline</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Timeline get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Timeline result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timeline</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Timeline getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Timeline result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timeline</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Timeline get(int value) {
		switch (value) {
			case PRE_COMMIT_VALUE: return PRE_COMMIT;
			case POST_COMMIT_VALUE: return POST_COMMIT;
			case PRE_INVITATION_VALUE: return PRE_INVITATION;
			case POST_INVITATION_VALUE: return POST_INVITATION;
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
	private Timeline(int value, String name, String literal) {
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
	
} //Timeline
