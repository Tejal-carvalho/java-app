package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle ref=null;
		System.out.println(ref);
		Rectangle r1=new Rectangle();
		ref=r1;
		System.out.println(r1.hashCode());
		System.out.println(ref.hashCode());
		r1.setHeight(20);
		r1.setHeight(r1.getHeight()+1);
		r1.setWidth(r1.getWidth()+1);
		
		System.out.println(r1.getHeight());
		System.out.println(ref.getHeight());

	}

}
