package com.feuji.exception.November20th;

public class handleExceptionByCalllerMethod {

	void handleException() throws Exception
	{
		
		int [] arrayValue1=new int[] {1,2,3,4};
		System.out.println(arrayValue1[9]);
		
	}
	
	
	void handleException2()
	{
		try {
			handleException();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("hgg");
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		handleExceptionByCalllerMethod byCalllerMethod=new handleExceptionByCalllerMethod();
		byCalllerMethod.handleException();
		//byCalllerMethod.handleException2();
	}
}
