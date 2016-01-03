/**
 */
package de.raphaelgeissler.dependencychecker.impl;

import de.raphaelgeissler.dependencychecker.ComponentItemDescription;
import de.raphaelgeissler.dependencychecker.DependencycheckerPackage;
import de.raphaelgeissler.dependencychecker.MatchType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Item Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.raphaelgeissler.dependencychecker.impl.ComponentItemDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.raphaelgeissler.dependencychecker.impl.ComponentItemDescriptionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.raphaelgeissler.dependencychecker.impl.ComponentItemDescriptionImpl#getMatchType <em>Match Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentItemDescriptionImpl extends MinimalEObjectImpl.Container implements ComponentItemDescription {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchType() <em>Match Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchType()
	 * @generated
	 * @ordered
	 */
	protected static final MatchType MATCH_TYPE_EDEFAULT = MatchType.STARTSWITH;

	/**
	 * The cached value of the '{@link #getMatchType() <em>Match Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchType()
	 * @generated
	 * @ordered
	 */
	protected MatchType matchType = MATCH_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependencycheckerPackage.Literals.COMPONENT_ITEM_DESCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchType getMatchType() {
		return matchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchType(MatchType newMatchType) {
		MatchType oldMatchType = matchType;
		matchType = newMatchType == null ? MATCH_TYPE_EDEFAULT : newMatchType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__MATCH_TYPE, oldMatchType, matchType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__NAME:
				return getName();
			case DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__VALUE:
				return getValue();
			case DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__MATCH_TYPE:
				return getMatchType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__NAME:
				setName((String)newValue);
				return;
			case DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__VALUE:
				setValue((String)newValue);
				return;
			case DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__MATCH_TYPE:
				setMatchType((MatchType)newValue);
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
			case DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__MATCH_TYPE:
				setMatchType(MATCH_TYPE_EDEFAULT);
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
			case DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case DependencycheckerPackage.COMPONENT_ITEM_DESCRIPTION__MATCH_TYPE:
				return matchType != MATCH_TYPE_EDEFAULT;
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
		result.append(", value: ");
		result.append(value);
		result.append(", matchType: ");
		result.append(matchType);
		result.append(')');
		return result.toString();
	}

} //ComponentItemDescriptionImpl
