package com.javapro.cast;

public class DownCasting {
	static public void main(String args[]) {
		double a = 295.04;
		int b = 300;
		byte c = (byte) a;
		byte d = (byte) b;
		System.err.println(c + ": values :" + d);
	}
}
