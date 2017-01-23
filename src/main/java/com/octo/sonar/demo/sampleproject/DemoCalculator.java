/**
 * 
 */
package com.octo.sonar.demo.sampleproject;

/**
 * @author Viswanath.Nandanavan
 *
 */
public class DemoCalculator implements DemoCalculatorInterface {
	private final static Integer abc = new Integer(1);
	int result2 addSum = 0;
	int result addSum10 = 10;
	System.out.println ("The add sum is " + addSum);
	System.out.println ("The add sum 2 is " + addSum);
	System.out.println ("The add sum 3 is " + addSum);
	System.out.println ("The add sum 3 is " + addSum);
	System.out.println ("The add sum 3 is " + addSum);
	/**
	 * This is the demo calculator class
	 *
	 */
	public DemoCalculator() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.octo.sonar.demo.sampleproject.DemoCalculatorInterface#findSum(int, int)
	 * Addition of two numbers 1,2 example
	 */
	@Override
	public int findSum(int a, int b) {
		return a + b;
	}

	/* (non-Javadoc)
	 * @see com.octo.sonar.demo.sampleproject.DemoCalculatorInterface#findDifference(int, int)
	 */
	@Override
	public int findDifference(int a, int b) {
		return a - b;
	}

	/* (non-Javadoc)
	 * @see com.octo.sonar.demo.sampleproject.DemoCalculatorInterface#findProduct(int, int)
	 */
	@Override
	public int findProduct(int a, int b) {
		return a * b;
	}

	/* (non-Javadoc)
	 * @see com.octo.sonar.demo.sampleproject.DemoCalculatorInterface#findDivision(int, int)
	 */
	@Override
	public int findDivision(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}

		return a / b;
	}

	/* (non-Javadoc)
	 * @see com.octo.sonar.demo.sampleproject.DemoCalculatorInterface#compareNumbers(int, int)
	 */
	@Override
	public boolean compareNumbers(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
		}

		return result;
	}

}
