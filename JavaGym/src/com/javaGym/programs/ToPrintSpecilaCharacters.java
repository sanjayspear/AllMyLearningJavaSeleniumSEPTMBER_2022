package com.javaGym.programs;

public class ToPrintSpecilaCharacters {

	public static void main(String[] args) {
		int special1 = 32;
		int special2 = 58;
		int special3 = 91;
		int special4 = 123;

		for (int i = 0; i < 16; i++) {
			System.out.print((char) (special1 + i) + " ");
		}

		for (int i = 0; i < 6; i++) {
			System.out.print((char) (special2 + i) + " ");
		}

		for (int i = 0; i < 5; i++) {
			System.out.print((char) (special3 + i) + " ");
		}

		for (int i = 0; i < 5; i++) {
			System.out.print((char) (special4 + i) + " ");
		}

	}

}
