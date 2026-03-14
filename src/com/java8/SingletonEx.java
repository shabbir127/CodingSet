package com.java8;

public class SingletonEx {


	private static SingletonEx instance;
	
	private SingletonEx()
	{
		
	}
	
	public static SingletonEx getInstance()
	{
		if(instance ==null)
		{
			instance=new SingletonEx();
		}
		
		return instance;
	}
	public static void main(String[] args) {
		 SingletonEx ex=new SingletonEx();
		 System.out.println(ex);
		 SingletonEx ex1=new SingletonEx();
		 System.out.println(ex1);
	}
}
