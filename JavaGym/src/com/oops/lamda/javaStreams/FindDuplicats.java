package com.oops.lamda.javaStreams;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicats {
	public static void main(String[] args) {
		Integer[] a1 = { 3, 2, 4, 5, 6, 2, 6 };
		Integer[] a2 = { 7, 4, 2, 9, 3, 2, 5 };

		Stream<Integer> stream1 = Arrays.asList(a1).stream();
		Stream<Integer> stream2 = Arrays.asList(a2).stream();

		Map<Integer, Long> duplicateNumbers = Stream.concat(stream1, stream2)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(duplicateNumbers);

		Set<Integer> duplicateEle = duplicateNumbers.entrySet().stream().filter(e -> e.getValue() > 1)
				.map(Map.Entry::getKey).collect(Collectors.toSet());

		System.out.println(duplicateEle);
	}
}
