package com.dsa;

public class ReverseNumber {

	public static void main(String[] args) {
		reverse(1234);
	}
	
	public static void reverse(int num) {
		
		int rem;
		int sum=0;
		
		while(num>0) {
			rem=num%10;
			sum=rem+sum*10;//4+0*10=40,  
			num=num/10;//123
			
			
		}
		System.out.print(sum);
	}
}
