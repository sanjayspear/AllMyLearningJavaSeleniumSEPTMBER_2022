 package com.javaGym.programs;

import java.util.HashSet;

public class FindTheCommonElementsBetweenTwoDifferentArrays {

	public static void main(String[] args) {
		int[] arr1 = { 4, 3, 7, 9, 2, 8, 5, 5, 5, 9, 7, 8, 10 };
		int[] arr2 = { 5, 1, 4, 8, 3, 1, 6 };

		System.out.println("Common elements for arr1 and arr2: ");
		HashSet<Integer> hs = new HashSet<>();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					hs.add(arr1[i]);
					break;
				}
			}
		}
		
		for(int no: hs) {
			System.out.print(no+" ");
		}
	}

}
