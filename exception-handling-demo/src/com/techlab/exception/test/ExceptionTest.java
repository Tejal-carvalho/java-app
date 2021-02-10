package com.techlab.exception.test;

public class ExceptionTest {

	public static void main(String[] args) {
		//ArrayIndexoutofbound,ArithmeticException,NumberformatException
		//handling exception try catch
		try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a / b;
		System.out.println("Result is" + c);
		}
		catch (Exception e) {
			// TODO: handle exception
		
		System.out.println("End of Program: ");
		}
	}

}
