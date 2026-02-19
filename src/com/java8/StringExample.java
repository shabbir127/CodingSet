package com.java8;

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
	}

}
