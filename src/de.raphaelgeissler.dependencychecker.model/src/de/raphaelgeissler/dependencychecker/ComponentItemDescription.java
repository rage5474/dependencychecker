/**
 */
package de.raphaelgeissler.dependencychecker;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Item Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.raphaelgeissler.dependencychecker.ComponentItemDescription#getName <em>Name</em>}</li>
 *   <li>{@link de.raphaelgeissler.dependencychecker.ComponentItemDescription#getValue <em>Value</em>}</li>
 *   <li>{@link de.raphaelgeissler.dependencychecker.ComponentItemDescription#getMatchType <em>Match Type</em>}</li>
 * </ul>
 *
 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getComponentItemDescription()
 * @model
 * @generated
 */
public interface ComponentItemDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getComponentItemDescription_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.raphaelgeissler.dependencychecker.ComponentItemDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getComponentItemDescription_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.raphaelgeissler.dependencychecker.ComponentItemDescription#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Match Type</b></em>' attribute.
	 * The default value is <code>"STARTSWITH"</code>.
	 * The literals are from the enumeration {@link de.raphaelgeissler.dependencychecker.MatchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Type</em>' attribute.
	 * @see de.raphaelgeissler.dependencychecker.MatchType
	 * @see #setMatchType(MatchType)
	 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getComponentItemDescription_MatchType()
	 * @model default="STARTSWITH"
	 * @generated
	 */
	MatchType getMatchType();

	/**
	 * Sets the value of the '{@link de.raphaelgeissler.dependencychecker.ComponentItemDescription#getMatchType <em>Match Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Type</em>' attribute.
	 * @see de.raphaelgeissler.dependencychecker.MatchType
	 * @see #getMatchType()
	 * @generated
	 */
	void setMatchType(MatchType value);

} // ComponentItemDescription
