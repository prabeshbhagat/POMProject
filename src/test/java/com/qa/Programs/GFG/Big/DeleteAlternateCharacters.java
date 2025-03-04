package com.qa.Programs.GFG.Big;

public class DeleteAlternateCharacters {

	public static void main(String[] args) {
		String s = "GeeksforGeeks";
		String temp="";
		
		for(int i=0;i<s.length();) {
			temp=temp+s.charAt(i);
			i=i+2;
		}
		System.out.println(temp);

	}

}
