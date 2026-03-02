package com.java8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadEX {

	public static void main(String[] args) throws Exception, ExecutionException {
		
//		for(int i=0 ; i < 10 ;i++)
//		{
//			Thread t1=new Thread(new Task(i));
//			t1.start();
//		}
		
	//	ExecutorService executor=Executors.newFixedThreadPool(3);
//		for(int i=1 ; i <= 10 ;i++)
//		{
//			executor.execute(new Task(i));
//		}
//		
//		executor.shutdown();
		
//		ScheduledExecutorService executor =
//                Executors.newScheduledThreadPool(3);
//
//       executor.scheduleAtFixedRate(new Task(5), 3, 1, TimeUnit.SECONDS);
		
		
		ExecutorService exector=Executors.newFixedThreadPool(3);
		System.out.println("Starting");
		Future<Integer> sum=exector.submit(new Sum(10));
		Future<Double> SquareRoot=exector.submit(new SquareRoot(16));
		Future<Integer> Factorail=exector.submit(new Factorial(5));
		
		System.out.println(sum.get());
		System.out.println(SquareRoot.get());
		System.out.println(Factorail.get());
		
		exector.shutdown();
		System.out.println("Completed....");
       
       
		
	}
}



//class Task implements Runnable{
//	
//	private int taskId;
//	
//	public Task(int taskId)
//	{
//		this.taskId=taskId;
//	}
//	
//	public void run()
//	{
//		System.out.println("Task "  +taskId + " is running on threads: " +
//	                            Thread.currentThread().getName());
//	} }




class Sum implements Callable<Integer>{
	
	int stop;
	int sum=0;
	
	Sum(int v)
	{
		this.stop=v;
	}
	
	public Integer call() throws Exception
	{
		
		for(int i=1;i<=stop;i++)
		{
			sum+=i;
		}
		return sum;
	}
}

class SquareRoot implements Callable<Double>{
	
	
	double square;
	
	public SquareRoot(double square) {
		this.square=square;
	}
	
	public Double call() throws Exception
	{
    	return Math.sqrt(square);
	}
}

class Factorial implements Callable<Integer>{
	
	
	int stop;
	
	public Factorial(int stop) {
		this.stop=stop;
	}
	
	public Integer call() throws Exception
	{
    	int fact=1;
    	for(int i=1;i<=stop;i++)
		{
    		fact *=i;
		}
    	
		return fact;
	}
}




