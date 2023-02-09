package com.spotassignment2;

import java.util.Set;

public class Q4 {

	public static String password(Set<String> strs, String s) {
		String result = "";

		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;
		for (int i = 0; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] && strs.contains(s.substring(j, i))) {
					dp[i] = true;
					result += s.substring(j, i);
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Set<String> strs = Set.of( "because", "can", "do", "must", "what" );
		String s = "wedowhatwemustbecausewecan";
		System.out.println(password(strs,s));

	}

}
