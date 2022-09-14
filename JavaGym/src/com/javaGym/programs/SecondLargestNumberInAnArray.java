package com.javaGym.programs;

import java.util.Arrays;

public class SecondLargestNumberInAnArray {

	public static void main(String[] args) {
	   
		int a[] = {6, 8, 2, 4, 3, 1, 5, 7};
		
		int temp;
		
		System.out.print("Given Array =====>  "+Arrays.toString(a));
		
		System.out.println();
		
		
		//1st sort array element in descending order (Bigger number to Smaller Number)
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("  =====> "+a[1]+" is the 2nd largest number from the given array");
		
		System.out.println();
		
		System.out.println(" =====> "+a[2]+" is the 3rd largest number from the given array");
		
		
		
	}

}
