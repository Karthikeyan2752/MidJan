package com.spotassignment;

public class Q2 {

	public static void twoEqualArrays(int[] a) {
		int i = 0;
		int j = a.length - 1;

		int sum1 = 0;
		int sum2 = 0;
		while (i <= j) {
			if (sum1 == sum2) {
				sum1 += a[i++];
				sum2 += a[j--];
			} else if (sum1 < sum2) {
				sum1 += a[i++];
			} else if (sum1 > sum2) {
				sum2 += a[j--];
			}
		}

		if (sum1 != sum2) {
			System.out.println("cannot be partitioned");
			return;
		}

		for (int k = 0; k < i; k++) {
			System.out.print(a[k] + " ");
		}
		System.out.println();
		int index = 0;
		for (int m = j + 1; m < a.length; m++) {
			// result2[index] = a[m];
			System.out.print(a[m] + " ");
		}

	}

	public static void main(String[] args) {
		int a[] = { 5, 1, 1, 2, 5 };
		twoEqualArrays(a);

	}

}
