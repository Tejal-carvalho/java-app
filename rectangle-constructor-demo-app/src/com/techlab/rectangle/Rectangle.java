package com.techlab.rectangle;

public class Rectangle {
	private float width;
	private float height;
	private String color;
	//constructor, constructor overloading, this keyword
	//constructor chaining
	public Rectangle()
	{
		System.out.println("inside constructor");
	}
    public Rectangle(float width,float height) {
    	this.width=width;
    	this.height=height;
    }
    public Rectangle(float width,float height,String color ) {
    	this(width,height);
    	this.color=color;
    }
    //getWidth,getHeight,getColor
    public void display() {
    	System.out.println("Width:"+width+" Height:"+height+" Color:"+color);
    }
}
