package com.techlab.hierarchical.test;

import com.techlab.hierarchical.Animal;
import com.techlab.hierarchical.Cat;
import com.techlab.hierarchical.Dog;

public class HierarchicalTest {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat("Animal");
		Dog d=new Dog("Tommy");
		d.eat("Tommy");
		d.bark();
		Cat c=new Cat("Kitty");
		c.eat("Kitty");
		c.meow();
		
		
		//instance of demo
		System.out.println("Is Dog is istance of Animal:"+ (d instanceof Animal));
		System.out.println("Is Cat is istance of Animal:"+ (c instanceof Animal));
		System.out.println("Is Dog is istance of Object:"+ (c instanceof Object));
		System.out.println("Is Cat is istance of Object:"+ (c instanceof Object));
		System.out.println("Is Animal is istance of Object:"+ (c instanceof Object));
		

	}

}
