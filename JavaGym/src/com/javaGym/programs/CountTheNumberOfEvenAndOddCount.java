package com.javaGym.programs;

public class CountTheNumberOfEvenAndOddCount {

	public static void main(String[] args) {
		int num = 54321687;
		
		int evenCount=0;
		int oddCount=0;
		
		while(num > 0) {
			int remainder = num % 10;
			
			if(remainder%2 ==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			
			num = num/10;	
		}
		
		System.out.println("Even Count ==> "+evenCount);
		System.out.println("Odd Count ==> "+oddCount);

	}

}
