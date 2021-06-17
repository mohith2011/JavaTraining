package com.mohith.DesignPatterns.Prototype;

public class PrototypeMainClass {

	public static void main(String[] args) {
		ProfessionCache.loadProfessionCache();
		
		Profession p1=ProfessionCache.getCloneNewProfession(1);
		p1.print();
		System.out.println(p1);
		Profession p2=ProfessionCache.getCloneNewProfession(2);
		p2.print();
		System.out.println(p2);
		Profession p3=ProfessionCache.getCloneNewProfession(1);
		p3.print();
		System.out.println(p3);

	}

}
