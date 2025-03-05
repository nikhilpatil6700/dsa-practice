package com.string;

public class CountSpace {

	public static void main(String[] args) {
		String str="nikhil rajaram patil";
		System.out.println(space(str));
	}
	
	public static int space(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char charAt = str.charAt(i);
			if(charAt==' ') {
				count++;
				
			}
		}
		
		return count;
	}
}
