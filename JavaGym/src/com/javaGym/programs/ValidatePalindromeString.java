package com.javaGym.programs;

public class ValidatePalindromeString {

	public static void main(String[] args) {
		String s = "MOM";

		int len = s.length() - 1;

		String rev = "";

		while (0 <= len) {
			rev = rev + s.charAt(len);
			len--;
		}

		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}

	}

}
