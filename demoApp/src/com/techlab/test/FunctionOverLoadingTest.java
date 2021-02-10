package com.techlab.test;

public class FunctionOverLoadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4,b=7,c=6;
		System.out.println("Addition of two numbers:"+add(a,b));
		System.out.println("Addition of three numbers:"+add(a,b,c));

	}

	private static int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	private static int add(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}
}
