package com.javaGym.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

public class FrequencyOfCharacters2 {

	public static void main(String[] args) {
		String s = "Nitte Meenakshi Institue of Technology";

		HashMap<Character, Integer> hm = new HashMap<>();
		
		HashSet<Integer> set = new HashSet<Integer>();

		s.toLowerCase();
		char[] a = s.toCharArray();
		int len = a.length;

		for (int i = 0; i < len; i++) {
			char key = a[i];

			if (key != ' ') {
				if (hm.containsKey(key)) {
					hm.put(key, hm.get(key) + 1);
				} else {
					hm.put(key, 1);
				}
			}
		}

		for (Entry<Character, Integer> ele : hm.entrySet()) {
			System.out.println(ele.getKey() + " ===> " + ele.getValue());
		}
		
		for (Entry<Character, Integer> ele : hm.entrySet()) {
			set.add(ele.getValue());
		}

	}

}
