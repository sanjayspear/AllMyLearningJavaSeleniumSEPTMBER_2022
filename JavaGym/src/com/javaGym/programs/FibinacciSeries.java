package com.javaGym.programs;

public class FibinacciSeries {

	public static void main(String[] args) {
	  //Ex: 1 1 2 3 5 8 13 21 so on.
		int a = 1, b = 1, c = 0;
		System.out.print(a+" "+b+" ");
		for(int i=0; i<10; i++) {
		   c = a + b;
		   a = b;
		   b = c;
		   System.out.print(c+" ");
		}
		
	}

}
