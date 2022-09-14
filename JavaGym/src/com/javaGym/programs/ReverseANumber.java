package com.javaGym.programs;

public class ReverseANumber {

	public static void main(String[] args) {
		Long num = 89768907543256777L;
		Long res=0L;
		
		while(num>0)
		{
			res=res*10+num%10;
			num=num/10;
		}
		System.out.println(res);

	}

}
