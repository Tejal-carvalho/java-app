package com.techlab.test;

public class FunctionOverLoadingTest1 {

	public static void main(String[] args) {
		int a=10;
		double b=56.6;
		float c=3.24f;
		boolean d=true;
		String s="Hello World";
		printInfo(a);
		printInfo(b);
		printInfo(c);
		printInfo(d);
		printInfo(s);
	}
	private static void printInfo(int a) {
		System.out.println("Interger value is:"+a);
	}
	private static void printInfo(double b) {
		System.out.println("Double value is:"+b);
	}
	private static void printInfo(float c) {
		System.out.println("Float value is:"+c);
	}
	private static void printInfo(boolean d) {
		System.out.println("Boolean value is:"+d);
	}
	private static void printInfo(String s) {
		System.out.println("String value is:"+s);
	}
}
