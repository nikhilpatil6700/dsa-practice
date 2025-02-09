package com.dsa;
//Best Time to Buy and Sell Stock

public class StockBuySell {

	public static void main(String[] args) {
		int[] arr= {7,1,6,4,3,1};
		System.out.println(maxPrice(arr));
		
	}
	
	public static int maxPrice(int[] arr) {
		
	  
	  int maxValue=0;
	  for(int i=0;i<arr.length;i++) {
		int max=arr[i];
		  for(int j=i+1;j<arr.length;j++) {
			  
			  if(arr[j]>max) {
				  max=arr[j];
			  }
		  }
			 
       int profit=max-arr[i];
       if(profit>maxValue) {
    	   maxValue=profit;
       }
	}
	 
	  
	  return maxValue;
	}
}
