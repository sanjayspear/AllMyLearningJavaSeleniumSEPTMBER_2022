package com.javaGym.programs;

import java.util.Arrays;
import java.util.Collections;

public class SortNonCollectionIntegerArray {

	public static void main(String[] args) {

       Integer[] arr = {9, 1, 5, 3, 4, 2, 6, 8, 10, 7};
       
       System.out.println("Before Sorting");
       System.out.println(Arrays.toString(arr));
       
       Arrays.sort(arr);
       System.out.println("Assending Order");
       System.out.println(Arrays.toString(arr));
       
       Arrays.sort(arr, Collections.reverseOrder());
       System.out.println("Descending Order");
       System.out.println(Arrays.toString(arr));
       

	}

}
