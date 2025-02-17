package com.dsa;

public class FindMultipleMissing {

	public static void main(String[] args) {
		int[] arr={1,3,6,8,10};
		int[] arr2= {1,4,6};
		missingMult(arr);
		System.out.println("-------------");
		missingMult2(arr2);
		
		
	}
	
	//option 1
	public static void missingMult(int[] arr) {
		
		int s=arr[0];
		int diff=s-0;
		for(int i=0;i<arr.length-1;i++) {
			if(diff!=arr[i]-i) {
				while(diff<arr[i]-i) {
					System.out.println(diff+i);
					diff++;
				}
			}
		}
	}
	

//option 2
	//1,4,6
	public static void missingMult2(int[] arr) {
		int mNum=arr[0];
		for(int i=0;i<arr.length;i++) {
			while(mNum<arr[i]) {
				System.out.println(mNum);
				mNum++;
			}
			mNum++;
		}
		
	}
}
