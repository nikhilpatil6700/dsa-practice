package com.dsa;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 2, 3, 6, 3, 7, 8, 1, 1};
		duplicate(arr);

	}
	//1, 2, 3, 4, 5, 2, 3, 6, 3, 7, 8, 1, 1
	public static void duplicate(int[] arr) {
		
		HashMap<Integer, Integer> map=new HashMap<>();
		
		for(int num:arr) {
			map.put(num,map.getOrDefault(num,0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" appear "+ entry.getValue()+ " time");
			}
		}
	}
		
}
