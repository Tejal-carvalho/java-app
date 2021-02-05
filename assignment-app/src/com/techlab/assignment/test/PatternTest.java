package com.techlab.assignment.test;

public class PatternTest {

	public static void main(String[] args) {
		System.out.println("First pattern:");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print('1');
			}
			System.out.println();
		}
		System.out.println("Second pattern:");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
