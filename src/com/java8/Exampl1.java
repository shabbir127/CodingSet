package com.java8;

import java.util.Iterator;

public class Exampl1 {
	
	public static void main(String[] args) {
		String input="My name is Shabbir Khan";
		System.out.println(input);
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		String v1=" ";
	
		String [] word=input.split(" ");
		
		for(int i= word.length-1; i >=0; i--)
		{
			sb1.append(word[i] + " ");
			
		}
		System.out.println(sb1.toString());

		for(int i=0; i< word.length;i++)
		{
			v1= word[i] + " " +v1;
		}
		
		System.out.println(v1);
			
	
	
	}

}
