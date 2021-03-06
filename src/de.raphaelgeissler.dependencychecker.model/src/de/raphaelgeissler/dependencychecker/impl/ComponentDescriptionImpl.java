/**
 */
package de.raphaelgeissler.dependencychecker.impl;

import de.raphaelgeissler.dependencychecker.ComponentDescription;
import de.raphaelgeissler.dependencychecker.ComponentItemDescription;
import de.raphaelgeissler.dependencychecker.DependencycheckerPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.raphaelgeissler.dependencychecker.impl.ComponentDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.raphaelgeissler.dependencychecker.impl.ComponentDescriptionImpl#getComponentItems <em>Component Items</em>}</li>
 *   <li>{@link de.raphaelgeissler.dependencychecker.impl.ComponentDescriptionImpl#getForbiddenComponents <em>Forbidden Components</em>}</li>
 *   <li>{@link de.raphaelgeissler.dependencychecker.impl.ComponentDescriptionImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDescriptionImpl extends MinimalEObjectImpl.Container implements ComponentDescription {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponentItems() <em>Component Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentItemDescription> componentItems;

	/**
	 * The cached value of the '{@link #getForbiddenComponents() <em>Forbidden Components</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForbiddenComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> forbiddenComponents;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentItemDescription> ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependencycheckerPackage.Literals.COMPONENT_DESCRIPTION;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencycheckerPackage.COMPONENT_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentItemDescription> getComponentItems() {
		if (componentItems == null) {
			componentItems = new EObjectContainmentEList<ComponentItemDescription>(ComponentItemDescription.class, this, DependencycheckerPackage.COMPONENT_DESCRIPTION__COMPONENT_ITEMS);
		}
		return componentItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getForbiddenComponents() {
		if (forbiddenComponents == null) {
			forbiddenComponents = new EDataTypeUniqueEList<String>(String.class, this, DependencycheckerPackage.COMPONENT_DESCRIPTION__FORBIDDEN_COMPONENTS);
		}
		return forbiddenComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentItemDescription> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<ComponentItemDescription>(ComponentItemDescription.class, this, DependencycheckerPackage.COMPONENT_DESCRIPTION__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__COMPONENT_ITEMS:
				return ((InternalEList<?>)getComponentItems()).basicRemove(otherEnd, msgs);
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__NAME:
				return getName();
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__COMPONENT_ITEMS:
				return getComponentItems();
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__FORBIDDEN_COMPONENTS:
				return getForbiddenComponents();
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__PORTS:
				return getPorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__NAME:
				setName((String)newValue);
				return;
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__COMPONENT_ITEMS:
				getComponentItems().clear();
				getComponentItems().addAll((Collection<? extends ComponentItemDescription>)newValue);
				return;
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__FORBIDDEN_COMPONENTS:
				getForbiddenComponents().clear();
				getForbiddenComponents().addAll((Collection<? extends String>)newValue);
				return;
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends ComponentItemDescription>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__COMPONENT_ITEMS:
				getComponentItems().clear();
				return;
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__FORBIDDEN_COMPONENTS:
				getForbiddenComponents().clear();
				return;
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__PORTS:
				getPorts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__COMPONENT_ITEMS:
				return componentItems != null && !componentItems.isEmpty();
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__FORBIDDEN_COMPONENTS:
				return forbiddenComponents != null && !forbiddenComponents.isEmpty();
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__PORTS:
				return ports != null && !ports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", forbiddenComponents: ");
		result.append(forbiddenComponents);
		result.append(')');
		return result.toString();
	}

} //ComponentDescriptionImpl
