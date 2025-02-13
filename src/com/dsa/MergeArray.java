package com.dsa;

public class MergeArray {

	public static void main(String[] args) {
		int[] a= {1,3,5};
		int[] b= {2,4,6,5};
		merge(a, b);
	}
	
	public static void merge(int[] arr1,int[] arr2) {
		int[] arr3=new int[arr1.length+arr2.length];
		int start=0;
		for(int i=0;i<arr1.length;i++) {
			arr3[start]=arr1[i];
			start++;
		}
		for(int j=0;j<arr2.length;j++) {
			arr3[start]=arr2[j];
			start++;
		}
		
		for(int num: arr3) {
			System.out.println(num);
		
	}
		
		
	}
}
