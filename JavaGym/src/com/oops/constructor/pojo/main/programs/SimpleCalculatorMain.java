package com.oops.constructor.pojo.main.programs;

import com.oops.constructor.pojo.sub.programs.SimpleCalculator;

public class SimpleCalculatorMain {

	public static void main(String[] args) {
		SimpleCalculator cal = new SimpleCalculator();
		cal.setFirstNumber(31.9);
		cal.setSecondNumber(21.8);

		System.out.println("Sum " + cal.getAdditionResult());
		System.out.println("Substraction " + cal.getSubtractionResult());
		System.out.println("Multiplication " + cal.getMultiplicationResult());
		System.out.println("Division " + cal.getDivisionResult());

	}

}
