package com.mohith.shadowing;

public class OverridingStaticMethodsDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p= new Child();
		//Method overridng will not happen due to static methods
		p.feature();

	}

}
