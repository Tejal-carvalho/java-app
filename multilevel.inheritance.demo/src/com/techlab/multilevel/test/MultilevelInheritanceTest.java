package com.techlab.multilevel.test;

import com.techlab.multilevel.Animal;
import com.techlab.multilevel.BabyDog;
import com.techlab.multilevel.Dog;

public class MultilevelInheritanceTest {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		System.out.println("Calling through Dog object:");
		Dog d = new Dog();
		d.eat();
		d.bark();
		System.out.println("Calling through BabyDog object:");
		BabyDog b = new BabyDog();
		b.eat();
		b.bark();
		b.weep();

	}

}
