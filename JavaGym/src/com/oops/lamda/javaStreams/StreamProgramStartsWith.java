package com.oops.lamda.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamProgramStartsWith {

	public static void main(String[] args) {
		// =========Approach : 1 =============

		System.out.println("Number Starts with 2");

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 22, 28);
		myList.stream().map(s -> s + "") // Convert integer to String
				.filter(s -> s.startsWith("2")).forEach(System.out::println);

		System.out.println("Number Starts with 1");

		// =========Approach : 2 =============

		Arrays.asList(10, 15, 8, 49, 25, 98, 32, 29, 22, 26).stream().map(e -> e + "").filter(e -> e.startsWith("1"))
				.forEach(System.out::println);

		// =========Approach : 3 =============

		System.out.println("Number Starts with 2");

		Stream.of(10, 15, 8, 49, 25, 98, 32, 29, 22, 26).map(e -> e + "").filter(e -> e.startsWith("2"))
				.forEach(System.out::println);

		System.out.println("Number Ends with 5");

		Stream.of(10, 15, 8, 49, 25, 98, 32, 29, 22, 26).map(e -> e + "").filter(e -> e.endsWith("5"))
				.forEach(System.out::println);
	}

}
