package com.spotassignment;

import java.util.Map;
import java.util.TreeMap;

public class Q5 {

	static Map<Character, Integer> getFrequency(String input, String ref) {

		Map<Character, Integer> map = new TreeMap<>();

		for (char c : ref.toCharArray()) {
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == c) {
					if (!map.containsKey(c)) {
						map.put(c, 1);
					} else if (map.containsKey(c)) {
						map.replace(c, map.get(c) + 1);
					}
				}
			}
		}

		return map;
	}
	public static void main(String[] args) {
		System.out.println(getFrequency("hello world please", "help"));

	}

}
