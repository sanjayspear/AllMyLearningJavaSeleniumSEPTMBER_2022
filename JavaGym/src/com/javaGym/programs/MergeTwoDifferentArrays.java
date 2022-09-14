package com.javaGym.programs;

public class MergeTwoDifferentArrays {

	public static void main(String[] args) {
		
		int[] A = {10, 20, 30};
		int[] B = {40, 50, 60, 70, 80};
		
		int a_len = A.length;
		int b_len = B.length;
		
		int c_len = a_len + b_len;
		
		int[] C = new int[c_len];
		
		for(int i=0; i < a_len; i++) {
			C[i] = A[i];
		}
		
		for(int i=0; i<b_len; i++) {
			C[a_len + i] = B[i];
		}
		
		System.out.print("[");
		for(int i=0; i<c_len; i++) {
			System.out.print(C[i]+" ");
		}
		System.out.print("]");

	}

}
