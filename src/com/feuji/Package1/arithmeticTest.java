package com.feuji.Package1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class arithmeticTest {

	@Test
public void add()
	{
		arithmeticOperation arithmeticOperation=new arithmeticOperation();
		assertEquals(30,arithmeticOperation.add());
	}
}
