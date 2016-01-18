/**
 */
package de.raphaelgeissler.dependencychecker;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage
 * @generated
 */
public interface DependencycheckerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DependencycheckerFactory eINSTANCE = de.raphaelgeissler.dependencychecker.impl.DependencycheckerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Checker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checker</em>'.
	 * @generated
	 */
	Checker createChecker();

	/**
	 * Returns a new object of class '<em>Component Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Description</em>'.
	 * @generated
	 */
	ComponentDescription createComponentDescription();

	/**
	 * Returns a new object of class '<em>Component Item Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Item Description</em>'.
	 * @generated
	 */
	ComponentItemDescription createComponentItemDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DependencycheckerPackage getDependencycheckerPackage();

} //DependencycheckerFactory
