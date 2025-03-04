package com.qa.Programs.GFG.Big;

public class AnagramPalindrome {

	public static void main(String[] args) {
		String s = "geeksogeeks";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		

	}

}
