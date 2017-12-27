package com.javapro.demo.patterns;

public class Factorial_Recursion {

	public static int fact = 1;
	public static int factorial = 1;

	/**
	 * 
	 * @Recursion
	 */
	public static void fact_recursion(int i) {

		if (i > 0) {
			fact = fact * i;
			i--;
			fact_recursion(i);
		} else {
			System.err.println(fact +" :Recursion call");
			return;
		}
	}

	/**
	 * 
	 * @NonRecursion
	 */
	public static void factorial(int num) {
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial +" :NonRecursion call");
	}

	public static void main(String[] args) {
		fact_recursion(6); // Recursion call
		factorial(6); // NonRecursion call
	}
}
