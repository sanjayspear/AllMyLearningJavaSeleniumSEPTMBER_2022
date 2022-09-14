package com.javaGym.programs;

public class ToPrintLettersAndAlphabets {

	public static void main(String[] args) {
		int Cletter = 65;
		int SLetter = 97;

		System.out.println("A-Z Capital Letters");

		for (int i = 0; i < 26; i++) {
			System.out.print((char) (Cletter + i) + " ");
		}
        System.out.println();
		System.out.println("a-z Small Letters");

		for (int i = 0; i < 26; i++) {
			System.out.print((char) (SLetter + i) + " ");
		}

	}

}
