package com.dsa;

import java.util.Iterator;

public class RotateArray {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7};
		System.out.println("after rotation 3 time");
		rotate(arr,3);
		printArray(arr); 
		
		System.out.println();
		System.out.println("after rotation 3 time reverse again");
		rotate2(arr, 3);
		printArray(arr);
	}
	
	
	//1,2,3,4,5,6,7  -> 3 time
	//5,6,7,1,2,3,4
	public static void rotate(int[] arr,int k) {
		
		int length=arr.length;
		int[] temp= new int[length];
		
		System.arraycopy(arr, 0, temp, 0, length);
		
	    for(int i=0;i<arr.length;i++) {
	    	arr[(i+k)%length]=temp[i];
	    }
	}
	
	//5,6,7,1,2,3,4   <- 3 time
	//1,2,3,4,5,6,7
	public static void rotate2(int[] arr,int k) {
		int length=arr.length;
		int[] temp= new int[length];
		
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[(i+k)%length];
		}
		
		System.arraycopy(temp, 0, arr, 0, length);

	}
	
	public static void printArray(int[] arr) {
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
	
}
