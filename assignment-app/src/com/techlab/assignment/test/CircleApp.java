package com.techlab.assignment.test;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r;
		final float pi = 3.14f;
		System.out.println("Enter Radius");
		r = sc.nextInt();
		float area = pi * r * r;
		float peri = 2 * pi * r;
		System.out.println("Area of circle:" + area);
		System.out.println("Perimeter of circle:" + peri);

	}

}
