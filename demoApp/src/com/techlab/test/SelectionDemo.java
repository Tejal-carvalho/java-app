package com.techlab.test;

public class SelectionDemo {

	public static void main(String[] args) {
		int n = 9;
		int a = 4, b = 0;
		if (n == 0)
			System.out.println("its Zero");
		else if (n % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		b = a > 6 ? 1 : 2;
		System.out.println(b);
		switch (a) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("wrong choice");
		}

	}

}
