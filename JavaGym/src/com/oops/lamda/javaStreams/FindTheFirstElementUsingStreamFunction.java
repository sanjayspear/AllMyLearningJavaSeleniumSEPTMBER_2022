package com.oops.lamda.javaStreams;

import java.util.stream.Stream;

public class FindTheFirstElementUsingStreamFunction {

	public static void main(String[] args) {
		Integer firstNum = Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15).findFirst().get();

		System.out.println(firstNum);

	}

}
