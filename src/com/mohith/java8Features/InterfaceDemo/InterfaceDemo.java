package com.mohith.java8Features.InterfaceDemo;

public interface InterfaceDemo {

	void absMethod();
	default void print() {
		System.out.println("Default method Printing");
	}
}
