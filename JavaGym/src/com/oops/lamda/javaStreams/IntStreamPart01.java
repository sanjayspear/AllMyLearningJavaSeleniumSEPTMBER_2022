package com.oops.lamda.javaStreams;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class IntStreamPart01 {

	public static void main(String[] args) {
		IntStream.of(1, 2, 3).forEach(System.out::println);
		
		System.out.println("=====================");
		
		IntStream stream = IntStream.range(1, 10);
		
		stream.forEach(System.out::println);
		
		System.out.println("=====================");
		
		IntStream.rangeClosed(1, 20).forEach(System.out::println);
		
		System.out.println("=====================");
		
		IntStream.iterate(0, i -> i + 2).limit(20).forEach(System.out::println);
		
		System.out.println("=====================");
		
		IntStream.generate(() -> ThreadLocalRandom.current().nextInt(10)).limit(5).forEach(System.out::println);
	
	}

}
