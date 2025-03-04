package com.qa.Programs.GFG.Big;

import java.util.ArrayList;

public class ExtractMaximum {

	public static int extactMaximum() {

		String s = "1000jjj10l";

		ArrayList<Integer> al = new ArrayList<Integer>();
		String temp = "0";
		int flag = -1;
		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				flag = 1;
				temp = temp + ch;
			} else {
				al.add(Integer.parseInt(temp));
				temp = "0";
			}
		}
		al.add(Integer.parseInt(temp));
		System.out.println(al);

		if (flag == -1) {
			return -1;
		}

		int hold = al.get(0);
		for (int i = 1; i < al.size(); i++) {
			if (hold < al.get(i)) {
				hold = al.get(i);
			}
		}

		return hold;

	}

	public static void main(String[] args) {
		int val = extactMaximum();
		System.out.println(val);
	}

}
