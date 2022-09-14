package com.javaGym.programs;

public class RemoveSpecialCharactersFromString {

	public static void main(String[] args) {
		String s1 = "Please use temporary password 'rahulshettyacademy' to Login.";

		String s2 = s1.split("'")[1].split("'")[0];
		
		System.out.println(s2);

	}

}
