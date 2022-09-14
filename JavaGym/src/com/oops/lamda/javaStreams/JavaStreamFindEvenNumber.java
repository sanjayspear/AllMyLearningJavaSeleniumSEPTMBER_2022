package com.oops.lamda.javaStreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class JavaStreamFindEvenNumber {

	public static void main(String[] args) {
		//Approach1
		
				Integer[] numArr = {10,15,8,49,25,98,32};
				
				Arrays.asList(numArr).stream().filter(even -> even % 2 == 0).forEach(System.out::println);
				
				System.out.println("=====================================================================");
				
				//Approach1
				Stream.of(10,15,8,49,25,98,32).filter(even -> even % 2 == 0).forEach(System.out::println);

	}

}
