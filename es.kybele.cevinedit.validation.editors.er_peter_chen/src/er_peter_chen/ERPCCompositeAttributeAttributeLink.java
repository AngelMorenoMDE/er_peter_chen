/**
 */
package er_peter_chen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERPC Composite Attribute Attribute Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er_peter_chen.ERPCCompositeAttributeAttributeLink#getCompositeAttribute <em>Composite Attribute</em>}</li>
 *   <li>{@link er_peter_chen.ERPCCompositeAttributeAttributeLink#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see er_peter_chen.Er_peter_chenPackage#getERPCCompositeAttributeAttributeLink()
 * @model
 * @generated
 */
public interface ERPCCompositeAttributeAttributeLink extends ERPCLink {
	/**
	 * Returns the value of the '<em><b>Composite Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Attribute</em>' reference.
	 * @see #setCompositeAttribute(ERPCCompositeAttribute)
	 * @see er_peter_chen.Er_peter_chenPackage#getERPCCompositeAttributeAttributeLink_CompositeAttribute()
	 * @model required="true"
	 * @generated
	 */
	ERPCCompositeAttribute getCompositeAttribute();

	/**
	 * Sets the value of the '{@link er_peter_chen.ERPCCompositeAttributeAttributeLink#getCompositeAttribute <em>Composite Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Attribute</em>' reference.
	 * @see #getCompositeAttribute()
	 * @generated
	 */
	void setCompositeAttribute(ERPCCompositeAttribute value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(ERPCRegularAttribute)
	 * @see er_peter_chen.Er_peter_chenPackage#getERPCCompositeAttributeAttributeLink_Attribute()
	 * @model required="true"
	 * @generated
	 */
	ERPCRegularAttribute getAttribute();

	/**
	 * Sets the value of the '{@link er_peter_chen.ERPCCompositeAttributeAttributeLink#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(ERPCRegularAttribute value);

} // ERPCCompositeAttributeAttributeLink
