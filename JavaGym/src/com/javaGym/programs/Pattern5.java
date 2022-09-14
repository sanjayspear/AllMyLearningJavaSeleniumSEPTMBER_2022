package com.javaGym.programs;

public class Pattern5 {

	public static void main(String[] args) {
		int letter = 65;
		int m = 5;
		int n = 5;
		for (int i = 0; i <= 5; i++) {
			for (int k = m; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {

				System.out.print((char) (letter + i) + " ");
			}
			m--;
			System.out.println();
		}

		for (int i = 4; i >= 0; i--) {
			for (int k = 5; k >= n; k--) {
				System.out.print(" ");
			}
			n--;
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (letter + i) + " ");
			}
			System.out.println();
		}

	}

}
