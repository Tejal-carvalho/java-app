package com.techlab.assignment.test;

import java.util.Scanner;

public class ArmstrongApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r, sum = 0;
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int on = n;
		while (n > 0) {
			r = n % 10;
			sum = sum + r * r * r;
			n = n / 10;
		}
		// System.out.println(sum);
		if (sum == on)
			System.out.println("Armstrong ");
		else
			System.out.println("Not Armstrong");

	}

}
