/**
 */
package er_peter_chen.tests;

import er_peter_chen.ERPCCompositeAttribute;
import er_peter_chen.Er_peter_chenFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ERPC Composite Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ERPCCompositeAttributeTest extends ERPCAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ERPCCompositeAttributeTest.class);
	}

	/**
	 * Constructs a new ERPC Composite Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCCompositeAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ERPC Composite Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ERPCCompositeAttribute getFixture() {
		return (ERPCCompositeAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Er_peter_chenFactory.eINSTANCE.createERPCCompositeAttribute());
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

} //ERPCCompositeAttributeTest
