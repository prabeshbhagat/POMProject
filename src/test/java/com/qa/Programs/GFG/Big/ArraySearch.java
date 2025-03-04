package com.qa.Programs.GFG.Big;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4};
		int x = 33;
		int flag=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				flag=i;
				break;
			}
		}
		
		System.out.println(flag);
	}

}
