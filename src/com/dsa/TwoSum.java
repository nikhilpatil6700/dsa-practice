package com.dsa;

//Find two numbers in an array that add up to a given target.
public class TwoSum {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int target=5;
		twoSum(arr, target);
	}
	
	public static void twoSum(int[] arr,int target) {
		
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+" "+arr[j]);
					break;
					
					
				}
		}
	}
		

	}
}
