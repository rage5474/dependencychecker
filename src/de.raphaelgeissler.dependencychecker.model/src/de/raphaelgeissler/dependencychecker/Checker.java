/**
 */
package de.raphaelgeissler.dependencychecker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.raphaelgeissler.dependencychecker.Checker#getName <em>Name</em>}</li>
 *   <li>{@link de.raphaelgeissler.dependencychecker.Checker#getComponentDefinitions <em>Component Definitions</em>}</li>
 * </ul>
 *
 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getChecker()
 * @model
 * @generated
 */
public interface Checker extends EObject {
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
	 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getChecker_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.raphaelgeissler.dependencychecker.Checker#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Component Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.raphaelgeissler.dependencychecker.ComponentDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definitions</em>' containment reference list.
	 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getChecker_ComponentDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentDescription> getComponentDefinitions();

} // Checker
