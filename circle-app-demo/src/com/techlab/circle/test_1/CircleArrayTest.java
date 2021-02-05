package com.techlab.circle.test_1;

import com.techlab.circle_1.Circle;

public class CircleArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] c_arr = new Circle[3];
		Circle c1 = new Circle();
		c1.setRadius(5);
		c1.setColour("Green");
		Circle c2 = new Circle();
		c2.setRadius(6);
		c2.setColour("BLUE");
		Circle c3 = new Circle();
		c3.setRadius(7);
		c3.setColour("red");
		c_arr[0] = c1;
		c_arr[1] = c2;
		c_arr[2] = c3;
		printCircleInfo(c_arr);
		findSmallestCircle(c_arr);
		findBiggestCircle(c_arr);
	}

	private static void findBiggestCircle(Circle[] c_arr) {
		float temp = c_arr[0].getRadius();
		for (int i = 1; i < c_arr.length; i++) {
			if (c_arr[i].getRadius() > temp) {
				temp = c_arr[i].getRadius();
			}
		}
		System.out.println("biggest circle radius" + temp);

	}

	private static void findSmallestCircle(Circle[] c_arr) {
		float temp = c_arr[0].getRadius();
		Circle c = c_arr[0];
		for (int i = 1; i < c_arr.length; i++) {
			if (c_arr[i].getRadius() < temp) {
				temp = c_arr[i].getRadius();
				c = c_arr[i];
			}
		}
		System.out.println("smallest circle radius:" + temp);
		System.out.println("smallest circle object:" + c);

	}

	private static void printCircleInfo(Circle[] c_arr) {
		for (int i = 0; i < c_arr.length; i++) {
			System.out.println("Radius" + c_arr[i].getRadius());
			System.out.println("Color:" + c_arr[i].getColour());

		}
	}

}
