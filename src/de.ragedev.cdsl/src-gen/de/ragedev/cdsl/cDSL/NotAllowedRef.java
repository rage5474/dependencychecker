/**
 * generated by Xtext 2.9.1
 */
package de.ragedev.cdsl.cDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Allowed Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ragedev.cdsl.cDSL.NotAllowedRef#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see de.ragedev.cdsl.cDSL.CDSLPackage#getNotAllowedRef()
 * @model
 * @generated
 */
public interface NotAllowedRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Units</b></em>' reference list.
   * The list contents are of type {@link de.ragedev.cdsl.cDSL.ComponentDescription}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Units</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Units</em>' reference list.
   * @see de.ragedev.cdsl.cDSL.CDSLPackage#getNotAllowedRef_Units()
   * @model
   * @generated
   */
  EList<ComponentDescription> getUnits();

} // NotAllowedRef
