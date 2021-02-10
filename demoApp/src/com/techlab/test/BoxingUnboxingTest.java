package com.techlab.test;

public class BoxingUnboxingTest {

	public static void main(String[] args) {
		implicitTypecast();
		explicitTypecast();
		boxingAutoboxing();
		unboxingAutounboxing();

	}

	private static void implicitTypecast() {
		System.out.println("Implicit type cast");
		int x = 100;
		double z = x;
		System.out.println("Interger:" + x);
		System.out.println("Double:" + z);

	}

	private static void explicitTypecast() {
		System.out.println("Explicit type casting");
		double z = 100.0;
		int x = (int) z;
		System.out.println("Double:" + z);
		System.out.println("Interger:" + x);

	}

	private static void boxingAutoboxing() {
		System.out.println("Boxing and AutoBoxing");
		int a = 10;
		Integer b = new Integer(a);
		Integer c = 5;
		System.out.println("Boxing:" + b);
		System.out.println("AutoBoxing:" + c);
		//int d = new Integer(a);
		///System.out.println("D:" + b);
		

	}

	private static void unboxingAutounboxing() {
		System.out.println("unboxing and AutounBoxing");
		Integer a=new Integer(10);
		int b=a.intValue();
		int e=b;
		System.out.println("Unboxing"+b);
		System.out.println("Auto Unboxing"+e);

	}

}
