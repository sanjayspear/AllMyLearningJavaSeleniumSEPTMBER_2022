package com.javaGym.programs;

public class FindTheDuplicateNumberInArrayUsingIndex {

	public static void main(String[] args) {

		int[] a = { 3, 4, 5, 3, 6, 4, 5 };

		System.out.println("Following are the duplicate numbers from the given array");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
