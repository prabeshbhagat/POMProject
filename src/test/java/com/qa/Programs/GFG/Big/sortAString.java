package com.qa.Programs.GFG.Big;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortAString {
	
	public static void sortedString() {
		String s = "edcab";
		
		char ch[]=s.toCharArray();
		
		Arrays.sort(ch);
		
		String str= new String(ch);
		System.out.println(str);
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "edcab";
		ArrayList<Character> al= new ArrayList<>();
		
		for(char ch:s.toCharArray()) {
			al.add(ch);
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		String temp="";
		for(Character str:al) {
			temp=temp+str;
		}
		System.out.println(temp);
		
		
		sortedString();///Another way to achive the same 

	}

}
