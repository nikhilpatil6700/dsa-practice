package com.string;

public class CheckTwoStringSame {

	public static void main(String[] args) {
		String s1="nik";
		String s2="nik";
		System.out.println(twoString(s1, s2));
	}
	
	public static String twoString(String s1,String s2) {
		
		if(s1.length()==s2.length()) {
			
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			int count=0;
			for(int i=0;i<c1.length;i++) {
		      for(int j=0;j<c2.length;j++) {
		    	  if(c1[i]==c2[j]) {
		    		  count++;
		    	  }
		      }
			}
			
			if(count==c1.length) {
				return "matched";
			}
		}
		else {
			return "length not same";
		}
		return "not matched";
	}
}
