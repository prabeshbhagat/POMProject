package com.qa.Programs.GFG.Big;

public class CountOfCamelcaseCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "ckjkUUYII";
		int count=0;
		
		for(char ch:S.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
