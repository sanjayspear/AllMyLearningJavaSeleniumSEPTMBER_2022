package com.oops.inheritance.main.programs;

import com.oops.inheritance.sub.programs.Animal;
import com.oops.inheritance.sub.programs.Dog;

public class MainAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);

		Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
		dog.walk();
        dog.run();

	}

}
