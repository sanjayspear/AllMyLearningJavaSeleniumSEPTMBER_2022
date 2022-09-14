package com.javaGym.programs;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayInDescendingOrderUsingBuiltInFunction {

	public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(9);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(7);
        
        System.out.println("Before sorting");
        System.out.println(list);
        
        System.out.println("Ascending Order");
        Collections.sort(list);
        
        System.out.println(list);
        
        System.out.println("Descending Order");
        Collections.sort(list, Collections.reverseOrder());
        
        System.out.println(list);
	}

}
