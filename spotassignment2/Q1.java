package com.spotassignment2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1 {

	public static int[] icecreamFlavours(int amount, int[] flavours) {
		int[] result = { -1, -1 };
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int i = 0; i < flavours.length; i++) {
			frequencyMap.put(flavours[i], i + 1);
		}

		for (int i = 0; i < flavours.length; i++) {
			if (flavours[i] != amount) {
				int m = amount - flavours[i];
				if (frequencyMap.containsKey(m)) {
					result[0] = i + 1;
					result[1] = frequencyMap.get(m);
					return result;
				}
			}
		}
		return result;

	}

	public static void main(String[] args) {

		int amount = 6;
		int[] cost = { 1, 2, 4, 7, 3 };
		int[] r = icecreamFlavours(amount, cost);
		System.out.println(Arrays.toString(r));
	}

}
