/**
 * generated by Xtext 2.9.1
 */
package de.ragedev.cdsl.cDSL.impl;

import de.ragedev.cdsl.cDSL.CDSLPackage;
import de.ragedev.cdsl.cDSL.ComponentDescription;
import de.ragedev.cdsl.cDSL.NotAllowedRef;
import de.ragedev.cdsl.cDSL.Ports;
import de.ragedev.cdsl.cDSL.UnitElements;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ragedev.cdsl.cDSL.impl.ComponentDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.ragedev.cdsl.cDSL.impl.ComponentDescriptionImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.ragedev.cdsl.cDSL.impl.ComponentDescriptionImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link de.ragedev.cdsl.cDSL.impl.ComponentDescriptionImpl#getNotAllowedRef <em>Not Allowed Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDescriptionImpl extends AbstractEntryImpl implements ComponentDescription
{
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
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected Ports ports;

  /**
   * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnits()
   * @generated
   * @ordered
   */
  protected UnitElements units;

  /**
   * The cached value of the '{@link #getNotAllowedRef() <em>Not Allowed Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotAllowedRef()
   * @generated
   * @ordered
   */
  protected NotAllowedRef notAllowedRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentDescriptionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CDSLPackage.Literals.COMPONENT_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CDSLPackage.COMPONENT_DESCRIPTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ports getPorts()
  {
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPorts(Ports newPorts, NotificationChain msgs)
  {
    Ports oldPorts = ports;
    ports = newPorts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDSLPackage.COMPONENT_DESCRIPTION__PORTS, oldPorts, newPorts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPorts(Ports newPorts)
  {
    if (newPorts != ports)
    {
      NotificationChain msgs = null;
      if (ports != null)
        msgs = ((InternalEObject)ports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDSLPackage.COMPONENT_DESCRIPTION__PORTS, null, msgs);
      if (newPorts != null)
        msgs = ((InternalEObject)newPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDSLPackage.COMPONENT_DESCRIPTION__PORTS, null, msgs);
      msgs = basicSetPorts(newPorts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CDSLPackage.COMPONENT_DESCRIPTION__PORTS, newPorts, newPorts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitElements getUnits()
  {
    return units;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnits(UnitElements newUnits, NotificationChain msgs)
  {
    UnitElements oldUnits = units;
    units = newUnits;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDSLPackage.COMPONENT_DESCRIPTION__UNITS, oldUnits, newUnits);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnits(UnitElements newUnits)
  {
    if (newUnits != units)
    {
      NotificationChain msgs = null;
      if (units != null)
        msgs = ((InternalEObject)units).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDSLPackage.COMPONENT_DESCRIPTION__UNITS, null, msgs);
      if (newUnits != null)
        msgs = ((InternalEObject)newUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDSLPackage.COMPONENT_DESCRIPTION__UNITS, null, msgs);
      msgs = basicSetUnits(newUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CDSLPackage.COMPONENT_DESCRIPTION__UNITS, newUnits, newUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotAllowedRef getNotAllowedRef()
  {
    return notAllowedRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNotAllowedRef(NotAllowedRef newNotAllowedRef, NotificationChain msgs)
  {
    NotAllowedRef oldNotAllowedRef = notAllowedRef;
    notAllowedRef = newNotAllowedRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDSLPackage.COMPONENT_DESCRIPTION__NOT_ALLOWED_REF, oldNotAllowedRef, newNotAllowedRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotAllowedRef(NotAllowedRef newNotAllowedRef)
  {
    if (newNotAllowedRef != notAllowedRef)
    {
      NotificationChain msgs = null;
      if (notAllowedRef != null)
        msgs = ((InternalEObject)notAllowedRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDSLPackage.COMPONENT_DESCRIPTION__NOT_ALLOWED_REF, null, msgs);
      if (newNotAllowedRef != null)
        msgs = ((InternalEObject)newNotAllowedRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDSLPackage.COMPONENT_DESCRIPTION__NOT_ALLOWED_REF, null, msgs);
      msgs = basicSetNotAllowedRef(newNotAllowedRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CDSLPackage.COMPONENT_DESCRIPTION__NOT_ALLOWED_REF, newNotAllowedRef, newNotAllowedRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CDSLPackage.COMPONENT_DESCRIPTION__PORTS:
        return basicSetPorts(null, msgs);
      case CDSLPackage.COMPONENT_DESCRIPTION__UNITS:
        return basicSetUnits(null, msgs);
      case CDSLPackage.COMPONENT_DESCRIPTION__NOT_ALLOWED_REF:
        return basicSetNotAllowedRef(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CDSLPackage.COMPONENT_DESCRIPTION__NAME:
        return getName();
      case CDSLPackage.COMPONENT_DESCRIPTION__PORTS:
        return getPorts();
      case CDSLPackage.COMPONENT_DESCRIPTION__UNITS:
        return getUnits();
      case CDSLPackage.COMPONENT_DESCRIPTION__NOT_ALLOWED_REF:
        return getNotAllowedRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CDSLPackage.COMPONENT_DESCRIPTION__NAME:
        setName((String)newValue);
        return;
      case CDSLPackage.COMPONENT_DESCRIPTION__PORTS:
        setPorts((Ports)newValue);
        return;
      case CDSLPackage.COMPONENT_DESCRIPTION__UNITS:
        setUnits((UnitElements)newValue);
        return;
      case CDSLPackage.COMPONENT_DESCRIPTION__NOT_ALLOWED_REF:
        setNotAllowedRef((NotAllowedRef)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CDSLPackage.COMPONENT_DESCRIPTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CDSLPackage.COMPONENT_DESCRIPTION__PORTS:
        setPorts((Ports)null);
        return;
      case CDSLPackage.COMPONENT_DESCRIPTION__UNITS:
        setUnits((UnitElements)null);
        return;
      case CDSLPackage.COMPONENT_DESCRIPTION__NOT_ALLOWED_REF:
        setNotAllowedRef((NotAllowedRef)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CDSLPackage.COMPONENT_DESCRIPTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CDSLPackage.COMPONENT_DESCRIPTION__PORTS:
        return ports != null;
      case CDSLPackage.COMPONENT_DESCRIPTION__UNITS:
        return units != null;
      case CDSLPackage.COMPONENT_DESCRIPTION__NOT_ALLOWED_REF:
        return notAllowedRef != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ComponentDescriptionImpl