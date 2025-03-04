package com.qa.Programs.GFG.Big;

public class ArraySubset {

	public static void main(String[] args) {
		boolean flag=m1();
		System.out.println(flag);
		
		
	}

	public static boolean m1() {
		int a[] = {1,2,2};
		int b[] = {1,1};
		for (int i = 0; i < b.length; i++) {
			boolean found = false;
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				return false;
			}
		}
		return true;
	}

}
