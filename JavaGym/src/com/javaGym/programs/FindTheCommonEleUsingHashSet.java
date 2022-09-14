package com.javaGym.programs;

import java.util.HashSet;

public class FindTheCommonEleUsingHashSet {

	public static void main(String[] args) {
		int[] arr1 = { 4, 3, 7, 9, 2, 8, 5, 5, 5, 9, 7, 8, 10 };
		int[] arr2 = { 5, 1, 4, 8, 3, 1, 6 };

		
		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		
		for(int no:arr1) {
			hs1.add(no);
		}
		
		for(int no:arr2) {
			hs2.add(no);
		}
		
		for(int no:hs2) {
			boolean b = hs1.add(no);
			
			if(b==false) {
				System.out.print(no+" ");
			}
		}
		
	}

}
