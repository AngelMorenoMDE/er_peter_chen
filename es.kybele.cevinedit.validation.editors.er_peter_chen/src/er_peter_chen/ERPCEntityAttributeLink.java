/**
 */
package er_peter_chen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERPC Entity Attribute Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er_peter_chen.ERPCEntityAttributeLink#getEntity <em>Entity</em>}</li>
 *   <li>{@link er_peter_chen.ERPCEntityAttributeLink#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see er_peter_chen.Er_peter_chenPackage#getERPCEntityAttributeLink()
 * @model
 * @generated
 */
public interface ERPCEntityAttributeLink extends ERPCLink {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(ERPCEntity)
	 * @see er_peter_chen.Er_peter_chenPackage#getERPCEntityAttributeLink_Entity()
	 * @model required="true"
	 * @generated
	 */
	ERPCEntity getEntity();

	/**
	 * Sets the value of the '{@link er_peter_chen.ERPCEntityAttributeLink#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(ERPCEntity value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(ERPCAttribute)
	 * @see er_peter_chen.Er_peter_chenPackage#getERPCEntityAttributeLink_Attribute()
	 * @model required="true"
	 * @generated
	 */
	ERPCAttribute getAttribute();

	/**
	 * Sets the value of the '{@link er_peter_chen.ERPCEntityAttributeLink#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(ERPCAttribute value);

} // ERPCEntityAttributeLink
