package com.qa.Programs.GFG.Big;

import java.util.HashMap;
import java.util.Map;

public class CountTheCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksforgeeks";
		Map<Character, Long> map = new HashMap<Character, Long>();
		for (char ch:s.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1L);
				//map.getOrDefaul
			}

		}

		int N = 2;
		int count = 0;
		for (Map.Entry<Character, Long> entry : map.entrySet()) {
			if (entry.getValue() == N) {
				count++;
			}
		}

		System.out.println(map);
		System.out.println(count);
	}

}
