package com.java8;

public class ArraySet {
	
	public static void SecondLargest(int arr[]) {

		int height=Integer.MIN_VALUE;
		int SecongHeight=Integer.MIN_VALUE;
		
		for(int n:arr)
		{
			if(n > height)
			{
				SecongHeight=height;
				height=n;
			}else if (n > SecongHeight && n != height) {
				SecongHeight=n;
			}
		}
		System.out.println("SecondHeight value is :- "+SecongHeight);

	}
	
	public static void main(String[] args) {
		
		int arr[]= {20,23,14,25,26,26,27,39,38,40,40};
		ArraySet.SecondLargest(arr);
		
			}

}
