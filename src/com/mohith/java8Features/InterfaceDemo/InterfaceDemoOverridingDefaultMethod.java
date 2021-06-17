package com.mohith.java8Features.InterfaceDemo;

public class InterfaceDemoOverridingDefaultMethod implements InterfaceDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemoOverridingDefaultMethod overridingDefaultMethod=new InterfaceDemoOverridingDefaultMethod();
		overridingDefaultMethod.print();

	}

	@Override
	public void absMethod() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print() {
		System.out.println("Default method Printing After Overriding");
	} 

}
