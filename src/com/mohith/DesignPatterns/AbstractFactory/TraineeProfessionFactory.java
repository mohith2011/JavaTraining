package com.mohith.DesignPatterns.AbstractFactory;

public class TraineeProfessionFactory extends AbstractFactory {
	public Profession getProfession(String name) {

		if (name == "Doctor") {
			return new TraineeDoctor();
		} else if (name == "Engineer") {
			return new TraineeEngineer();
		} else
			return null;

	}
}
