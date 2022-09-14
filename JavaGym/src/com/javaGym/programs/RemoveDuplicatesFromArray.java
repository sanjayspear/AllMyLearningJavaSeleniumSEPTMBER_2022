package com.javaGym.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4 };

		Set<Integer> s = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		
		Integer[] b = s.toArray(new Integer[s.size()]);
		
		System.out.println(Arrays.toString(b));

	}

}
