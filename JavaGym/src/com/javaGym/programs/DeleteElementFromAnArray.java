package com.javaGym.programs;

public class DeleteElementFromAnArray {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80 };

		System.out.println("Array before deleting: ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		int deleteElement = 30;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == deleteElement) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
				break;
			}
			System.out.println();
		}

		System.out.println("Array after deleting: ");

		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
