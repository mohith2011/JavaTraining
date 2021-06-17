package com.mohith.DesignPatterns.AbstractFactory;

public class AbstractFactoryProducer {
	
	public static AbstractFactory getFactory(Boolean b) {
		if(b) {
			return new TraineeProfessionFactory();
		}else {
			return new ProfessionFactory();
		}
	}

}
