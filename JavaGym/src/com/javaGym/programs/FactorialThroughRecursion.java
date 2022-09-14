package com.javaGym.programs;

public class FactorialThroughRecursion {

	public static void main(String[] args) {
		int n=5;
		int fact =factorial(n);
		System.out.println(n+"! is "+fact);

	}
	
	//factorial through recursion
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

}
