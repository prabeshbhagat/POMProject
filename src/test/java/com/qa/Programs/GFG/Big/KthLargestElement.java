package com.qa.Programs.GFG.Big;

import java.util.Arrays;

public class KthLargestElement {

	public static void main(String[] args) {
		int arr[] = {3, 5, 4, 2, 9};
		int k = 3;
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-k]);
		

	}

}
