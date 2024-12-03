package com.aps;

/* 
 Final variables: When a variable is declared as final, its value cannot be changed once it has been initialized. This is useful for declaring constants or other values that should not be modified.
 
 Initialization: Final variables must be initialized either at the time of declaration or in the constructor of the class. This ensures that the value of the variable is set and cannot be changed.
*/

public class FinalFieldDemo {

	final String name = "Abhay";
	final String lastName; // In this way we can declare the final variable

	public FinalFieldDemo(String lastName) { // But gives error unless we instantiate it using constructor
		super();
		this.lastName = lastName;
	}

	public void modifyName() {

		// final variable cannot be modified in this way
		// name = "aps";

	}
}
