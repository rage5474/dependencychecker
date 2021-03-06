/**
 */
package de.raphaelgeissler.dependencychecker;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Item Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.raphaelgeissler.dependencychecker.ComponentItemDescription#getId <em>Id</em>}</li>
 *   <li>{@link de.raphaelgeissler.dependencychecker.ComponentItemDescription#getMatchType <em>Match Type</em>}</li>
 * </ul>
 *
 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getComponentItemDescription()
 * @model
 * @generated
 */
public interface ComponentItemDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getComponentItemDescription_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.raphaelgeissler.dependencychecker.ComponentItemDescription#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Match Type</b></em>' attribute.
	 * The default value is <code>"WILDCARD"</code>.
	 * The literals are from the enumeration {@link de.raphaelgeissler.dependencychecker.MatchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Type</em>' attribute.
	 * @see de.raphaelgeissler.dependencychecker.MatchType
	 * @see #setMatchType(MatchType)
	 * @see de.raphaelgeissler.dependencychecker.DependencycheckerPackage#getComponentItemDescription_MatchType()
	 * @model default="WILDCARD"
	 * @generated
	 */
	MatchType getMatchType();

	/**
	 * Sets the value of the '{@link de.raphaelgeissler.dependencychecker.ComponentItemDescription#getMatchType <em>Match Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Type</em>' attribute.
	 * @see de.raphaelgeissler.dependencychecker.MatchType
	 * @see #getMatchType()
	 * @generated
	 */
	void setMatchType(MatchType value);

} // ComponentItemDescription
