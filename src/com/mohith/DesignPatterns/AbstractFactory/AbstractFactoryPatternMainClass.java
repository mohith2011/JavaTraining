package com.mohith.DesignPatterns.AbstractFactory;

public class AbstractFactoryPatternMainClass {

	public static void main(String[] args) {

		AbstractFactory abstractFactory = AbstractFactoryProducer.getFactory(true);
		abstractFactory.getProfession("Doctor").print();

	}

}
