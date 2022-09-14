package com.javaGym.programs;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfIntegers {

	public static void main(String[] args) {
		int[] arr= {1, 4, 5, 9, 7, 7, 1, 4, 4, 7, 7};
		
		Map<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else
			{
				hm.put(arr[i], 1);
			}
		}
		
		for(Integer key : hm.keySet())
		{
			if(hm.get(key)>=1)
			{
				System.out.println(key+"==> repeated "+hm.get(key)+" times ");
			}
		}
	}

}
