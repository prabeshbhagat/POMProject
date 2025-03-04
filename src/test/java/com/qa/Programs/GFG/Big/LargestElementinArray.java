package com.qa.Programs.GFG.Big;

public class LargestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 8, 7, 56, 90 };

		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);

	}

}
