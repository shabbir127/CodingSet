package com.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StEx {
	public static void main(String[] args) {
		
		String name="core java";
		
		String[] word=name.split(" ");
		
		StringBuilder result=new StringBuilder();
		for(int i=word.length -1; i>=0 ;i--)
		{
			
			result.append(word[i]).append(" ");
		}
		System.out.println(result);
	
		
		
		
		
		
		
		
		
		Map<Character, Integer>map=new HashMap<>();
		
		char [] chars=name.toCharArray();
		for(char ch:chars)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}else {
				int count=map.get(ch);
				map.put(ch, count +1);
			}
			
			
		}
		System.out.println(map);

		
		
		
	
	
	
	
	
	}
	
	
	

}
