package com.qa.Programs.GFG.Big;

public class UpperCaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//	     String s = "eyelbjgxjtldb ndzkn vizvsynkg g w occi kvre wd fw h bxjm";
//	        String words[]=s.split(" ");
//	        String temp="";
//	        for(String word:words){
//	            String a=word.substring(0,1);
//	            String b=a.toUpperCase();
//	            String c=word.substring(1);
//	            temp=temp+b+c+" ";
//	        }
//	        
//	        System.out.println(temp);
		
		//String s = "i love programming";
		String s = "eyelbjgxjtldb ndzkn vizvsynkg g w occi kvre wd fw h bxjm";
		String []arr=s.split(" ");
		String s3="";
		for(String str:arr) {
			String s4 =Character.toUpperCase(str.charAt(0))+str.substring(1);
			s3=s3+" "+s4;
		}
		System.out.println(s3.trim());
	}

}


