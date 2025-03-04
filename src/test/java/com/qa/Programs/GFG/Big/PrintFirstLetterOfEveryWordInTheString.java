package com.qa.Programs.GFG.Big;

public class PrintFirstLetterOfEveryWordInTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeks for geeks";
		String words[] = s.split(" ");
		String temp = "";
		for (String word : words) {
			temp = temp + word.substring(0, 1);
		}
		System.out.println(temp);
	}

}
