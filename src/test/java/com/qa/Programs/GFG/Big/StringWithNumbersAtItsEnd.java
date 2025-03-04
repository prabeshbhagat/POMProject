package com.qa.Programs.GFG.Big;



public class StringWithNumbersAtItsEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xyxapesj00047519742156243264036";
		String temp="";
		String num="0";
		for(char ch:s.toCharArray()) {
			if(!Character.isDigit(ch)) {
				temp=temp+ch;
			}else {
				num=num+ch;
			}
		}
		
		long nums=Long.parseLong(num);
		int len=temp.length();
		if(nums==len) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}

}
