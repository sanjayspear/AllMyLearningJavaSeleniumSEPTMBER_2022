package com.javaGym.programs;

public class Pattern8 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1; i<=5; i++) {
			for(int k=0; k<n; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				if(j%2 == 0) {
				System.out.print(0+" ");
				}else {
					System.out.print(1+" ");
				}
			}
			System.out.println();
			n--;
		}

	}

}
