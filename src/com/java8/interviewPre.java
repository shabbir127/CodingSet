package com.java8;

public class interviewPre {

	public static void main(String[] args) {
		functionalinter ex=()->{System.out.println();};
		ex.display();
		
		FunctionalInterfaceEx1 ex1=(a,b)->{System.out.println();};
		ex1.sum(23, 34);
	}
}

@FunctionalInterface
interface functionalinter
{
	public void display();
	
}

@FunctionalInterface
interface FunctionalInterfaceEx1
{
	public void sum(int a,int b);
}