package com.qa.Programs.GFG.Big;

public class ConvertalistofcharactersintoaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char array[] = {'g','e','e','k','s','f','o','r'};
		
		String temp="";
		for(char ch:array) {
			temp=temp+ch;
		}
		
		System.out.println(temp);
		
		System.out.println(String.valueOf(array));
		
	}

}
