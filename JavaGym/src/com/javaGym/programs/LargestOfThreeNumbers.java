package com.javaGym.programs;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		int c = 3;

		if (a > b && a > c) {
			System.out.println(a + " is the largest");
		} else if (b > c) {
			System.out.println(b + " is the largest");
		} else {
			System.out.println(c+ " is the largest");
		}

	}

}
