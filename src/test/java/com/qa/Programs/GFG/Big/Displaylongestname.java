package com.qa.Programs.GFG.Big;


import java.util.Arrays;
import java.util.List;

public class Displaylongestname {
	
	
	public static String findLongestString(List<String> arr) {
		
		if( arr==null || arr.isEmpty()) {
			return null;
		}
		
		String longest = arr.get(0);
		for(String str:arr) {
			if (str.length() >longest.length()) {
				longest = str;
			}
		}
		return longest;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = {"Apple", "Mango", "Orange", "Banana"};
		//String arr[] = {};
		//String arr[] = {null};
		List<String> ar1 = Arrays.asList(arr);
		String longest=findLongestString(ar1);
		System.out.println(longest);

	}

}
