package com.dsa;

public class PalindromeArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,2,1,};
		System.out.println(check(arr));
	}
	
	public static String check(int[] arr) {
		int s=0;
		int e=arr.length-1;
		
		while(s<e) {
			if(arr[s]!=arr[e]) {
				return "not palindrome";
			
			}else {
				s++;
				e--;
			}
		}
		return "palindrome";
	}
}
