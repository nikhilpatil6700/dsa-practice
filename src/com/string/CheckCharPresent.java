package com.string;

public class CheckCharPresent {

	public static void main(String[] args) {
		String str="nikhil";
		System.out.println(check(str, 'k'));
	}
	
	public static String check(String str,char c) {
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]==c) {
				return "present";
			}
		}
		
		return "not present";
		
	}
}
