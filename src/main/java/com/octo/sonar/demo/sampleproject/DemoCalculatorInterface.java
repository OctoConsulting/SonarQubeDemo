package com.octo.sonar.demo.sampleproject;
/*
* Interface DemoCalculatorInterface
* Define calculator operations
*/

public interface DemoCalculatorInterface {
		int findSum(int a, int b);

		int findDifference(int a, int b);

		int findProduct(int a, int b);

		int findDivision(int a, int b) throws Exception;

		boolean compareNumbers(int a, int b);
	

}
