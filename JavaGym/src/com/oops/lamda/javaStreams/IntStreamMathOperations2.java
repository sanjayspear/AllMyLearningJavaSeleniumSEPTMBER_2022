package com.oops.lamda.javaStreams;

import java.util.stream.IntStream;

public class IntStreamMathOperations2 {

	public static void main(String[] args) {

		int sum = IntStream.range(1, 5).reduce(0, (x, y) -> x + y);
		
		System.out.println("SUM : "+sum);
        
		int sub = IntStream.range(1, 5).reduce(0, (x, y) -> x - y);
		
		System.out.println("SUB : "+sub);
		
		int mul = IntStream.range(1, 5).reduce(1, (x, y) -> x * y);
		
		System.out.println("MUL : "+mul);
		
		int div = IntStream.range(1, 5).reduce(1, (x, y) -> x / y);
		
		System.out.println("DIV : "+div);
		
		int modulo = IntStream.range(1, 5).reduce(1, (x, y) -> x % y);
		
		System.out.println("MPDULO : "+modulo);
		
		


	}

}
