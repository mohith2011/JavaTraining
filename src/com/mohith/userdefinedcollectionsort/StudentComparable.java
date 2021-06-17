package com.mohith.userdefinedcollectionsort;

public class StudentComparable implements Comparable<StudentComparable> {

	int rollno;
	String name;
	int age;

	StudentComparable(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(StudentComparable o) {
		if(this.age>o.age)
			return 1;
		else
			return -1;
	}
	
	public String toString() {
		return this.rollno+" "+this.name+" "+this.age;
	}

}
