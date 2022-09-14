package com.javaGym.programs;

public class CharCount {

	public static void main(String[] args) {
		String s = "Welcome to Java";
		int count=0;
		
		int len=s.length();
		
		for(int i=0; i<len; i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Total number of characters from the string ===>"+" ["+s+"] is ==>"+count);
	}

}
