package com.techlab.hierarchical;

public class Dog extends Animal{
private String name;
	
	public Dog(String name) {
		this.name=name;
		
	}
	public void bark() {
		System.out.println(name+" is Barking");
	}


}
