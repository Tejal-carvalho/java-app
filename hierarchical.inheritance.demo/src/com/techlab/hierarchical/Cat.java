package com.techlab.hierarchical;

public class Cat extends Animal {
	private String name;
	
	public Cat(String name) {
		this.name=name;
		
	}
	public void meow() {
		System.out.println(name+" is meow meow");
	}

}
