package com.oops.polymorphism.sub.programs;

public class IndependenceDay extends Movie {

	public IndependenceDay() {
		super("Independence Day");
	}

	@Override
	public String plot() {
		return "Aliens attempt to take over planet earth";
	}
}