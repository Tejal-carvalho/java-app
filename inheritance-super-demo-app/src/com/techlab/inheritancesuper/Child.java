package com.techlab.inheritancesuper;

public class Child extends Parent {
	int i=6;
	public void display() {
		System.out.println(super.i);
		super.display();
		System.out.println("inside child class");
	}

}
