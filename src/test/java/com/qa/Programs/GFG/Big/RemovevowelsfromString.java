package com.qa.Programs.GFG.Big;

public class RemovevowelsfromString {
	
	
	public static boolean isVowel(char ch) {
		
		if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u' ) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "&%^oq^";
		String temp="";
		StringBuilder temp1 = new StringBuilder();
		for(char ch:s.toCharArray()) {
			if(!isVowel(ch)) {
				//temp=temp+ch;
				temp1.append(ch);
			}
		}
		System.out.println(temp1);
		
		
	}

}
