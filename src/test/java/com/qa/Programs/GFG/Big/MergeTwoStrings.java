package com.qa.Programs.GFG.Big;

public class MergeTwoStrings {

	public static void mergeTwoStrings() {
		String S1 = "Hello";
		String S2 = "Bye";
		String mergedString = "";
		int length1 = S1.length();
		int length2 = S2.length();
		int maxLength = Math.max(length1, length2);
		
//		System.out.println(length1);
//		System.out.println(length2);
//		System.out.println(maxLength);

		for (int i = 0; i < maxLength; i++) {
			if (i < length1) {
				mergedString = mergedString + S1.charAt(i);
			}
			if (i < length2) {
				mergedString = mergedString + S2.charAt(i);
			}
		}

		System.out.println(mergedString + "--");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergeTwoStrings();

	}

}
