package com.techlab.circle.test_1;

import com.techlab.circle_1.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(5);
		c.setColour("green");
		System.out.println("radius:"+c.getRadius());
		System.out.println("colour:"+c.getColour());
		System.out.println("Area of circle:"+c.calArea());
		System.out.println("Area of circle:"+c.calPeri());
		

	}

}
