package com.techlab.test;

public class CommandLineDemoTest {

	public static void main(String[] args) {

		evenOdd(args);
		
	}
	private static void evenOdd(String[] args) {
		for(int i = 0; i < args.length; i++) {
			if (Integer.parseInt(args[i]) % 2 == 0) {
				System.out.println("Even number:" + args[i]);
			} else
				System.out.println("odd number:" + args[i]);

		}
		
	}
}

	




	
	// addition of two numbers
	/*
	 * int a, b, add; a = Integer.parseInt(args[0]); b = Integer.parseInt(args[1]);
	 * add = a + b; System.out.println("Addition is:" + add);
	 * 
	 * //int sum = 0; for (int i = 0; i < args.length; i++) { sum = sum +
	 * Integer.parseInt(args[i]); } System.out.println("sum is:"+sum);
	 */