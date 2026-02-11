package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
	
	public static void missingNumber(int arr[])
	{
		int n= arr.length + 1;
		int presentNumberSum=n*(n+1)/2;
		int missingNumbercheck=0;
		
		for(int check : arr)
		{
			missingNumbercheck +=check;
			
		}
		
		System.out.println(presentNumberSum - missingNumbercheck);	
	}
	
	public static void main(String[] args) {
		
		int arr[]= {20,23,14,25,26,26,27,39,38,40,40};
		int arr1[]= {1,2,3,4,5,7};
		ArraySet.SecondLargest(arr);
		ArraySet.missingNumber(arr1);
		
		List<Integer> numbers=Arrays.asList(1,2,34,5,6,7,7,8,9);
		//List<String> strings=Arrays.asList("Shabbir","khan","altaf");
		List<String> strings=List.of("Shabbir","khan","altaf");
		long count=numbers.stream().count();
		System.out.println("count of number " + count);
		
		long countstring=strings.stream().count();
		System.out.println("count of Strings " + countstring);
		
		Optional<Integer> ns =numbers.stream().findFirst();
		System.out.println(ns.get());;
		
		boolean result=numbers.stream().anyMatch(n->n >7);
		System.out.println(result);
			}
	
	

}
