package com.qa.Programs.GFG.Big;

import java.util.Arrays;

public class countCharacterTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "#GeeKs01fOr@gEEks07";
		int digit=0;
		int up=0;
		int lower=0;
		int special=0;
		for(char ch:s.toCharArray()) {
			if(Character.isDigit(ch)) {
				digit++;
			}else if(Character.isUpperCase(ch))
			{
				up++;
			}else if(Character.isLowerCase(ch))
			{
				lower++;
			}else {
				special++;
			}
		}
		
		int arr[]= {digit,up,lower,special};
		System.out.println(Arrays.toString(arr));
		System.out.println(digit+"--"+up+"--"+lower+"--"+special);
	}	

}
