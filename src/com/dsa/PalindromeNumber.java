package com.dsa;

public class PalindromeNumber {

	public static void main(String[] args) {
		check(121);
	}
	
	public static void check(int num) {
		int sum=0,rem;
		int org=num;
		while(num>0) {
			rem=num%10;
			sum=rem+sum*10;
			num=num/10;
		}
		System.out.println(sum);
		if(sum==org) {
			System.out.println("number is palindrome");
		}else
		{
			System.out.println("number is not palindrome");
		}
	}
}
