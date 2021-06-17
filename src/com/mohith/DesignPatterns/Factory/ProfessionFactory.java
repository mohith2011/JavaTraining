package com.mohith.DesignPatterns.Factory;

public class ProfessionFactory {
	public Profession getProfession(String name) {

		if (name == "Doctor") {
			return new Doctor();
		} else if (name == "Engineer") {
			return new Engineer();
		} else
			return null;

	}
}
