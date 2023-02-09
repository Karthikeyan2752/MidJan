package com.spotassignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Q8 {

	static void insertionSort(int[] a) {

		for (int i = 1; i < a.length; i++) {

			int currentElement = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > currentElement) {
				a[j + 1] = a[j];
				j--;
			}

			a[j + 1] = currentElement;
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the unsorted Array: ");
		int n = sc.nextInt();
		System.out.println("Enter" + n + " elements");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			n = sc.nextInt();
			a[i] = n;
		}

		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
