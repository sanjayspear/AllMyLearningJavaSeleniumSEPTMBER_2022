package com.oops.lamda.javaStreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMinAndMax {

	public static void main(String[] args) {
		// Approach 1

		Integer maxNum = Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15).max((a, b) -> a - b).get();

		System.out.println("Largest Number : " + maxNum);

		Integer minNum = Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15).min((a, b) -> a - b).get();

		System.out.println("Smallest Number : " + minNum);

		// Approach 2

		int max = Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15).mapToInt(m -> m).max().getAsInt();

		System.out.println("Biggest Number : " + max);

		int min = Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15).mapToInt(m -> m).min().getAsInt();

		System.out.println("Lowest Number : " + min);
		
		//Approach 4
		
		Integer maxNumber = Arrays.asList(10,15,8,49,25,98,98,32,15).stream().max(Integer::compare).get();
		
		System.out.println("Largest Number "+maxNumber);

	}

}
