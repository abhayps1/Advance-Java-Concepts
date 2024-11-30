package com.aps;

public class Main {
	public static void main(String[] args) {

//		Animal ani = new Animal(); // this gives error

		Animal ani = new AnimalImpl(); // Just like interfaces we can create object of abstract classes

		ani.animalSound();

		;
	}
}
