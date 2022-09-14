package com.oops.constructor.pojo.sub.programs;

public class SimpleCalculator {
	private double firstNumber;
	private double secondNumber;

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public double getAdditionResult() {
		double addtion = (firstNumber + secondNumber);
		return addtion;
	}

	public double getSubtractionResult() {
		double addtion = (firstNumber - secondNumber);
		return addtion;
	}

	public double getMultiplicationResult() {
		double addtion = (firstNumber * secondNumber);
		return addtion;
	}

	public double getDivisionResult() {
		double addtion = (firstNumber / secondNumber);
		return addtion;
	}

}
