package com.qa.Programs.GFG.Big;

import java.util.Arrays;


public class ReverseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeks";
		System.out.println(s+"----1");
		char ch[]= s.toCharArray();
		Arrays.sort(ch);
		//String temp=String.valueOf(ch);
		StringBuilder rev = new StringBuilder(ch.length);
        for (int i = ch.length - 1; i >= 0; i--) {
            rev.append(ch[i]);
        }

        
		System.out.println(rev.toString());

}
}
