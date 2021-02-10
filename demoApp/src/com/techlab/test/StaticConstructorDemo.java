package com.techlab.test;

public class StaticConstructorDemo {
static {
	int a=3*3*3;
	System.out.println("Cube is:"+a);
}
public static void main(String args[]) {
	System.out.println("Hello main");
}
}
