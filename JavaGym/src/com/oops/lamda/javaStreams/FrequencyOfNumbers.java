package com.oops.lamda.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfNumbers {

	public static void main(String[] args) {
		Integer[] a1 = {3,2,4,5,6,2,6};
		Integer[] a2 = {7,4,2,9,3,2,5};
		
		List<Integer> numList1 = Arrays.asList(a1);
		List<Integer> numList2 = Arrays.asList(a2);
		
		Stream<Integer> stream1 = numList1.stream();
		Stream<Integer> stream2 = numList2.stream();
		
		Stream<Integer> streamAfterMerge = Stream.concat(stream1, stream2);
		
		Map<Integer, Long> inum = streamAfterMerge.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(inum);

	}

}
