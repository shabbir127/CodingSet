package com.java8;

import java.util.HashSet;
import java.util.Set;

public class ArrayEx1 {
	public static void main(String[] args) {
		
		int[] arr1= {1,3,5,7,9};
		int [] arr2= {2,4,6,8,10};
		int i=0;
		int j=0;
		int count=0;
		
		int result[]=new int[arr1.length + arr2.length];
		
		while(i< arr1.length && j<arr2.length )
		{
			if(arr1[i] <= arr2[j])
			{
				result[count]=arr1[i];
				i++;
				count++;
			}else {
				result[count]=arr2[j];
				j++;
				count++;
			}
		}
		
		while(i < arr1.length)
		{
			result[count]=arr1[i];
			i++;
			count++;
		}
		while(j < arr2.length)
		{
			result[count]=arr2[j];
			j++;
			count++;
		}
		
		for(int printresult : result)
		{
			System.out.print(printresult + " ");
		}
		
		
		String input[]={"apple","  ", "ant","banana","apple","mango"," " };
		Set<String>set=new HashSet<String>();	
		for(String n:input)
		{
			if(!n.isEmpty())
			{
				if (n.startsWith("a")) {
					set.add(n);
					
				}
			}
		}
		System.out.println(set);
	
		
		
		
	}

}
