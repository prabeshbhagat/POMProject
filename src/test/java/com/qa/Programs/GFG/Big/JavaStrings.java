package com.qa.Programs.GFG.Big;

public class JavaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "Geeks" ;
		String S2 = "forGeeks";
		
		String s3=S1.concat(S2);
		System.out.println(s3);
		String rev="";
		for(int i=s3.length()-1;i>=0;i--) {
			rev=rev+s3.charAt(i);
		}
		System.out.println(rev);
	}

}
