package com.java8;

public class Array {
	
	public static void reverse(int arr[]) {
		
		int start=0;
		int end=arr.length-1;
		
		while(start < end)
		{
			int temp=0;
			
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start ++;
			end --;
			
		}
			
	}
	
	public static void print(int arr[])
	{
		for(int i=0;i< arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	
	
	public static int max(int arr[])
	{
		int max=arr[0];
		for(int i=0 ; i < arr.length ;i++)
		{
			if(max < arr[i])
			{
				max=arr[i];
			}
		}
		
		return max;
	}
	
	
	
	public static void main(String[] args) {
	
		int[] arr= {1,2,3,4,5,6,7};
		System.out.println("Orginal array:- ");
		print(arr);
//		reverse(arr);
//		System.out.println("\nReverse Array:- ");
//		print(arr);
		
		System.out.println("\n Max value is -"+max(arr));
	}

}
