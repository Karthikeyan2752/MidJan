package com.spotassignment2;

public class Q10 {

	public static int numberOfPairsDivisibleByK(int[] a, int k) {

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] + a[j]) % k == 0) {
					System.out.println(a[i] + " " + a[j]);
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k = 5;
		System.out.println(numberOfPairsDivisibleByK(a, k));
	}

}
