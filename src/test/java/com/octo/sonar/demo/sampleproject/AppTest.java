package com.octo.sonar.demo.sampleproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	private static DemoCalculator calculator;

	@BeforeClass
	public static void initCalculator() {
		calculator = new DemoCalculator();
	}

	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test ");
	}

	@After
	public void afterEachTest() {
		System.out.println("This is exceuted after each Test ");
	}

	@Test
	public void testSum() {
		int result = calculator.findSum(3, 4);

		assertEquals(7, result);
	}

	@Test
	public void testDivison() {
		try {
			int result = calculator.findDivision(12, 2);

			assertEquals(6, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.findDivision(10, 0);
	}

	@Ignore
	@Test
	public void testEqual() {
		boolean result = calculator.compareNumbers(20, 20);

		assertFalse(result);
	}

	@Ignore
	@Test
	public void testSubstraction() {
		int result = 10 - 3;

		assertTrue(result == 9);
	}
	}
