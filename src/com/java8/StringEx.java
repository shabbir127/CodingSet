package com.java8;

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
	
	
	public static void main(String[] args) {
		
		
	
	
	
	
	}
}
