package com.mohith.java8Features.InterfaceDemo;

public class DiamondProblemClass implements DiamondProblemInterface1,DiamondProblemInterface2{

	public static void main(String[] args) {
		DiamondProblemClass diamondProblemClass=new DiamondProblemClass();
		diamondProblemClass.m1();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		DiamondProblemInterface2.super.m1();
	}

}
