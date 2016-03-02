/**
 */
package er_peter_chen.tests;

import er_peter_chen.ERPCRelationshipAttributeLink;
import er_peter_chen.Er_peter_chenFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ERPC Relationship Attribute Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ERPCRelationshipAttributeLinkTest extends ERPCLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ERPCRelationshipAttributeLinkTest.class);
	}

	/**
	 * Constructs a new ERPC Relationship Attribute Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCRelationshipAttributeLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ERPC Relationship Attribute Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ERPCRelationshipAttributeLink getFixture() {
		return (ERPCRelationshipAttributeLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Er_peter_chenFactory.eINSTANCE.createERPCRelationshipAttributeLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ERPCRelationshipAttributeLinkTest
