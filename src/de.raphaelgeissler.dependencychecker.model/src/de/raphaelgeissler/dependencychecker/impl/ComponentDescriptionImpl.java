/**
 */
package de.raphaelgeissler.dependencychecker.impl;

import de.raphaelgeissler.dependencychecker.ComponentDescription;
import de.raphaelgeissler.dependencychecker.ComponentItemDescription;
import de.raphaelgeissler.dependencychecker.Dependencies;
import de.raphaelgeissler.dependencychecker.DependencycheckerPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link de.raphaelgeissler.dependencychecker.impl.ComponentDescriptionImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.raphaelgeissler.dependencychecker.impl.ComponentDescriptionImpl#getComponentItems <em>Component Items</em>}</li>
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
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected Dependencies dependencies;

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
	public Dependencies getDependencies() {
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencies(Dependencies newDependencies, NotificationChain msgs) {
		Dependencies oldDependencies = dependencies;
		dependencies = newDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencycheckerPackage.COMPONENT_DESCRIPTION__DEPENDENCIES, oldDependencies, newDependencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencies(Dependencies newDependencies) {
		if (newDependencies != dependencies) {
			NotificationChain msgs = null;
			if (dependencies != null)
				msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencycheckerPackage.COMPONENT_DESCRIPTION__DEPENDENCIES, null, msgs);
			if (newDependencies != null)
				msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencycheckerPackage.COMPONENT_DESCRIPTION__DEPENDENCIES, null, msgs);
			msgs = basicSetDependencies(newDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencycheckerPackage.COMPONENT_DESCRIPTION__DEPENDENCIES, newDependencies, newDependencies));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__DEPENDENCIES:
				return basicSetDependencies(null, msgs);
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__COMPONENT_ITEMS:
				return ((InternalEList<?>)getComponentItems()).basicRemove(otherEnd, msgs);
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
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__DEPENDENCIES:
				return getDependencies();
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__COMPONENT_ITEMS:
				return getComponentItems();
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
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__DEPENDENCIES:
				setDependencies((Dependencies)newValue);
				return;
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__COMPONENT_ITEMS:
				getComponentItems().clear();
				getComponentItems().addAll((Collection<? extends ComponentItemDescription>)newValue);
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
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__DEPENDENCIES:
				setDependencies((Dependencies)null);
				return;
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__COMPONENT_ITEMS:
				getComponentItems().clear();
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
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__DEPENDENCIES:
				return dependencies != null;
			case DependencycheckerPackage.COMPONENT_DESCRIPTION__COMPONENT_ITEMS:
				return componentItems != null && !componentItems.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ComponentDescriptionImpl
