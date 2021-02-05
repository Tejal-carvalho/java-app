package com.techlab.assignment.test;

public class EvenNumberTest {

	public static void main(String[] args) {
		int n = 40;
		System.out.println("Using for");
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(" "+ i);
			}
		}
		System.out.println();
		System.out.println("Using while");
		int j=1;
		while(j<=40) {
			if (j % 2 == 0) 
				System.out.print(" "+ j);
				j++;
			}
			
			
}
		

	}


