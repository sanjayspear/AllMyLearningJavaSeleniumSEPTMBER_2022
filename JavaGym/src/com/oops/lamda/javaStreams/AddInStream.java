package com.oops.lamda.javaStreams;

import java.util.stream.IntStream;

public class AddInStream {

	public static void main(String[] args) {
		int sumOne = IntStream.range(1, 5).reduce((a, b) -> a + b).getAsInt();
		
		System.out.println(sumOne);
		
		int sumTwo = IntStream.of(2, 5, 10).reduce((a, b) -> a + b).getAsInt();
		
		System.out.println(sumTwo);

	}

}
