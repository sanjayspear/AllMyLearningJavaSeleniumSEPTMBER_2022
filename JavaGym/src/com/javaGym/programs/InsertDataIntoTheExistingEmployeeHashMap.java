package com.javaGym.programs;

import java.util.HashMap;

public class InsertDataIntoTheExistingEmployeeHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> employee = new HashMap<Integer, String>();

		employee.put(101, "Adam");
		employee.put(102, "David");
		employee.put(103, "Alekhya");
		employee.put(104, "Stalin");
		employee.put(105, "Ash");
		employee.put(106, "Abhilash");
		employee.put(107, "Arvind");
		employee.put(108, "Rashmi");
		
		System.out.println("Before Inserting "+employee);
		
		employee.put(104, "Sanjay");
		
		System.out.println("After inserting "+employee);
	}

}
