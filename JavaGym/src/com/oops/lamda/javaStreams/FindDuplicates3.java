package com.oops.lamda.javaStreams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class FindDuplicates3 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		Stream.of(10,15,8,49,25,98,98,32,15).filter(n -> !set.add(n)).forEach(System.out::println);
	}

}
