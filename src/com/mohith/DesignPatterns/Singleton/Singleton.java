package com.mohith.DesignPatterns.Singleton;

public class Singleton {

	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	private static Singleton singletonObject=new Singleton();
	
	public static Singleton getInstance() {
		return singletonObject;
	}
	public void showMessage() {
		System.out.println("Printing from Singleton class");
	}
}
