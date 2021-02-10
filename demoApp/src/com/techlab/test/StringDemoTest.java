package com.techlab.test;

public class StringDemoTest {

	public static void main(String[] args) {
		// Primitive and non primitive
		String name="hello world";
		System.out.println(name);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		//concate
		name=name.concat(" I am learning java");
		System.out.println(name);
		System.out.println(name.indexOf('e'));
		System.out.println(name.replace('l','L'));

	}

}
