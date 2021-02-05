package com.techlab.person.test;

import com.techlab.person.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("abc","male",1.7f,70f);
		Person p2=new Person("xyz","female",1.6f,68f);
		p1.doEat();
		p2.doWorkOut();
		printInfoPerson(p1);
		printInfoPerson(p2);
	

	}

	private static void printInfoPerson(Person p1) {
		System.out.println("name:"+p1.getName());
		System.out.println("age:"+p1.getAge());
		System.out.println("height:"+p1.getHeight());
		System.out.println("weight:"+p1.getWeight());
		System.out.println("BMI:"+p1.calculateBmiIndex());
		System.out.println();
		
	}

}
