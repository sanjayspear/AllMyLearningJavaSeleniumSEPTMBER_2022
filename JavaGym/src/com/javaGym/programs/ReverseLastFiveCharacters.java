package com.javaGym.programs;

public class ReverseLastFiveCharacters {

	public static void main(String[] args) {
		String s = "Sanjay Y M";
		char a[] = s.toCharArray();
		
		StringBuffer sb;
		
		int len = a.length-1;
		
		for(int i=len; i>=5; i--) {
			char n = a[i];
			String s1 = Character.toString(n);
			sb = new StringBuffer(s1);
			System.out.print(sb.reverse());
		}

	}

}
