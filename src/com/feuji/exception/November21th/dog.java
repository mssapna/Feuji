package com.feuji.exception.November21th;

public class dog extends animal {
	void dogNoise()
	{
		System.out.println("making noise as bow bow");
	}
	
	public static void main(String[] args) {
		dog dog=new dog();
		dog.generalNoise();
		dog.dogNoise();
	}
	
	
}
