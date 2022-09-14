package com.oops.lamda.javaStreams;

import java.util.stream.Stream;

public class FindTheSmallestNumberInAnArrayUsingStream {

	public static void main(String[] args) {
		Integer firstNum = Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15).sorted().findFirst().get();

		System.out.println("Smallest number from the given array is : " + firstNum);

	}

}
