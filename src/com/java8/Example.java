package com.java8;

import java.util.HashSet;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		
		int arr []= {1,2,4,54,6,7,2,1,8};
		Set<Integer> list=new HashSet<>();
		for(int num:arr)
		{
			list.add(num);
//			if(!list.contains(num))
//			{
//				list.add(num);
//			}
			
		}
		
		System.out.println(list);
		
		

		  System.out.println(stringContainsVowels("Hello")); // true
		  System.out.println(stringContainsVowels("TV")); // false
		 }

		 public static boolean stringContainsVowels(String input) {
		  return input.toLowerCase().matches(".*[aeiou].*");
		 }
		
	
	
	


}
