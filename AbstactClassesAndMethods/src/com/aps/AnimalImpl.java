package com.aps;

public class AnimalImpl extends Animal {

	@Override
	public void animalSound() { // abstract methods needs to be implemented in class extending it

		int i = 1;
		System.out.println("I'm from implemented animalSound method");

	}

}
