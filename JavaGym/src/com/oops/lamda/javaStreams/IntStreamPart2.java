package com.oops.lamda.javaStreams;

import java.util.stream.IntStream;

public class IntStreamPart2 {

	public static void main(String[] args) {
		// let's use the normal map function to find the squared value of all ints
		// between 0 and 5
		System.out.println("=======");

		IntStream.range(1, 5).map(n -> n * n).forEach(System.out::println);

		System.out.println("=======");

		IntStream.range(1, 5).mapToDouble(D -> D).forEach(System.out::println);

		System.out.println("=======");

		IntStream.range(1, 5).mapToLong(L -> L).forEach(System.out::println);

		System.out.println("=======");

		boolean flagOne = IntStream.range(1, 5).anyMatch(e -> e % 2 == 0);

		System.out.println(flagOne);

		System.out.println("=======");

		boolean flagTwo = IntStream.range(1, 5).allMatch(e -> e % 2 == 0);

		System.out.println(flagTwo);
		
		System.out.println("=======");
		
		boolean flagThree = IntStream.range(1, 5).noneMatch(e -> e % 2 == 0);

		System.out.println(flagThree);
		
		System.out.println("=======");

	}

}
