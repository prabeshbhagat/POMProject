package com.qa.Programs.GFG.Big;

public class CheckString {

	public static boolean checkIfString() {

		// TODO Auto-generated method stub
		String s = "gggg2";
		char firstChar = s.charAt(0);
		;
		for (int i = 0; i < s.length(); i++) {

			if (firstChar != s.charAt(i)) {
				return false;
			}

		}

		return true;

	}

	public static void main(String[] args) {
		boolean flag = checkIfString();
		System.out.println(flag);
	}

}
