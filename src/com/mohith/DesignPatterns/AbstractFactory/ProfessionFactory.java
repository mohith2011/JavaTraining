package com.mohith.DesignPatterns.AbstractFactory;

public class ProfessionFactory extends AbstractFactory {
	public Profession getProfession(String name) {

		if (name == "Doctor") {
			return new Doctor();
		} else if (name == "Engineer") {
			return new Engineer();
		} else
			return null;

	}
}
