package com.javaGym.programs;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr = {55, 2, 9, 3, 5, 7, 99, 24, 36, 49};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to search from the following arry: ");
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		int num = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(num == arr[i]) {
				System.out.println("Given number "+num+" is available at the index "+i);
				break;
			}
		}
		sc.close();
		sc=null;

	}

}
