package com.javapro.demo.patterns;

public class Fibonacci_Recurssion {

	public static int first = 0;
	public static int second = 1;
	public static int next = 1;

	public static void recurssion(int num) {
		if (next <= num) {
			System.err.print(next + " ");
			first = second;
			second = next;
			next = first + second;
			recurssion(50);
		} else {
			return;
		}
	}

	public static void main(String[] args) {
		System.out.print(first + " " + second + " ");
		recurssion(50);
	}
}
