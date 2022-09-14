package com.javaGym.programs;

public class Pattern7 {

	public static void main(String[] args) {
		int n=5, m=4;
		for(int i=0; i<5; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=n; j>0; j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
			n--;
		}
		
		for(int i=0; i<5; i++) {
			for(int k=m; k>0; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			m--;
		}
	}

}
