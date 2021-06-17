package com.mohith.userdefinedcollectionsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<StudentComparable> sc=new ArrayList<StudentComparable>();
		sc.add(new StudentComparable(25, "Yo", 50));
		sc.add(new StudentComparable(30, "Yoa", 60));
		sc.add(new StudentComparable(100, "Yob", 59));
		sc.add(new StudentComparable(50, "Yoc", 30));
		Collections.sort(sc);
		
		sc.forEach(i->System.out.println(i.toString()));
		
		System.out.println("sorting using comparator");
		ArrayList<StudentComparator> sc2=new ArrayList<StudentComparator>();
		sc2.add(new StudentComparator(25, "Yo", 50));
		sc2.add(new StudentComparator(30, "Yoa", 60));
		sc2.add(new StudentComparator(100, "Yob", 59));
		
		sc2.add(new StudentComparator(50, "Yoc", 30));
		
		//String Comparator
		//Comparator<StudentComparator> stuCom=(StudentComparator o1,StudentComparator o2)->o1.name.compareTo(o2.name);
		//Integer comparator
		Comparator<StudentComparator> cm2=Comparator.comparing(StudentComparator::getRollno);  
		Collections.sort(sc2, cm2);
		sc2.forEach(i->System.out.println(i.toString()));
	}

}
