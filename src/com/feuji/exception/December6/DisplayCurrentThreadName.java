package com.feuji.exception.December6;

public class DisplayCurrentThreadName extends Thread {
public void run()
{
	System.out.println(Thread.currentThread().getName());
}
}
