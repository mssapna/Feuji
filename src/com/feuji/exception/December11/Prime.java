package com.feuji.exception.December11;

public class Prime {
public static void main(String[] args) {
	int n1=76;
	int n2=89;
	int n3=13;
	System.out.println(isPrime(n1)?"Prime Number":"Not Prime Number");
	System.out.println(isPrime(n2)?"Prime Number":"Not Prime Number");
	System.out.println(isPrime(n3)?"Prime Number":"Not Prime Number");
}

private static boolean isPrime(int n) {
	if(n<=1) {
	return false;
	}
	for(int i=2;i<=n/2;i++) {
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
}
}
