package com.feuji.exception.December6;

public class createThreadUsingThreadClas extends Thread{

	public void run()
	{
		System.out.println("The thread is running with thread class");
	}
}

class createThreadWithRunnableInterface implements Runnable{

	@Override
	public void run() {
		System.out.println("The thread is running with help of Runnable interface");
		
	}
	
}
