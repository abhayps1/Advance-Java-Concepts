package com.aps;

/*
 Final methods: When a method is declared as final, it cannot be overridden by a subclass. This is useful for methods that are part of a class’s public API and should not be modified by subclasses.
*/

public class FinalMethodDemo {

	public final void finalMethod() {
		System.out.println("This is the output from final method in FinalMethodDemo class");
	}
}
