package com.java8;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadEX {

	public static void main(String[] args) {
		
//		for(int i=0 ; i < 10 ;i++)
//		{
//			Thread t1=new Thread(new Task(i));
//			t1.start();
//		}
		
		ExecutorService executor=Executors.newFixedThreadPool(3);
		for(int i=1 ; i <= 10 ;i++)
		{
			executor.execute(new Task(i));
		}
		
		executor.shutdown();
		
	}
}



class Task implements Runnable{
	
	private int taskId;
	
	public Task(int taskId)
	{
		this.taskId=taskId;
	}
	
	public void run()
	{
		System.out.println("Task "  +taskId + " is running on threads: " +
	                            Thread.currentThread().getName());
	}
}