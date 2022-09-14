package com.oops.polymorphism.main.programs;

import com.oops.polymorphism.sub.programs.Forgetable;
import com.oops.polymorphism.sub.programs.IndependenceDay;
import com.oops.polymorphism.sub.programs.Jaws;
import com.oops.polymorphism.sub.programs.MazeRunner;
import com.oops.polymorphism.sub.programs.Movie;
import com.oops.polymorphism.sub.programs.StarWars;

public class MainMovie {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
		}
	}

	public static Movie randomMovie() {
		int randomNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random number generated was: " + randomNumber);
		switch (randomNumber) {
		case 1:
			return new Jaws();
		case 2:
			return new IndependenceDay();
		case 3:
			return new MazeRunner();
		case 4:
			return new StarWars();
		case 5:
			return new Forgetable();
		}

		return null;

	}

}
