package com.feuji.exceptionHandling17thNovember;

public class exceptionDemoUsingTryCatchBlock {
void arithmethicOperation()
{
	try {
	int a=10/0;
	System.out.println(a);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("handled");
	}
	finally {
		System.out.println("So sorry for incoveinince");
	}
}
public static void main(String[] args) {
	exceptionDemoUsingTryCatchBlock block=new exceptionDemoUsingTryCatchBlock();
	block.arithmethicOperation();
}
}
