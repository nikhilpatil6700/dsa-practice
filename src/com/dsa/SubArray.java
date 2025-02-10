package com.dsa;

//Given an integer array nums, find the subarray with the largest sum, and return its sum.


public class SubArray {

	public static void main(String[] args) {
		int[] arr= {5,4,-1,7,8};
		System.out.println(maxSubArray(arr));
	}
	//[-2,1,-3,4,-1,2,1,-5,4]
	public static int maxSubArray(int[] arr) {
		
		int maxValue=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum>maxValue) {
				maxValue=sum;
			}
			
			if(sum<0) {
				sum=0;
			}
		}
		
		return maxValue;
	}
}
