/**
 */
package de.raphaelgeissler.dependencychecker.impl;

import de.raphaelgeissler.dependencychecker.Dependencies;
import de.raphaelgeissler.dependencychecker.DependencycheckerPackage;
import de.raphaelgeissler.dependencychecker.SelectionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.raphaelgeissler.dependencychecker.impl.DependenciesImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.raphaelgeissler.dependencychecker.impl.DependenciesImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependenciesImpl extends MinimalEObjectImpl.Container implements Dependencies {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SelectionType TYPE_EDEFAULT = SelectionType.EXCLUDE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SelectionType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependenciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependencycheckerPackage.Literals.DEPENDENCIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SelectionType newType) {
		SelectionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencycheckerPackage.DEPENDENCIES__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getComponents() {
		if (components == null) {
			components = new EDataTypeUniqueEList<String>(String.class, this, DependencycheckerPackage.DEPENDENCIES__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependencycheckerPackage.DEPENDENCIES__TYPE:
				return getType();
			case DependencycheckerPackage.DEPENDENCIES__COMPONENTS:
				return getComponents();
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
			case DependencycheckerPackage.DEPENDENCIES__TYPE:
				setType((SelectionType)newValue);
				return;
			case DependencycheckerPackage.DEPENDENCIES__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends String>)newValue);
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
			case DependencycheckerPackage.DEPENDENCIES__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DependencycheckerPackage.DEPENDENCIES__COMPONENTS:
				getComponents().clear();
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
			case DependencycheckerPackage.DEPENDENCIES__TYPE:
				return type != TYPE_EDEFAULT;
			case DependencycheckerPackage.DEPENDENCIES__COMPONENTS:
				return components != null && !components.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", components: ");
		result.append(components);
		result.append(')');
		return result.toString();
	}

} //DependenciesImpl
