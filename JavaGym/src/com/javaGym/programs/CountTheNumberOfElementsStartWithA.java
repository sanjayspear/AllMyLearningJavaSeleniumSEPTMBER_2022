package com.javaGym.programs;

import java.util.ArrayList;

public class CountTheNumberOfElementsStartWithA {
	public static void main(String[] args) {
		int count=0;
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Adam");
        list.add("David");
        list.add("Alekhya");
        list.add("Stalin");
        list.add("Ash");
        list.add("Abhilash");
        list.add("Arvind");
        list.add("Rashmi");
        
        for(int i=0; i<list.size();i++) {
        	String str = list.get(i);
        	
        	if(str.startsWith("A")) {
        		count++;
        	}
        }
        
        System.out.println("Name starts with 'A' count "+count);
		
	}
}
