package com.java8;

import java.util.Arrays;

public class StringEx {
	
	public static void secondMax()
	{
        int arr[]= {12,2,35,34,56,34,56,57};
		
		int max=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE; 
		
		for(int i=0; i < arr.length;i++)
		{
			if (arr[i] > max) {
				second=max;
				max=arr[i];
			}else if (arr[i] > second && max != arr[i]) {
				second=arr[i];
			}
		}
		System.out.println(second);
		System.out.println(max);
	}
	
	public static void sortLastDigit()
	{
	   Integer arr[]= {12,23,34,56,78,21,42};
	   
	   Arrays.sort(arr,(a,b) -> (b % 10)  - (a % 10));
	   
	   System.out.println(Arrays.toString(arr));
	      
	}
	
	public static void main(String[] args) {
		
		sortLastDigit();
	
	
	
	
	}
}
