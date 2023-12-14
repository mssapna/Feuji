package com.feuji.exception.November28th;

import java.util.ArrayList;

public class genericClass<T> implements genericInterface<T> {

	@Override
	public <T> void generalAdd() {
		ArrayList<T> list = new ArrayList<T>();
		list.add((T) Integer.valueOf(42));
		list.add((T) Integer.valueOf(1));
		list.add((T) Integer.valueOf(2));
		list.add((T) Integer.valueOf(4));
		list.add((T) Integer.valueOf(12));
		for (T t : list) {
			System.out.println(t);
		}
	}

	public <T> void generalAdd1(T value) {
		ArrayList<T> list = new ArrayList<T>();
		list.add(value);
		for (T t : list) {
			System.out.println(t);
			
		}
	}

	public static void main(String[] args) {
		genericClass<Integer> genericClass = new genericClass<>();
		genericClass.<Integer>generalAdd();
		genericClass.<Integer>generalAdd1(10);
	}
}
