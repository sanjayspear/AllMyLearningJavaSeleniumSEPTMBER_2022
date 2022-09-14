package com.oops.lamda.javaStreams;

import java.util.stream.IntStream;

public class IntStreamMathOperations {

	public static void main(String[] args) {

		int sumOne = IntStream.of(2, 5, 10).reduce((a, b) -> a + b).getAsInt();

		System.out.println("SUM : "+sumOne);

		int substractioN = IntStream.of(2, 5, 10).reduce((a, b) -> a - b).getAsInt();

		System.out.println("SUBSTRACTION : "+substractioN);

		int Multiply = IntStream.of(2, 5, 10).reduce((a, b) -> a * b).getAsInt();

		System.out.println("MULTIPLICATION : "+Multiply);
		
		int division = IntStream.of(2, 5, 10).reduce((a, b) -> a / b).getAsInt();

		System.out.println("DIVISION : "+division);
		
		int modulo = IntStream.of(2, 5, 10).reduce((a, b) -> a % b).getAsInt();

		System.out.println("MODULO : "+modulo);


	}

}
