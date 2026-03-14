package com.java8;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practice {
	
	public static void revserString()
	{
		// O/P:- ayiahb ribbahS
		String input="Shabbir bhaiya";
		String rev="";
		for(int i=0;i<input.length();i++)
		{
		     
			rev =input.charAt(i)+rev;
		}
		System.out.println(rev);
		
		
		// O/P:- bhaiya Shabbir
		String[] word=input.split(" ");
		String sBuilder="";
		for(String str:word)
		{
			sBuilder=str +" " + sBuilder;
		}
		System.out.println(sBuilder);
		
		// O/P:- first non repeating character :- S.
		for(char ch : input.toCharArray()) {
		if(input.indexOf(ch)== input.lastIndexOf(ch))
		{
			System.out.println(ch);
			break;
		}
		
		}
		// alternative method................
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<input.length();i++)
		{
			if(!map.containsKey(input.charAt(i)))
			{
				map.put(input.charAt(i), 1);
			}else {
				map.put(input.charAt(i), map.get(input.charAt(i))+1);
			}
			
		}
		

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println("First non repeating using map: " + entry.getKey());
                break;
            }
        }
        
		}
		
	
	//check anagram
    
    public static boolean AnagramString()
    {
    	String s1="listen";
    	String s2="salent";
    	
    	int count[]=new int[256];
    	
    	if (s1.length() != s2.length()) {
			System.out.println("This is not anagram String....");
		      return false;
		}
    	
    	for(int i=0;i<s1.length();i++)
    	{
    		count[s1.charAt(i)]++;
    		count[s2.charAt(i)]--;
    		
    	}
    	for(int c:count)
    	{
    		if(c!=0)
    		{
    			return false;
    		}
    	}
    	
    	return true;
    }
    
	
	
	public static void main(String[] args) {
		revserString();
		System.out.println("The String is AnagramString  "+AnagramString());;
	}

}














