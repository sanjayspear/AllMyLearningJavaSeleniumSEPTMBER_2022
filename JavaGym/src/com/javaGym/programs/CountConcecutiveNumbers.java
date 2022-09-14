package com.javaGym.programs;

public class CountConcecutiveNumbers {

	public static void main(String[] args) {
		int num = 1234567890;
		int res=0;
		int sum=0;
		while(num>0)
		{
			res=num%10;
			num=num/10;
			sum=sum+res;
		}
		System.out.println(sum);
	}

}
