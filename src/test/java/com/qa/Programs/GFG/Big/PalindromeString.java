package com.qa.Programs.GFG.Big;

public class PalindromeString {
	
	
	public static void isPallindrome() {
		String s = "abba";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		boolean flag=s.equals(rev);
		System.out.println(flag);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPallindrome();
		
	}

}
