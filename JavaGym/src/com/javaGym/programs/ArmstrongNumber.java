package com.javaGym.programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
	//153 = 1*1*1 + 5*5*5 + 3*3*3
		
		int num = 153;
		int temp = num;
		int res=0;
		
		while(num > 0) {
			int rem = num % 10;
			int mul = (rem * rem * rem);
			res = res + mul;
			num = num / 10;
		}
		if(res == temp) {
			System.out.println(temp+" is the Armstrong Number");
		}else {
			System.out.println(temp+" is Not an Armstrong number");
		}
	}

}
