package com.qa.Programs.GFG.Big;

public class OddEven {
	
	
	public static boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=isEven(20);
		System.out.println(flag);
	}

}
