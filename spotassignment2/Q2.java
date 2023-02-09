package com.spotassignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Q2 {

	public static void sortString(ArrayList<String> s) {
		ArrayList<String> str = new ArrayList<>(s);

		ArrayList<String> temp = new ArrayList<>(str);
		Collections.sort(temp);
		for (int i = 0; i < s.size(); i++) {
			if (str.indexOf(temp.get(i)) < s.size() / 2) {
				System.out.print("- ");
			} else {
				System.out.print(temp.get(i).substring(1) + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> str = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			str.add(s);
		}

		sortString(str);

	}

}
