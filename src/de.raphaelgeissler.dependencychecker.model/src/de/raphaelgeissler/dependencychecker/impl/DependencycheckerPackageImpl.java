/**
 */
package de.raphaelgeissler.dependencychecker.impl;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.ComponentDescription;
import de.raphaelgeissler.dependencychecker.ComponentItemDescription;
import de.raphaelgeissler.dependencychecker.DependencycheckerFactory;
import de.raphaelgeissler.dependencychecker.DependencycheckerPackage;
import de.raphaelgeissler.dependencychecker.MatchType;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencycheckerPackageImpl extends EPackageImpl implements DependencycheckerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentItemDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum matchTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DependencycheckerPackageImpl() {
		super(eNS_URI, DependencycheckerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DependencycheckerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DependencycheckerPackage init() {
		if (isInited) return (DependencycheckerPackage)EPackage.Registry.INSTANCE.getEPackage(DependencycheckerPackage.eNS_URI);

		// Obtain or create and register package
		DependencycheckerPackageImpl theDependencycheckerPackage = (DependencycheckerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DependencycheckerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DependencycheckerPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDependencycheckerPackage.createPackageContents();

		// Initialize created meta-data
		theDependencycheckerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDependencycheckerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DependencycheckerPackage.eNS_URI, theDependencycheckerPackage);
		return theDependencycheckerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChecker() {
		return checkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChecker_Name() {
		return (EAttribute)checkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChecker_ComponentDefinitions() {
		return (EReference)checkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentDescription() {
		return componentDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDescription_Name() {
		return (EAttribute)componentDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDescription_ComponentItems() {
		return (EReference)componentDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDescription_ForbiddenComponents() {
		return (EAttribute)componentDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentItemDescription() {
		return componentItemDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentItemDescription_Id() {
		return (EAttribute)componentItemDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentItemDescription_MatchType() {
		return (EAttribute)componentItemDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMatchType() {
		return matchTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencycheckerFactory getDependencycheckerFactory() {
		return (DependencycheckerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		checkerEClass = createEClass(CHECKER);
		createEAttribute(checkerEClass, CHECKER__NAME);
		createEReference(checkerEClass, CHECKER__COMPONENT_DEFINITIONS);

		componentDescriptionEClass = createEClass(COMPONENT_DESCRIPTION);
		createEAttribute(componentDescriptionEClass, COMPONENT_DESCRIPTION__NAME);
		createEReference(componentDescriptionEClass, COMPONENT_DESCRIPTION__COMPONENT_ITEMS);
		createEAttribute(componentDescriptionEClass, COMPONENT_DESCRIPTION__FORBIDDEN_COMPONENTS);

		componentItemDescriptionEClass = createEClass(COMPONENT_ITEM_DESCRIPTION);
		createEAttribute(componentItemDescriptionEClass, COMPONENT_ITEM_DESCRIPTION__ID);
		createEAttribute(componentItemDescriptionEClass, COMPONENT_ITEM_DESCRIPTION__MATCH_TYPE);

		// Create enums
		matchTypeEEnum = createEEnum(MATCH_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(checkerEClass, Checker.class, "Checker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChecker_Name(), ecorePackage.getEString(), "name", null, 0, 1, Checker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChecker_ComponentDefinitions(), this.getComponentDescription(), null, "componentDefinitions", null, 0, -1, Checker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentDescriptionEClass, ComponentDescription.class, "ComponentDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentDescription_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentDescription_ComponentItems(), this.getComponentItemDescription(), null, "componentItems", null, 0, -1, ComponentDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentDescription_ForbiddenComponents(), ecorePackage.getEString(), "forbiddenComponents", null, 0, -1, ComponentDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentItemDescriptionEClass, ComponentItemDescription.class, "ComponentItemDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentItemDescription_Id(), ecorePackage.getEString(), "id", null, 0, 1, ComponentItemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentItemDescription_MatchType(), this.getMatchType(), "matchType", "WILDCARD", 0, 1, ComponentItemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(matchTypeEEnum, MatchType.class, "MatchType");
		addEEnumLiteral(matchTypeEEnum, MatchType.WILDCARD);
		addEEnumLiteral(matchTypeEEnum, MatchType.REGEX);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getComponentDescription_ComponentItems(), 
		   source, 
		   new String[] {
			 "name", "groupentries"
		   });
	}

} //DependencycheckerPackageImpl
