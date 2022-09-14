package com.javaGym.programs;

public class SumUpTheGivenContigiousNumber {

	public static void main(String[] args) {
		int num = 53219876;
		
		String str = Integer.toString(num);
		
		int sum=0;
		
		int len = str.length()-1;
		
		for(int i=0; i<=len; i++) {
			char c=str.charAt(i);
			int n=Character.getNumericValue(c);
			sum=sum+n;
		}
		System.out.println("Sum of "+num+" = "+sum);
		
}

}
