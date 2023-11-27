package com.feuji.exception.November21th;

class child3 {
	void pattern() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

public class dataBinding extends child3 {
	void pattern() {
		super.pattern();
		System.out.println("im method of main class");
	}

	public static void main(String[] args) {
//	child3 child3=new  child3();
//	child3.pattern();

		dataBinding binding = new dataBinding();
		binding.pattern();

	}
}
