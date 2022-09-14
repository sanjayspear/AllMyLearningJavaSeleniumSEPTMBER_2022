package com.javaGym.programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapEntry {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Apple");
		hm.put(2, "Mango");
		hm.put(3, "Pineapple");
		hm.put(4, "Grape");
		hm.put(6, "Orange");
		
		System.out.println(hm);
		
		/*
		 * Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();
		 * 
		 * for(Map.Entry<Integer, String> entry : entrySet) {
		 * System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue()); }
		 */
		
		for(Entry<Integer, String> ele : hm.entrySet()) {
			System.out.println(ele.getKey()+" | "+ele.getValue());
		}
	}

}
