package com.mohith.userdefinedcollectionsort;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentComparator> {
	int rollno;
	String name;
	int age;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	StudentComparator(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return this.rollno + " " + this.name + " " + this.age;
	}

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		if (o1.rollno > o2.rollno)
			return 1;
		else
			return -1;
	}
}
