package com.mohith.DesignPatterns.Factory;

public class FactoryPatternMainClass {

	public static void main(String[] args) {
		ProfessionFactory professionFactory=new ProfessionFactory();
		Profession profession=professionFactory.getProfession("Doctor");
		profession.print();

	}

}
