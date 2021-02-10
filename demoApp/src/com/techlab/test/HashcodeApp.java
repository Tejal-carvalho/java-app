package com.techlab.test;

public class HashcodeApp {

	public static void main(String[] args) {
		int x;
		x=new Integer(10);
		System.out.println(System.identityHashCode(x));
		x=new Integer(20);
		System.out.println(System.identityHashCode(x));
	}

}
