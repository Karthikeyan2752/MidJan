package com.spotassignment2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q4 {

	public static String password(Set<String> strs, String s) {
		String result = "";

		for (int i = 0; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (strs.contains(s.substring(j, i))) {
					result += s.substring(j, i) + " ";
				}
			}
		}

		String r = result.replaceAll(" ", "");
		return r.length() == s.length() ? result : "wrong password";

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of words: ");
		int n = sc.nextInt();

		Set<String> strs = new HashSet<>();
		String s = "";
		for (int i = 0; i < n; i++) {
			s = sc.next();
			strs.add(s);
		}

		System.out.println("Enter the string: ");
		s = sc.next();



		System.out.println(password(strs, s));


	}

}
