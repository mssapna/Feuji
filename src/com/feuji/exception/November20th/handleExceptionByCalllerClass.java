package com.feuji.exception.November20th;

public class handleExceptionByCalllerClass {

	void handleException() 
	{
		
		int [] arrayValue1=new int[] {1,2,3,4};
		System.out.println(arrayValue1[9]);
		
	}
	public static void main(String[] args)  {
		exceptionCallerClass callerClass=new exceptionCallerClass();
		callerClass.handleException1();
	}
}
	class exceptionCallerClass
	{
		
		void handleException1() 
		{
			handleExceptionByCalllerClass byCalllerMethod=new handleExceptionByCalllerClass();
			
			try {
			
				byCalllerMethod.handleException();
			}
			catch (Exception e) {
				System.out.println("handled in calling method");
			}
			
			
		}
		
		
	
}
