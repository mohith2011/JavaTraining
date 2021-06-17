package com.mohith.customexception;

public class NameValidation {

	public Boolean validate(String name) throws InvalidNameException {
		if(name.matches(".*[0-9]+")) {
			throw new InvalidNameException("Name contains Intiger");
		}else
			return true;
	}
}
