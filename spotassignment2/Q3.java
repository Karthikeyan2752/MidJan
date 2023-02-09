package com.spotassignment2;

public class Q3 {

	public static int notificationsCount(int n, int d, int[] expenditure) {

		// int trailingDayStart = n - d;
		int notifications = 0;
		int median = getMedian(expenditure, d);
		// System.out.println(median);
		for (int i = d; i < n; i++) {
			if (expenditure[i] >= median) {
				notifications++;
			}
		}

		return notifications;
	}

	public static int getMedian(int[] a, int d) {

		insertionSort(a, 0, d);
		int median = 0;
		if (d % 2 == 0) {
			d /= 2;
			median = a[d] + a[d - 1];
			return median;
		}
		return (a[(d / 2) + 1]) * 2;
	}

	static void insertionSort(int[] a, int start, int end) {

		for (int i = 1; i < end; i++) {

			int currentElement = a[i];
			int j = i - 1;

			while (j >= start && a[j] > currentElement) {
				a[j + 1] = a[j];
				j--;
			}

			a[j + 1] = currentElement;
		}

	}

	public static void main(String[] args) {
		int d = 4;
		int[] ex = { 1, 2, 3, 4, 4 };

		System.out.println(notificationsCount(ex.length, d, ex));

	}

}
