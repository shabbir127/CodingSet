package com.java8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringExample {
	
	public static void main(String[] args) {
		
		
		String str="my name is Shabbir Khan";
		
		String [] word=str.split(" ");
		
		StringBuilder builder=new StringBuilder();
		
		for(int i=word.length-1;i >= 0;i--)
		{
		     builder.append(word[i] + " ");
		}
		
		System.out.println(builder.toString());
	

	
	
	
	// reverse string
	
	String ogString="Shabbir";
	
	for(int i=ogString.length()-1; i>=0;i--)
	{
		System.out.print(ogString.charAt(i));
	}
	System.out.println("\nremove Duplicate");
	// remove Duplicate
	StringBuilder removeduplicate=new StringBuilder();
	ogString.chars().distinct().forEach(c->removeduplicate.append((char) c));
	
	System.out.println(removeduplicate);
	
	
	Set<Character> set=new HashSet<>();
	char [] charr=ogString.toCharArray();
	for(int i=0;i<ogString.length();i++)
	{
		set.add(charr[i]);
	}
	for(char ch:set)
	{
		System.out.print(ch);
	}
	
	
	//reverse the string java code -> avaj edoc
	
	String input="Java code";
	System.out.println("\n"+input);
	String [] words=input.split(" ");
	
	String output=" ";
	
	for(String word1: words)
	{
		String revword="";
		for(int i=word1.length()-1; i>=0;i--)
		{
			revword =revword+word1.charAt(i);
		}
		
		output=output + revword+ " ";
	}

	System.out.println(output);
	
	
	
	
	
	//AABBCDEBED
	
	String string="AABBCDEBEDCF";
	
	
	for(char ch : string.toCharArray())
	{
		if (string.indexOf(ch) == string.lastIndexOf(ch)) {
			System.out.println("First Non-repeated :- "+ ch);
			break;
		}
	}
	
	
	
	
	//opentext --->open1ex2
	
	String input1="opentext";
	char search ='t';
	int count =1;
	char [] arr=input1.toCharArray();
	
	for(int i=0; i< input.length() ;i++)
	{
		if(arr[i] == search)
		{
			arr[i]=(char) count;
			count ++;
		}else {
			System.out.println("No repeating charchter found....");
		}
		
	}
	
	for(char ch :arr)
	{
		System.out.println(ch);
	}
	
	
	
	
	
	}
}
