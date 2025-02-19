package com.dsa;

public class MoveZero {

	public static void main(String[] args) {
		int[] arr1= {2,1,0,5,0,1};
		int[] arr2= {2,1,0,6,0,5,0,1};

		moveLast(arr1);
		System.out.println("-----------------");
		moveFirst(arr2);
	}
	//2,1,5,1,0,0
	public static void moveLast(int[] arr) {
		int[] ans=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				ans[j]=arr[i];
				j++;
			}
		}
		
		for(int num: ans) {
			System.out.println(num);
		}
	}
	
	//0,0,0,2,1,6,5,1
	public static void moveFirst(int[] arr) {
		
		int[] ans=new int[arr.length];
		int j=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				ans[j]=arr[i];
				j--;
			}
		}
		for(int num:ans) {
			System.out.println(num);
		}
	}
	
}
