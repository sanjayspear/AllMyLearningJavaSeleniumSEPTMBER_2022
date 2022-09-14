package com.javaGym.programs;

public class Add {

	public static void main(String[] args) {
		int n = 53219876;
		int num=n;
		int sum = 0;

		while (n > 0) {
			int temp = n % 10;
			sum = sum + temp;
			n = n / 10;
		}
		System.out.println("sum of "+num+" = "+sum);
	}

}
