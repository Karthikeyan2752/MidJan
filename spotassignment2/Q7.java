package com.spotassignment2;

import java.util.ArrayList;
import java.util.List;

public class Q7 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		System.out.println(subset(a));

	}

	public static List<List<Integer>> subset(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> tempList = new ArrayList<>();

		result.add(tempList);

			for (int num : nums) {
				int n = result.size();
				for (int i = 0; i < n; i++) {
					tempList = new ArrayList<>(result.get(i));
					tempList.add(num);
					result.add(tempList);

				}
			}
			System.out.println(result.size());
		return result;
	}

}
