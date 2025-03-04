package com.qa.Programs.GFG.Big;

import java.util.Arrays;

public class StringAnagram {

	public static boolean checkAnagram() {
		String s1 = "geeks";
		String s2 = "kseeg";

		if (s1.length() != s2.length()) {
			return false;
		}
		
		System.out.println("----------");
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);

	}

	public static void main(String[] args) {
		
		boolean flag=checkAnagram();
		System.out.println(flag);

		/**
		 * 
		 * String str1 = s1.replaceAll("\\s", ""); String str2 = s2.replaceAll("\\s",
		 * "");
		 * 
		 * if (str1.length() != str1.length()) { System.out.println("Length are not
		 * equal"); return false; } else {
		 * 
		 * char ch[]=str1.toLowerCase().toCharArray(); char
		 * ch1[]=str2.toLowerCase().toCharArray(); Arrays.sort(ch); Arrays.sort(ch1);
		 * return Arrays.equals(ch, ch1); }
		 * 
		 **/

	}

}
