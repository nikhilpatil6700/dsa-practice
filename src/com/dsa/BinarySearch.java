package com.dsa;
//binary search-find index of target
public class BinarySearch {
	public static void main(String[] args) {
	int[] arr= {1,3,5,7,9,10};
	int target=10;
	System.out.println(search(arr, target));
}
	
	public static int search(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		int mid;
		while(start<=end) {
			mid=(start+end)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return -1;
	}
}
