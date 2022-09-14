package com.javaGym.programs;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "Sanjay";
		
		int len=s.length()-1;
		
		String rev="";
		
		while(0 <= len) {
			rev = rev+s.charAt(len);
			len--;
		}
		
		System.out.println(rev);

	}

}
