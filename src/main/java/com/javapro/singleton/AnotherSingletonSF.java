package com.javapro.singleton;

public class AnotherSingletonSF {
	
	private static AnotherSingletonSF sf = new AnotherSingletonSF();

	private AnotherSingletonSF() {

	}

	static public AnotherSingletonSF getInstance() {
		msg();
		return sf;
	}

	/**
****** @support****************************************************
	 */
	protected static void msg() {
		System.out.println("Got Instance!");
	}
}
