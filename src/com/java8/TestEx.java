package com.java8;

public class TestEx {
	
	//max number in array...
	public static void maxNumber() {
        int[] Input= {3, 7, 2, 9, 5};
		
		int max=Input[0];
		for(int i=1;i<Input.length;i++)
		{
			if(Input[i] > max)
			{
				max=Input[i];
			}
			
		}
		System.out.println(max);
	}
	//reverse of string...
	public static void reverseString()
	{
		String name="ribbahs";
		char str[]=name.toCharArray();
		  int end =str.length-1;
		  int i=0;
			while(i<end) {
		  char temp;
			temp=str[i];
			str[i]=str[end];
			str[end]=temp;
			end--;
			i++;
	}
		System.out.println(str);
	}
	
	//first non repeating number..
	public static void nonRepeatingCharacter()
	{
		String str="sshhabbir";
		
		for(int i=0; i < str.length();i++)
		{
			char ch=str.charAt(i);
			if (str.indexOf(ch)==str.lastIndexOf(ch)) {
				
				System.out.println("first non repeating number:- " +ch );
				break;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		maxNumber();
		reverseString();
		nonRepeatingCharacter();
	}

}
