/**
 */
package er_peter_chen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERPC Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er_peter_chen.ERPCDiagram#getLinks <em>Links</em>}</li>
 *   <li>{@link er_peter_chen.ERPCDiagram#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link er_peter_chen.ERPCDiagram#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link er_peter_chen.ERPCDiagram#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see er_peter_chen.Er_peter_chenPackage#getERPCDiagram()
 * @model
 * @generated
 */
public interface ERPCDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link er_peter_chen.ERPCLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see er_peter_chen.Er_peter_chenPackage#getERPCDiagram_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<ERPCLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link er_peter_chen.ERPCRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see er_peter_chen.Er_peter_chenPackage#getERPCDiagram_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<ERPCRelationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link er_peter_chen.ERPCAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see er_peter_chen.Er_peter_chenPackage#getERPCDiagram_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ERPCAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link er_peter_chen.ERPCEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see er_peter_chen.Er_peter_chenPackage#getERPCDiagram_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<ERPCEntity> getEntities();

} // ERPCDiagram
