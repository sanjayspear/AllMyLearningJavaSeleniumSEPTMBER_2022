package com.oops.lamda.javaStreams;

import java.util.Arrays;

public class SecondLargestNumberUsingJavaStreams {

	public static void main(String[] args) {
		Integer[] array = { 545, 23, 92, 1, 200, 532 };

		System.out.println("2nd Largest Number");

		Arrays.stream(array).sorted().limit(array.length - 1).skip(array.length - 2).forEach(System.out::println);

		System.out.println("4th Largest Number");

		Arrays.stream(array).sorted().limit(array.length - 3).skip(array.length - 4).forEach(System.out::println);

		System.out.println("Smallest Number");

		String num = Arrays.asList(array).stream().sorted().map(e -> e + "").findFirst().get();

		System.out.println(num);

	}

}
