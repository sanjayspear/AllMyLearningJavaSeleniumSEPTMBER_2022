package com.javaGym.programs;

public class ReverseAStringWithoutAlteringThePositionOfSpecialCharacter {

	public static void main(String[] args) {
            
		String s = "San$%jay";
		char[] str = s.toCharArray();
		
		int i =0;
		int j = str.length-1;
		
		while(i < j) {
			if(!Character.isAlphabetic(str[i])) {
				i++;
			}
			else if(!Character.isAlphabetic(str[j])) {
				j--;
			}else {
				char temp = str[i];
				str[i] = str[j];
				str[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println(str);
	}

}
