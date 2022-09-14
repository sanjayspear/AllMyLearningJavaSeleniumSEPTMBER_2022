package com.javaGym.programs;

public class ProgramToPrintToCountNoOfCharDigitsSpecialCharSpacesInTheGivenStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome1 to *&%^2 java3 8976*%@!)(  ";

		char arr[] = s.toCharArray();
		int digit = 0;
		int alpha = 0;
		int space = 0;
		int symbol = 0;

		for (Character c : arr) {
			if (Character.isDigit(c)) {
				digit++;
			} else if (Character.isAlphabetic(c)) {
				alpha++;
			} else if (Character.isWhitespace(c)) {
				space++;
			} else {
				symbol++;
			}
		}
		
		System.out.println("Total of number of characters from the given string :: "+s+"====>"+alpha );
		System.out.println("Total of number of digits from the give string :: "+s+"====>"+digit );
		System.out.println("Total of number of symbols from the given string :: "+s+"===>"+symbol);
		System.out.println("Total of number of white space from the given string :: "+s+" "+space);
	}

}
