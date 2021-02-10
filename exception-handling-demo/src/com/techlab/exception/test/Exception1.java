package com.techlab.exception.test;

public class Exception1 {

	public static void main(String[] args) throws Exception {
		m1();
		System.out.println("End of program");

	}

     static void m1() throws Exception {
		System.out.println("M1 is called");
		m2();
		
	}

     static void m2() throws Exception {
		System.out.println("m2 is called");
		m3();
		
	}

	static void m3() throws Exception {
		System.out.println("m3 is called");
		throw new Exception("There is some problem");
	}

}
