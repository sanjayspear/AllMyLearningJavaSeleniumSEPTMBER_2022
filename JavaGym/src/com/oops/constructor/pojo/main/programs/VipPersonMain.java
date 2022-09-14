package com.oops.constructor.pojo.main.programs;

import com.oops.constructor.pojo.sub.programs.VipPerson;

public class VipPersonMain {

	public static void main(String[] args) {
		// Create a new class VipCustomer
		// it should have 3 fields name, credit limit, and email address.
		// create 3 constructors
		// 1st constructor empty should call the constructor with 3 parameters with
		// default values
		// 2nd constructor should pass on the 2 values it receives and add a default
		// value for the 3rd
		// 3rd constructor should save all fields.
		// create getters only for this using code generation of intellij as setters
		// wont be needed
		// test and confirm it works.

		VipPerson person1 = new VipPerson();
		System.out.println(person1.getName());

		VipPerson person2 = new VipPerson("Bob", 25000.00);
		System.out.println(person2.getName());

		VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
		System.out.println(person3.getName());
		System.out.println(person3.getEmailAddress());

	}

}
