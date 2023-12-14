package com.feuji.exception.December6;

public class threadFunctionsDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++)
		{
			
			try {
				System.out.println("demo of Yield Method");
			Thread.sleep(3000);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	void run1()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("i'm showing the feature of yield method");
			Thread.yield();
		}
	}
	
	

}
