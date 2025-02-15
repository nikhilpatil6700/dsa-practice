package com.dsa;

import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {

	public static void main(String[] args) {
		int arr1[] = {4,9,5};
		int arr2[] = {9,4,9,8,4};
		System.out.println("intersection1");
		intersection(arr1, arr2);
		System.out.println("intersection2");
		intersection2(arr1, arr2);
	}
	/*
	 Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     Output: [9,4]
	 */
	
	//answer 1
	public static void intersection(int[] arr1,int[] arr2) {
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					set.add(arr1[i]);
				}
			}
		}
		for(int ans: set) {
			System.out.println(ans);
		}
	}
	
	//answer 2
	public static void intersection2(int[] arr1,int[] arr2) {
		Set<Integer> set1= new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set1.add(arr1[i]);
		}
		
		Set<Integer> set2= new HashSet<>();
		for(int i=0;i<arr2.length;i++) {
			set2.add(arr2[i]);
		}
		
	    Set<Integer> mainSet=new HashSet<>();
	    for(int num:set1) {
	    	if(set2.contains(num)) {
	    		mainSet.add(num);
	    	}
	    }
	    for(int ans: mainSet) {
	    	System.out.println(ans);
	    }
	}

}
