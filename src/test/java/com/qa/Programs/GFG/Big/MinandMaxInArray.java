package com.qa.Programs.GFG.Big;

public class MinandMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {56789};
		
		int largest=arr[0];
		int smallest=arr[0];
		for(int i:arr) {
			if(i>largest) {
				largest=i;
			}
			if(i<smallest) {
				smallest=i;
			}
			
		}
		System.out.println(largest);
		System.out.println(smallest);
		//Pair<Integer, Integer> result = new Pair<>(largest, smallest);

	}

}
