package com.spotassignment;

import java.util.Stack;

public class Q1 {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else if (!stack.isEmpty()) {
				if (((stack.peek() == '{') && (s.charAt(i) == '}')) || ((stack.peek() == '(') && (s.charAt(i) == ')'))
						|| ((stack.peek() == '[') && (s.charAt(i) == ']'))) {
					stack.pop();
				} else {
					return false;
				}

			} else {
				return false;
			}
		}
		return stack.isEmpty();
	}

	public static boolean checkAlphabets(String s) {
		char[]ch = s.toCharArray();
		for (int i = 1; i < s.length() - 1; i++) {
			if (s.charAt(i) == '-' || s.charAt(i) == '+' || s.charAt(i) == '*' || s.charAt(i) == '/') {
				if ((s.charAt(i - 1) <= 122 && s.charAt(i - 1) >= 97 && s.charAt(i + 1) <= 122
						&& s.charAt(i + 1) >= 97)) {
					return true;
				}
			}
		}
	return false;
	}
	public static void main(String[] args) {
		String s = "(a+b)";
		System.out.println(isValid(s));

	}

}
