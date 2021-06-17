package com.mohith.java8Features.FunctionalInterface;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		FunctionalInterfaceDemo functionalInterfaceDemo = Test::add;
		functionalInterfaceDemo.singleAbsMethod(5, 5);

		FunctionalInterfaceDemo functionalInterfaceDemo2 = (a, b) -> System.out.println(a + b);
		functionalInterfaceDemo2.singleAbsMethod(2, 2);
	}

	public static class Test {
		public static void add(int a, int b) {
			System.out.println(a + b);
		}
	}

}
