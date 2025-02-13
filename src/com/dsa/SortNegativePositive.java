package com.dsa;

public class SortNegativePositive {

	public static void main(String[] args) {
		int[] arr= {2,3,-4,6,-5};
		sort(arr);
	}
	//[2,3,-4,6,-5]
	public static void sort(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			
			while(arr[start]<0) {
				start++;
			}
			while(arr[end]>0) {
				end--;
			}
			
			if(start<end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		for(int num:arr) {
			System.out.println(num);
		}
	}
}
