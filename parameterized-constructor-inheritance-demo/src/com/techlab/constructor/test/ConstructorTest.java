package com.techlab.constructor.test;

import com.techlab.constructor.Child;

public class ConstructorTest {

	public static void main(String[] args) {
		Child c1=new Child(100);
		System.out.println(c1.getValue());
		Child c2=new Child(200);
		System.out.println(c2.getValue());
		Child c3=new Child(300);
		System.out.println(c3.getValue());

	}

}
