package com.spotassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3 {
	public static int isSubstring(String s, String a) {
		int count = 0;

		return count;
	}

	public static String lexSort(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String sb = "";
		for (char ch : c) {
			sb += ch;
		}
		return sb;
	}

	public static String removeDuplicates(String s) { 
		  String result =""; 
		 
		  char[] c = s.toCharArray();
		  
		  for(int i=0;i<s.length()-1;i++) { 
			  if(c[i]!=c[i+1]) {
				  result+=c[i];
			  }
		  }
		  if(result.charAt(result.length()-1)==s.charAt(s.length()-1)) {
			result+=s.charAt(s.length()-1);
		}
		  return result;
	  
	  }

	public static void main(String[] args) {
		String[] s1 = { "ceo", "alco", "caaeio", "ceai" };
		String s2[] = { "ec", "oc", "ceo" };
		List<String> result = new ArrayList<>();
		for (String s : s1) {
			int count = 1;
			for (String str : s2) {
				if (lexSort(s).contains(lexSort(str))) {
					count++;
				}
			}
			if (count == s2.length) {
				result.add(s);
			}
		}

		System.out.println(result);

	}

}
