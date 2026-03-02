package com.java8;

public class ThreadEX {

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