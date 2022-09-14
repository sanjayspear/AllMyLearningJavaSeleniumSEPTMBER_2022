package com.javaGym.programs;

public class ToPrintSpecialSymbols {

	public static void main(String[] args) {
		
		int symbol = 0;
		
		for(int i=0; i<=31; i++) {
			System.out.print((char)(symbol+i)+" ");
		}

	}

}
