package com.qa.Programs.GFG.Big;

import java.util.Arrays;

public class ReverseanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,3,2,6,5};
		
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
