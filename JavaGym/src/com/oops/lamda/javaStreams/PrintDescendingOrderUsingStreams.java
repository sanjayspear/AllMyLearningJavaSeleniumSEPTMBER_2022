package com.oops.lamda.javaStreams;

import java.util.Collections;
import java.util.stream.Stream;

public class PrintDescendingOrderUsingStreams {
     public static void main(String[] args) {
    	 
    	 System.out.println("Reverse Order");
    	 
    	 Stream.of(10,15,8,49,25,98,98,32,15).sorted(Collections.reverseOrder()).forEach(System.out::println);
    	 
    	 System.out.println("Largest Number");
    	 
    	 Integer num = Stream.of(10,15,8,49,25,98,98,32,15).sorted(Collections.reverseOrder()).findFirst().get();
    	 
    	 System.out.println(num);
     }
}
