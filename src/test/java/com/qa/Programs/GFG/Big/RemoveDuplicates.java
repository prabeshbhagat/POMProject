package com.qa.Programs.GFG.Big;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "zvvo";
		String withoutDup="";
		
		for(char ch:s.toCharArray()) {
			if(!withoutDup.contains(String.valueOf(ch))) {
				withoutDup=withoutDup+ch;
			}
		}
		
		
		System.out.println("--"+withoutDup);
		
		
	}

}
