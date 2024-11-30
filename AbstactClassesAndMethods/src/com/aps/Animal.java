
package com.aps;

abstract class Animal {
	public abstract void animalSound();

	public void sleep() { // non abstract method need not needed to be implemented
		System.out.println("Zzz");
	}
}
