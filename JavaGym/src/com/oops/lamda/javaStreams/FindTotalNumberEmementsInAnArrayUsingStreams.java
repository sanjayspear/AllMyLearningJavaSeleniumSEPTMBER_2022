package com.oops.lamda.javaStreams;

import java.util.stream.Stream;

public class FindTotalNumberEmementsInAnArrayUsingStreams {

	public static void main(String[] args) {
		System.out.println(Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15).count());

	}

}
