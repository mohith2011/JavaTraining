package com.mohith.customexception;

@SuppressWarnings("serial")
public class InvalidNameException extends Exception{

	InvalidNameException(String name){
		super(name);
	}
}
