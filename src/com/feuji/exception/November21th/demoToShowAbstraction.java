package com.feuji.exception.November21th;


public abstract class demoToShowAbstraction {

	abstract void Vehicle();

}

class Car extends demoToShowAbstraction{

	@Override
	void Vehicle()
	{
		System.out.println("I have all properties of Vehicle");
	}
}
//mainclass