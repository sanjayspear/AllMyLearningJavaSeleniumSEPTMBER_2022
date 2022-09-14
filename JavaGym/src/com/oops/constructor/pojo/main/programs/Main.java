package com.oops.constructor.pojo.main.programs;

import com.oops.constructor.pojo.sub.programs.Car;

public class Main {
	
	//The whole concept of encapsulation it won't allow user to access fields directly.
	//in setter method your data gets validated and getter method returns data back to 
	//the end user based on the validation. Ex- ATM Machine
    //You can withdraw cash or you can check the balance only if you input valid credentials.
	// Here, the internal implementation is hidden for the external users. This is the benefit
	// encapsulation.

	public static void main(String[] args) {

		Car porsche = new Car();
		Car holden = new Car();

		System.out.println("Model Is : " + porsche.getModel());

		porsche.setModel("Carrera");

		System.out.println("Model Is : " + porsche.getModel());

		porsche.setModel("911");

		System.out.println("Model Is : " + porsche.getModel());

		holden.setModel("commodro");

		System.out.println("Model Is : " + holden.getModel());

		//holden = null;

		System.out.println("Model Is : " + holden.getModel());
	}

}
