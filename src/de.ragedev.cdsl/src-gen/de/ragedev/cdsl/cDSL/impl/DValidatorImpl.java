/**
 * generated by Xtext 2.9.1
 */
package de.ragedev.cdsl.cDSL.impl;

import de.ragedev.cdsl.cDSL.CDSLPackage;
import de.ragedev.cdsl.cDSL.ComponentDescription;
import de.ragedev.cdsl.cDSL.DValidator;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DValidator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ragedev.cdsl.cDSL.impl.DValidatorImpl#getValName <em>Val Name</em>}</li>
 *   <li>{@link de.ragedev.cdsl.cDSL.impl.DValidatorImpl#getRefComponents <em>Ref Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DValidatorImpl extends AbstractEntryImpl implements DValidator
{
  /**
   * The default value of the '{@link #getValName() <em>Val Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValName()
   * @generated
   * @ordered
   */
  protected static final String VAL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValName() <em>Val Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValName()
   * @generated
   * @ordered
   */
  protected String valName = VAL_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefComponents() <em>Ref Components</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefComponents()
   * @generated
   * @ordered
   */
  protected EList<ComponentDescription> refComponents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DValidatorImpl()
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
    return CDSLPackage.Literals.DVALIDATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValName()
  {
    return valName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValName(String newValName)
  {
    String oldValName = valName;
    valName = newValName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CDSLPackage.DVALIDATOR__VAL_NAME, oldValName, valName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentDescription> getRefComponents()
  {
    if (refComponents == null)
    {
      refComponents = new EObjectResolvingEList<ComponentDescription>(ComponentDescription.class, this, CDSLPackage.DVALIDATOR__REF_COMPONENTS);
    }
    return refComponents;
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
      case CDSLPackage.DVALIDATOR__VAL_NAME:
        return getValName();
      case CDSLPackage.DVALIDATOR__REF_COMPONENTS:
        return getRefComponents();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CDSLPackage.DVALIDATOR__VAL_NAME:
        setValName((String)newValue);
        return;
      case CDSLPackage.DVALIDATOR__REF_COMPONENTS:
        getRefComponents().clear();
        getRefComponents().addAll((Collection<? extends ComponentDescription>)newValue);
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
      case CDSLPackage.DVALIDATOR__VAL_NAME:
        setValName(VAL_NAME_EDEFAULT);
        return;
      case CDSLPackage.DVALIDATOR__REF_COMPONENTS:
        getRefComponents().clear();
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
      case CDSLPackage.DVALIDATOR__VAL_NAME:
        return VAL_NAME_EDEFAULT == null ? valName != null : !VAL_NAME_EDEFAULT.equals(valName);
      case CDSLPackage.DVALIDATOR__REF_COMPONENTS:
        return refComponents != null && !refComponents.isEmpty();
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
    result.append(" (valName: ");
    result.append(valName);
    result.append(')');
    return result.toString();
  }

} //DValidatorImpl