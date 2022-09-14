package com.oops.lamda.javaStreams;

import java.util.stream.IntStream;

public class StreamFilter {

	public static void main(String[] args) {
		IntStream.range(1, 20).filter(e -> e % 2 == 0).forEach(System.out::println);

		boolean AllMatchflag = IntStream.range(1, 20).filter(e -> e % 2 == 0).allMatch(e -> e % 2 == 0);

		System.out.println(AllMatchflag);

		boolean noneMatch = IntStream.range(1, 20).filter(e -> e % 2 == 0).noneMatch(e -> e % 2 == 0);

		System.out.println(noneMatch);

		int maxVal = IntStream.range(10, 100).max().getAsInt();

		System.out.println("Max Value between 10 to 99 : " + maxVal);

		int minVal = IntStream.range(10, 100).min().getAsInt();

		System.out.println("Min Value between 10 to 99 : " + minVal);
	}

}
