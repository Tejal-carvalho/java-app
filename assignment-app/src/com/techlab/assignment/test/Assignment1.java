package com.techlab.assignment.test;

public class Assignment1 {

	public static void main(String[] args) {
		int x = 3, y = 5, z = 10;
		int r1 = ++z + y - y + z + x;
		System.out.println("Result case 1:" + r1);
		int r2 = ++z + y - y + z + x++;
		System.out.println("Result case 2:" + r2);
		int r3 = ++z + y - y + z + ++x;
		System.out.println("Result case 3:" + r3);
		int r4 = ++z + ++y - y + z + ++x;
		System.out.println("Result case 4:" + r4);
		int r5 = ++z + ++y - y + z + ++x;
		System.out.println("Result case 5:" + r5);
		int r6 = ++z + ++y - y++ + z + ++x;
		System.out.println("Result case 6:" + r6);
		int r7 = --z + y + y-- + z;
		System.out.println("Result case 7:" + r7);
		int r8 = --z + y + y-- + z + x--;
		System.out.println("Result case 8:" + r8);

	}

}
