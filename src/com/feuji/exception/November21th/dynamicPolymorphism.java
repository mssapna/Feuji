package com.feuji.exception.November21th;

class Players {
	void numberOfPlayers(int a) {
		String Player1 = "shreya";
		String Player2 = "rani";
		System.out.println("we are the players of india team:" + Player1 + " and " + Player2);
	}
}

public class dynamicPolymorphism extends Players {
	void numberOfPlayers() {
		String Player1 = "uma";
		String Player2 = "behen";
		System.out.println("we are the players of india team:" + Player1 + "and " + Player2);

	}

	public static void main(String[] args) {
		dynamicPolymorphism dynamicPolymorphism = new dynamicPolymorphism();
		dynamicPolymorphism.numberOfPlayers();
		// dynamicPolymorphism.numberOfPlayers1(0);
	}
}
