package com.javaGym.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharactersUsingHashMap {

	public static void main(String[] args) {
       String s1="Welcome to java";
       String s2= s1.replaceAll("\\s", "").toLowerCase();
       
       
       System.out.println(s2);
       
       Map<Character, Integer> hm = new LinkedHashMap<>();
       
       for(int i=0; i<s2.length(); i++)
       {
    	   if(!hm.containsKey(s2.charAt(i)))
    	   {
    		   hm.put(s2.charAt(i), 1);
    	   }
    	   else
    	   {
    		   hm.put(s2.charAt(i), hm.get(s2.charAt(i))+1);
    	   }
       }
		/*
		 * for(Map.Entry<Character, Integer> e : hm.entrySet()) { if(e.getValue()>=1) {
		 * System.out.println(e.getKey()+"===>"+e.getValue()); } }
		 */
       System.out.println("<K ==> V>");
       for(Character key : hm.keySet())
       {
    	   if(hm.get(key)>=1)
    	   {
    		  System.out.println(key+" ==> "+hm.get(key));
    	   }
       }
	}

}
