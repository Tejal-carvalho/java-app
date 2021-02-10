package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Rectangle r1=new Rectangle(10.2f,11.2f);
		Rectangle r2=new Rectangle(10f,11f,"red");
		r1.display();
		r2.display();

	}

}
