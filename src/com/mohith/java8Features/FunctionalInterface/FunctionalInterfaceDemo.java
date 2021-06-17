package com.mohith.java8Features.FunctionalInterface;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	void singleAbsMethod(int a,int b);
	
	
	default void defaultMethod1() {
		System.out.println("Default method 1");
	}
	
	static int defaultMethod2() {
		return 0;
	}
}
