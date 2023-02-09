package com.spotassignment2;

import java.util.Arrays;

public class Q6 {

	private static void transpose(int[][] a, int length) {
		for(int i=0;i<length;i++) {
			for (int j = i; j < length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
	}

	public static void rotateMatrix(int[][] a, int k) {
		if (k == 0) {
			return;
		}

		int length = a.length;
		transpose(a, length);

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length / 2; j++) {
				int temp = a[i][j];
				a[i][j] = a[i][length - 1 - j];
				a[i][length - 1 - j] = temp;
			}
		}
		rotateMatrix(a, k - 1);

	}

	static void print(int[][] a) {
		for (int[] a1 : a) {
			System.out.println(Arrays.toString(a1));
		}
	}
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotateMatrix(a, 1);
		print(a);


	}

}
