package com.java8;


public class Exampl1 {
	
	public static void main(String[] args) {
		String input="My name is Shabbir Khan";
		System.out.println(input);
		StringBuilder sb1=new StringBuilder();
		String v1=" ";
	
		String [] words=input.split(" ");
		
		for(int i= words.length-1; i >=0; i--)
		{
			sb1.append(words[i] + " ");
			
		}
		System.out.println(sb1.toString());

		for(int i=0; i< words.length;i++)
		{
			v1= words[i] + " " +v1;
		}
		
		System.out.println(v1);
			
	
	// input :- java code 
	// output:- avaj edoc
		
		for( String word : words)
		{
			for(int i= word.length()-1 ;i>=0;i--)
			{
				System.out.println("hello");
			}
		}
	}

}
