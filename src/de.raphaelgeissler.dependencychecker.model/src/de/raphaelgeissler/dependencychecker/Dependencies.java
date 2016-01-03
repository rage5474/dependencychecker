/**
 */
package de.raphaelgeissler.dependencychecker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.raphaelgeissler.dependencychecker.Dependencies#getType <em>Type</em>}</li>
 *   <li>{@link de.raphaelgeissler.dependencychecker.Dependencies#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getDependencies()
 * @model
 * @generated
 */
public interface Dependencies extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.raphaelgeissler.dependencychecker.SelectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.raphaelgeissler.dependencychecker.SelectionType
	 * @see #setType(SelectionType)
	 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getDependencies_Type()
	 * @model
	 * @generated
	 */
	SelectionType getType();

	/**
	 * Sets the value of the '{@link de.raphaelgeissler.dependencychecker.Dependencies#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.raphaelgeissler.dependencychecker.SelectionType
	 * @see #getType()
	 * @generated
	 */
	void setType(SelectionType value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' attribute list.
	 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getDependencies_Components()
	 * @model
	 * @generated
	 */
	EList<String> getComponents();

} // Dependencies
