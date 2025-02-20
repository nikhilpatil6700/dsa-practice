package com.dsa;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr= {4,2,6,5,8};
		System.out.println(secondLargest(arr));
	}
	
	public static int secondLargest(int[] arr) {
	
		int large=Integer.MIN_VALUE;
		int secondLarge=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				secondLarge=large;
				large=arr[i];
				
			}
			else if(arr[i]>secondLarge && secondLarge<large) {
				secondLarge=arr[i];
			}
		}
		return secondLarge;
	}
}
