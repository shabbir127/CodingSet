package com.java8;

public class interviewPre {

	public static void main(String[] args) {
		functionalinter ex=()->{System.out.println("Hello, Functional Interface...");};
		ex.display();
		
		FunctionalInterfaceEx1 ex1=(a,b)->{System.out.println("Sum:- "+ (a+b));};
		ex1.sum(23, 34);
		
		FunctionalInterfaceEx2 ex2=(a,b)->{ System.out.print("Mul:- ");
			return a*b; };
		System.out.print(ex2.mul(23, 34));
		
		
		
		
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

@FunctionalInterface
interface FunctionalInterfaceEx2
{
	public int mul(int a,int b);
}