package com.techlab.assignment.test;

public class ReverseTest {

	public static void main(String[] args) {
		int num=1233456;
		int rev=0;
		int remainder;
		while (num > 0) {
			remainder = num % 10;
			rev = remainder + rev*10;
			num = num / 10;
		}
		System.out.println(rev);

	}

}
