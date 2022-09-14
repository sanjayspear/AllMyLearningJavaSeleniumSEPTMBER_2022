package com.javaGym.programs;

import java.util.Arrays;

public class SortArrayUsingInBuiltMethod {

	public static void main(String[] args) {
		int[] a = { 4, 2, 1, 3, 4, 5, 2, 1, 5, 3, 5 };

		Arrays.sort(a);

		String b = Arrays.toString(a);

		System.out.println(b);
	}

}
