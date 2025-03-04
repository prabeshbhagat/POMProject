package com.qa.Programs.GFG.Big;

public class SumofNumbersInString {
	

	public static long sumOfNums() {
		
		String s = "1abc23vv24";
		char ch[]=s.toCharArray();
		
		long sum=0;
		String temp="0";
		
		for(char ch1:ch) {
			
			if(Character.isDigit(ch1)) {
				temp+=ch1;
			}else {
				sum=sum+Integer.parseInt(temp);
				temp="0";
			}

		}
		return sum+Long.parseLong(temp);
		
	}


	public static void main(String[] args) {
		long num=sumOfNums();
		System.out.println(num);
		}

}
