package com.boso.creational.singleton;

public class SingletonObject {

	private static SingletonObject INSTANCE = new SingletonObject();

	public static SingletonObject getInstance() {
		return INSTANCE;
	}

	public String showMessage() {
		return "Hello World!";
	}
}