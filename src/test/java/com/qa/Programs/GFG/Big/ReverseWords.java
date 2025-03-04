package com.qa.Programs.GFG.Big;

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "v fzeh   vpq  ojg";
					
		String arr[]=s.split(" ");
		
		
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
				String temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
		}
		String temp=String.join(" ", arr);
		//String.valueOf(arr);
		System.out.println(temp);
		String temp1=temp.replace("   ", " ");
		System.out.println(temp1);
		String temp2=temp1.replace("  ", " ").trim();
		System.out.println(temp2);
		

	}

}
