package com.qa.Programs.GFG.Big;

public class Reversingthevowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "practice";
		String temp="";
		
		for(char ch:s.toCharArray()) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				temp=temp+ch;
			}
		}
		
		System.out.println(temp);
		
		String rev="";
		for(int i=temp.length()-1;i>=0;i--) {
			rev=rev+temp.charAt(i);
		}
		
		System.out.println(rev);
		
		
		
		
		
		
	}

}
