/**
 */
package er_peter_chen.tests;

import er_peter_chen.ERPCRegularAttribute;
import er_peter_chen.Er_peter_chenFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ERPC Regular Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ERPCRegularAttributeTest extends ERPCAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ERPCRegularAttributeTest.class);
	}

	/**
	 * Constructs a new ERPC Regular Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCRegularAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ERPC Regular Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ERPCRegularAttribute getFixture() {
		return (ERPCRegularAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Er_peter_chenFactory.eINSTANCE.createERPCRegularAttribute());
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

} //ERPCRegularAttributeTest
