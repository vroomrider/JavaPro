package com.javapro.singleton;

public class SingletonSF {

	/**
	 * 1. @private static variable
	 */
	private static SingletonSF instance = null;

	/**
	 * 2. @private constructor
	 */
	private SingletonSF() {

	}

	/**
	 * 3. @public static method
	 * @return
	 */
	public static SingletonSF getInstance() {

		if (instance == null) {
			instance = new SingletonSF();
		}
		msg();
		return instance;
	}

	/**
	 ****** @support****************************************************
	 */
	protected static void msg() {
		System.err.println("I am protected method");
		return;
	}
}
