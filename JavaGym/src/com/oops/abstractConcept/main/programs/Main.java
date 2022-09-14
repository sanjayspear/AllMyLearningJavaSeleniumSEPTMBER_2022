package com.oops.abstractConcept.main.programs;

import com.oops.abstractConcept.sub.programs.Dog;
import com.oops.abstractConcept.sub.programs.Parrot;
import com.oops.abstractConcept.sub.programs.Penguin;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}