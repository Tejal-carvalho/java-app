package com.techlab.circle.test_1;

import com.techlab.circle_1.Circle;

public class CircleTest1 {

	public static void main(String[] args) {
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
		
		
		
		
		Circle c=c1.findBiggestCircle(c_arr);
		System.out.println("biggest circle object:" + c.getRadius()+"color:"+c.getColour());
		
		
		
		
		
		
		c=c1.findSmallestCircle(c_arr);
		System.out.println("smallest circle object:" + c.getRadius());

	}

}
