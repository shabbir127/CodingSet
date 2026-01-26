package com.java8;

public class FunctionalInterfaceEX {
	
	public static void main(String[] args) {
		
		
		MyInter inter= ()-> System.out.println("hello");
	
		inter.m1();
		
		MyInter inter1= ()-> System.out.println("Second Lambda");
		inter1.m1();
	}

}

@FunctionalInterface
interface MyInter{
	
	public void m1();
}

