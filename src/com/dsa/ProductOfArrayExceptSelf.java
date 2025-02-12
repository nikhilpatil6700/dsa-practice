package com.dsa;
//Product of Array Except Self
public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int[] product = product(arr);
		
		for(int num:product) {
			System.out.print(num+" ");
		}
	}
	
	public static int[] product(int[] arr) {
		int lenght=arr.length;
		int[] left= new int[lenght];
		int[] right= new int[lenght];
		
		 left[0]=1;
		 for(int i=1;i<arr.length;i++) {
			 left[i]=left[i-1]*arr[i-1];
		 }
		 
		 right[lenght-1]=1;
		 for(int i=lenght-2;i>=0;i--) {
			 right[i]=right[i+1]*arr[i+1];
		 }
		
		 int[] ans=new int[lenght];
		 for(int i=0;i<arr.length;i++) {
			 ans[i]=left[i]*right[i];
		 }
		 
		 return ans;
	}
}
