package com.dsa;

import java.util.HashSet;
import java.util.Set;

public class UnionElement {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {2,3,4,4,5};
		union(arr1, arr2);
		
	}
	
	
	/*
	 arr1[] = {1,2,3,4,5}  
	 arr2[] = {2,3,4,4,5}
	 
     Output:  {1,2,3,4,5}
    */
	
	public static void union(int[] arr1,int[] arr2){
		
		Set<Integer> union= new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			union.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			union.add(arr2[i]);
		}
		
		for(int num:union) {
			System.out.print(num+" ");
		}
	}
}
