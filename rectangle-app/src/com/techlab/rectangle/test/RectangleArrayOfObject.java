package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleArrayOfObject {

	public static void main(String[] args) {
		Rectangle[] r=new Rectangle[3];
		
		Rectangle r1=new Rectangle();
		r1.setHeight(10.2f);
		r1.setWidth(10.2f);
		
		Rectangle r2=new Rectangle();
		r2.setHeight(11.2f);
		r2.setWidth(11.2f);
		
		r[0]=r1;
		r[1]=r2;
		r[2]=new Rectangle();
		r[2].setHeight(12.2f);
		r[2].setWidth(12.2f);
		printRectangleInfo(r);

	}
	public static void printRectangleInfo(Rectangle[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Height:"+arr[i].getHeight());
			System.out.println("Width"+arr[i].getWidth());
			
		}
	}
	

}
