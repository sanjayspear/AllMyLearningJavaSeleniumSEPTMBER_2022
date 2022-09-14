package com.javaGym.programs;

public class ValidatePalindromeNumber {

	public static void main(String[] args) {
		 int num = 1221;
		 int temp = num;
		 int reverseNum=0;
		 
		 while(num > 0) {
			 int remainder = num % 10;
			 num = num / 10;
			 reverseNum = reverseNum * 10 + remainder; 
		 } 
		 if(reverseNum == temp) {
			 System.out.println("Give number is palindrome");
		 }else {
			 System.out.println("Not palindrome");
		 }
	}
}
