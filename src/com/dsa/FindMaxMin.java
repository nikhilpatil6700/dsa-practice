package com.dsa;

public class FindMaxMin {

	public static void main(String[] args) {
		int[] arr= {2,3,4,1,6,5};
		find(arr);
	}
	
	public static void find(int[] arr) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}else if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("max:"+ max+ " min:"+ min);
	}
}
