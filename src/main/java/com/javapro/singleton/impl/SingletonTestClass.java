package com.javapro.singleton.impl;

import com.javapro.singleton.AnotherSingletonSF;
import com.javapro.singleton.SingletonSF;

public class SingletonTestClass {

	public static void main(String[] args) {
		SingletonSF sf = SingletonSF.getInstance();
		SingletonSF sf2 = SingletonSF.getInstance();
		SingletonSF sf3 = SingletonSF.getInstance();
		SingletonSF sf4 = SingletonSF.getInstance();

		AnotherSingletonSF asf = AnotherSingletonSF.getInstance();
		AnotherSingletonSF asf2 = AnotherSingletonSF.getInstance();
		AnotherSingletonSF asf3 = AnotherSingletonSF.getInstance();
		AnotherSingletonSF asf4 = AnotherSingletonSF.getInstance();

		System.out.println("*****************SF******************");
		System.out.println(sf);
		System.out.println(sf2);
		System.out.println(sf3);
		System.out.println(sf4);

		System.out.println("*****************ASF******************");
		System.out.println(asf);
		System.out.println(asf2);
		System.out.println(asf3);
		System.out.println(asf4);

	}
}
