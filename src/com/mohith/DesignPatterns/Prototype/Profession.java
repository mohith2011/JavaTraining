package com.mohith.DesignPatterns.Prototype;

public abstract class Profession implements Cloneable {
	public int id;

	abstract void print();

	public  Object cloneMethod() {
		Object clone=null;
		try {
			clone=super.clone();
		}catch (CloneNotSupportedException e) {
		e.printStackTrace();
		}
		return clone;
	}
}
