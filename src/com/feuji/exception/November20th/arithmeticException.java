package com.feuji.exception.November20th;



public class arithmeticException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1216271651340829803L;
	private String message;

	public arithmeticException(String message)
	{
		super(message);
		this.message=message;
	}
	
	public String toString()
	{
		return "you are occured with an error";
	}

	

	
}
