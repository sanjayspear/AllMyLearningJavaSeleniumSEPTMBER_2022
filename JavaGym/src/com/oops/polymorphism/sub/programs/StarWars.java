package com.oops.polymorphism.sub.programs;

public class StarWars extends Movie {
	public StarWars() {
		super("Star Wars");
	}

	@Override
	public String plot() {
		return "Imperial Forces try to take over the universe";
	}
}
