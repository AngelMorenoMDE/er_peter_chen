/**
 */
package er_peter_chen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERPC Relationship Attribute Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er_peter_chen.ERPCRelationshipAttributeLink#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link er_peter_chen.ERPCRelationshipAttributeLink#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see er_peter_chen.Er_peter_chenPackage#getERPCRelationshipAttributeLink()
 * @model
 * @generated
 */
public interface ERPCRelationshipAttributeLink extends ERPCLink {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference.
	 * @see #setRelationship(ERPCRelationship)
	 * @see er_peter_chen.Er_peter_chenPackage#getERPCRelationshipAttributeLink_Relationship()
	 * @model required="true"
	 * @generated
	 */
	ERPCRelationship getRelationship();

	/**
	 * Sets the value of the '{@link er_peter_chen.ERPCRelationshipAttributeLink#getRelationship <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(ERPCRelationship value);

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
	 * @see er_peter_chen.Er_peter_chenPackage#getERPCRelationshipAttributeLink_Attribute()
	 * @model required="true"
	 * @generated
	 */
	ERPCAttribute getAttribute();

	/**
	 * Sets the value of the '{@link er_peter_chen.ERPCRelationshipAttributeLink#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(ERPCAttribute value);

} // ERPCRelationshipAttributeLink
