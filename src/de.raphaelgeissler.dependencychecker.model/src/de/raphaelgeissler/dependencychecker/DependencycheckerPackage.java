/**
 */
package de.raphaelgeissler.dependencychecker;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.raphaelgeissler.dependencychecker.DependencycheckerFactory
 * @model kind="package"
 * @generated
 */
public interface DependencycheckerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dependencychecker";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dependencychecker";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dependencychecker";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DependencycheckerPackage eINSTANCE = de.raphaelgeissler.dependencychecker.impl.DependencycheckerPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.raphaelgeissler.dependencychecker.impl.CheckerImpl <em>Checker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.raphaelgeissler.dependencychecker.impl.CheckerImpl
	 * @see de.raphaelgeissler.dependencychecker.impl.DependencycheckerPackageImpl#getChecker()
	 * @generated
	 */
	int CHECKER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Component Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKER__COMPONENT_DEFINITIONS = 1;

	/**
	 * The number of structural features of the '<em>Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.raphaelgeissler.dependencychecker.impl.ComponentDescriptionImpl <em>Component Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.raphaelgeissler.dependencychecker.impl.ComponentDescriptionImpl
	 * @see de.raphaelgeissler.dependencychecker.impl.DependencycheckerPackageImpl#getComponentDescription()
	 * @generated
	 */
	int COMPONENT_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DESCRIPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Component Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DESCRIPTION__COMPONENT_ITEMS = 1;

	/**
	 * The feature id for the '<em><b>Forbidden Components</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DESCRIPTION__FORBIDDEN_COMPONENTS = 2;

	/**
	 * The number of structural features of the '<em>Component Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DESCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.raphaelgeissler.dependencychecker.impl.ComponentItemDescriptionImpl <em>Component Item Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.raphaelgeissler.dependencychecker.impl.ComponentItemDescriptionImpl
	 * @see de.raphaelgeissler.dependencychecker.impl.DependencycheckerPackageImpl#getComponentItemDescription()
	 * @generated
	 */
	int COMPONENT_ITEM_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ITEM_DESCRIPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ITEM_DESCRIPTION__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Match Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ITEM_DESCRIPTION__MATCH_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Component Item Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ITEM_DESCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component Item Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ITEM_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.raphaelgeissler.dependencychecker.MatchType <em>Match Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.raphaelgeissler.dependencychecker.MatchType
	 * @see de.raphaelgeissler.dependencychecker.impl.DependencycheckerPackageImpl#getMatchType()
	 * @generated
	 */
	int MATCH_TYPE = 3;

	/**
	 * Returns the meta object for class '{@link de.raphaelgeissler.dependencychecker.Checker <em>Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checker</em>'.
	 * @see de.raphaelgeissler.dependencychecker.Checker
	 * @generated
	 */
	EClass getChecker();

	/**
	 * Returns the meta object for the attribute '{@link de.raphaelgeissler.dependencychecker.Checker#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.raphaelgeissler.dependencychecker.Checker#getName()
	 * @see #getChecker()
	 * @generated
	 */
	EAttribute getChecker_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.raphaelgeissler.dependencychecker.Checker#getComponentDefinitions <em>Component Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Definitions</em>'.
	 * @see de.raphaelgeissler.dependencychecker.Checker#getComponentDefinitions()
	 * @see #getChecker()
	 * @generated
	 */
	EReference getChecker_ComponentDefinitions();

	/**
	 * Returns the meta object for class '{@link de.raphaelgeissler.dependencychecker.ComponentDescription <em>Component Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Description</em>'.
	 * @see de.raphaelgeissler.dependencychecker.ComponentDescription
	 * @generated
	 */
	EClass getComponentDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.raphaelgeissler.dependencychecker.ComponentDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.raphaelgeissler.dependencychecker.ComponentDescription#getName()
	 * @see #getComponentDescription()
	 * @generated
	 */
	EAttribute getComponentDescription_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.raphaelgeissler.dependencychecker.ComponentDescription#getComponentItems <em>Component Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Items</em>'.
	 * @see de.raphaelgeissler.dependencychecker.ComponentDescription#getComponentItems()
	 * @see #getComponentDescription()
	 * @generated
	 */
	EReference getComponentDescription_ComponentItems();

	/**
	 * Returns the meta object for the attribute list '{@link de.raphaelgeissler.dependencychecker.ComponentDescription#getForbiddenComponents <em>Forbidden Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Forbidden Components</em>'.
	 * @see de.raphaelgeissler.dependencychecker.ComponentDescription#getForbiddenComponents()
	 * @see #getComponentDescription()
	 * @generated
	 */
	EAttribute getComponentDescription_ForbiddenComponents();

	/**
	 * Returns the meta object for class '{@link de.raphaelgeissler.dependencychecker.ComponentItemDescription <em>Component Item Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Item Description</em>'.
	 * @see de.raphaelgeissler.dependencychecker.ComponentItemDescription
	 * @generated
	 */
	EClass getComponentItemDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.raphaelgeissler.dependencychecker.ComponentItemDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.raphaelgeissler.dependencychecker.ComponentItemDescription#getName()
	 * @see #getComponentItemDescription()
	 * @generated
	 */
	EAttribute getComponentItemDescription_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.raphaelgeissler.dependencychecker.ComponentItemDescription#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.raphaelgeissler.dependencychecker.ComponentItemDescription#getValue()
	 * @see #getComponentItemDescription()
	 * @generated
	 */
	EAttribute getComponentItemDescription_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.raphaelgeissler.dependencychecker.ComponentItemDescription#getMatchType <em>Match Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Type</em>'.
	 * @see de.raphaelgeissler.dependencychecker.ComponentItemDescription#getMatchType()
	 * @see #getComponentItemDescription()
	 * @generated
	 */
	EAttribute getComponentItemDescription_MatchType();

	/**
	 * Returns the meta object for enum '{@link de.raphaelgeissler.dependencychecker.MatchType <em>Match Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Match Type</em>'.
	 * @see de.raphaelgeissler.dependencychecker.MatchType
	 * @generated
	 */
	EEnum getMatchType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DependencycheckerFactory getDependencycheckerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.raphaelgeissler.dependencychecker.impl.CheckerImpl <em>Checker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.raphaelgeissler.dependencychecker.impl.CheckerImpl
		 * @see de.raphaelgeissler.dependencychecker.impl.DependencycheckerPackageImpl#getChecker()
		 * @generated
		 */
		EClass CHECKER = eINSTANCE.getChecker();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKER__NAME = eINSTANCE.getChecker_Name();

		/**
		 * The meta object literal for the '<em><b>Component Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKER__COMPONENT_DEFINITIONS = eINSTANCE.getChecker_ComponentDefinitions();

		/**
		 * The meta object literal for the '{@link de.raphaelgeissler.dependencychecker.impl.ComponentDescriptionImpl <em>Component Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.raphaelgeissler.dependencychecker.impl.ComponentDescriptionImpl
		 * @see de.raphaelgeissler.dependencychecker.impl.DependencycheckerPackageImpl#getComponentDescription()
		 * @generated
		 */
		EClass COMPONENT_DESCRIPTION = eINSTANCE.getComponentDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DESCRIPTION__NAME = eINSTANCE.getComponentDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Component Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DESCRIPTION__COMPONENT_ITEMS = eINSTANCE.getComponentDescription_ComponentItems();

		/**
		 * The meta object literal for the '<em><b>Forbidden Components</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DESCRIPTION__FORBIDDEN_COMPONENTS = eINSTANCE.getComponentDescription_ForbiddenComponents();

		/**
		 * The meta object literal for the '{@link de.raphaelgeissler.dependencychecker.impl.ComponentItemDescriptionImpl <em>Component Item Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.raphaelgeissler.dependencychecker.impl.ComponentItemDescriptionImpl
		 * @see de.raphaelgeissler.dependencychecker.impl.DependencycheckerPackageImpl#getComponentItemDescription()
		 * @generated
		 */
		EClass COMPONENT_ITEM_DESCRIPTION = eINSTANCE.getComponentItemDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ITEM_DESCRIPTION__NAME = eINSTANCE.getComponentItemDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ITEM_DESCRIPTION__VALUE = eINSTANCE.getComponentItemDescription_Value();

		/**
		 * The meta object literal for the '<em><b>Match Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ITEM_DESCRIPTION__MATCH_TYPE = eINSTANCE.getComponentItemDescription_MatchType();

		/**
		 * The meta object literal for the '{@link de.raphaelgeissler.dependencychecker.MatchType <em>Match Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.raphaelgeissler.dependencychecker.MatchType
		 * @see de.raphaelgeissler.dependencychecker.impl.DependencycheckerPackageImpl#getMatchType()
		 * @generated
		 */
		EEnum MATCH_TYPE = eINSTANCE.getMatchType();

	}

} //DependencycheckerPackage
