package com.string;

public class CountChar {

	public static void main(String[] args) {
		String str="aabbcdddda";
		count(str);
	}
	
	public static void count(String str) {
		int[] hash=new int[26];
		String lc = str.toLowerCase();
		char[] ca = lc.toCharArray();
		for(int i=0;i<ca.length;i++) {
			hash[ca[i]-97]++;
		}
		
		for(int i=0;i<hash.length;i++) {
			if(hash[i]>0)
			//System.out.println((char)(i+'a') +" found "+ hash[i]+ " time");
			System.out.print((char)(i+'a')+""+hash[i]);
		}
	}
}
