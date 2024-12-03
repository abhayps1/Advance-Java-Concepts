package com.aps;

//Multiple Inheritance

public class ImplementationClass implements FirstInterface, SecondInterface {

	@Override
	public void functionFirst() {
		System.out.println("This is implementation of method present in first interface");

	}

	@Override
	public void functionSecond() {

	}

}
