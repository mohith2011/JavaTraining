package com.mohith.customexception;

public class Main {
	public static void main(String[] args) {
		NameValidation n=new NameValidation();
		try {
			System.out.println(n.validate("mha12"));
		} catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
