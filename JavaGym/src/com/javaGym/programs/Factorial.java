package com.javaGym.programs;

public class Factorial {

	public static void main(String[] args) {
		//5! = 5 * 4 * 3 * 2 * 1
		
		int fact = 5;
		int res = 1;
		
		for (int i=fact; i>=1; i--) {
			res = res * i;
		}
		System.out.println(res);
	}

}
