package com.techlab.triangle.test;

import com.techlab.triangle.Triangle;

public class TriangleTest {

	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.a=10;
		t.b=12;
		t.c=10;
		t.h=12;
		t.calculate();
		t.display();

	}

}
