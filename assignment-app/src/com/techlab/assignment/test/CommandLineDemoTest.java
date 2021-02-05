package com.techlab.assignment.test;

public class CommandLineDemoTest {

	public static void main(String[] args) {
		sumOfNumber(args);
		
	}
	
		private static void sumOfNumber(String args[]) {
			int sum=0;
			for (int i = 0; i < args.length; i++) {
				sum=sum + Integer.parseInt(args[i]);
			}
			System.out.println("sum:"+sum);
		}
}
		

		

	
