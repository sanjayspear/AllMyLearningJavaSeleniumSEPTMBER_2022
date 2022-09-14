package com.javaGym.programs;

import java.util.ArrayList;

public class CountNumberElementsStartsWithAUsingJavaStream {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Adam");
		names.add("David");
		names.add("Alekhya");
		names.add("Stalin");
		names.add("Ash");
		names.add("Abhilash");
		names.add("Arvind");
		names.add("Rashmi");
		names.add("Akanksh");
		
		long c =names.stream().filter(s -> s.startsWith("A")).count();
		
		System.out.println(c);

	}

}
