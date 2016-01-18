/**
 */
package de.raphaelgeissler.dependencychecker.tests;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.DependencycheckerFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Checker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckerTest extends TestCase {

	/**
	 * The fixture for this Checker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Checker fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CheckerTest.class);
	}

	/**
	 * Constructs a new Checker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Checker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Checker fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Checker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Checker getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DependencycheckerFactory.eINSTANCE.createChecker());
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

} //CheckerTest
