package com.qa.Programs.GFG.Big;

public class Fibonnaci {
	
	public static void fibSum(long num) {
		
		int n1=0,n2=1,sum=0;
		//0,1,1,2,3
		//
		//sum=n1+n2;
		//0,1,1,2,3,4,5,6,7,8,9
		long temp=0;
	
		for(int i=0;i<=num;i++) {
			//System.out.println(n1+","+n2);
			sum=n1+n2;
			temp=temp+n1;
			//System.out.println(sum);
			n1=n2;
			n2=sum;
			//temp=temp+sum;
		}
		
		//System.out.println(sum);
		System.out.println(temp);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibSum(62);
	}

}
