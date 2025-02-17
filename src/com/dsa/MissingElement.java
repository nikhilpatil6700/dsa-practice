package com.dsa;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr= {2,3,5,6,7};
		System.out.println(missing(arr));
	}
	//option 1
	public static int missing(int[] arr) {
		int mNum=0;
		for(int i=0;i<arr.length-1;i++) {
			
			int diff=arr[i+1]-arr[i];
			if(diff==1) {
				continue;
			}else 
			{
				 mNum=arr[i]+1;
			}
		}
		
		return mNum;
	}
	
}
