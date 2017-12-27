package com.javapro.demo.operators;

public class SubstractionWithOutSubstractionOperator {

	public static void main(String[] args) {

		int n1 = 4, n2 = 8, t = 0;
		int count = 0;

		if (n2 > n1) {
			t = n2;
			System.out.println(t);
			n2 = n1;
			System.out.println(n2);
			n1 = t;
			System.out.println(n1);
		}
		System.err.println("t: " + t + " n2: " + n2 + " n1: " + n1);
		for (t = n2; t < n1; t++) {
			count++;
		}
		System.out.println(count);
	}
}
