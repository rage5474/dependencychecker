/**
 */
package de.raphaelgeissler.dependencychecker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.raphaelgeissler.dependencychecker.ComponentDescription#getName <em>Name</em>}</li>
 *   <li>{@link de.raphaelgeissler.dependencychecker.ComponentDescription#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.raphaelgeissler.dependencychecker.ComponentDescription#getComponentItems <em>Component Items</em>}</li>
 * </ul>
 *
 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getComponentDescription()
 * @model
 * @generated
 */
public interface ComponentDescription extends EObject {
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
	 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getComponentDescription_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.raphaelgeissler.dependencychecker.ComponentDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference.
	 * @see #setDependencies(Dependencies)
	 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getComponentDescription_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	Dependencies getDependencies();

	/**
	 * Sets the value of the '{@link de.raphaelgeissler.dependencychecker.ComponentDescription#getDependencies <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies</em>' containment reference.
	 * @see #getDependencies()
	 * @generated
	 */
	void setDependencies(Dependencies value);

	/**
	 * Returns the value of the '<em><b>Component Items</b></em>' containment reference list.
	 * The list contents are of type {@link de.raphaelgeissler.dependencychecker.ComponentItemDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Items</em>' containment reference list.
	 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getComponentDescription_ComponentItems()
	 * @model containment="true"
	 *        extendedMetaData="name='groupentries'"
	 * @generated
	 */
	EList<ComponentItemDescription> getComponentItems();

} // ComponentDescription
