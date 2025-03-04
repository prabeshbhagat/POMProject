package com.qa.Programs.GFG.Big;

public class ChangetheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aAbcd";
		
		String caseChange="";
		
		
			char ch1=s.charAt(0);
			
			if(Character.isUpperCase(ch1)) {
				caseChange=s.toUpperCase();
			}else {
				caseChange=s.toLowerCase();
			}
			
		
		
		System.out.println(caseChange);
		
		
	}

}
