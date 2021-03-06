/**
 * Octo Consulting Inc Mc Lean VA
 */
package com.octo.sonar.demo.sampleproject;

/**
 * @author Viswanath.Nandanavanam
 *
 */
public class DemoCalculator implements DemoCalculatorInterface {
	private final static Integer abc = new Integer(2);
	
	public DemoCalculator() {		
		// TODO Auto-generated constructor stub
		System.out.println("The integer is " + abc );
		System.out.println("The integer is " + abc );
	}
	
	@Override
	public int findSum(int a, int b) {
		return a + b;
	}
	
	/* (non-Javadoc)
	 * @see com.octo.sonar.demo.sampleproject.DemoCalculatorInterface#findDifference(int, int)
	 * Subtraction of two numbers 2,1 example 2-1 =1
	 */
	 
	@Override
	public int findDifference(int a, int b) {
		return a - b;
		
	}
	 
	@Override
	public int findProduct(int a, int b) {
		return a * b;
	}

	/* (non-Javadoc)
	 * @see com.octo.sonar.demo.sampleproject.DemoCalculatorInterface
	 * #findDivision(int, int)
	 */
	 
	@Override
	public int findDivision(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}
		return a / b;
	}

	/* (non-Javadoc)
	 * @see com.octo.sonar.demo.sampleproject.DemoCalculatorInterface
	 * #compareNumbers(int, int)
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
