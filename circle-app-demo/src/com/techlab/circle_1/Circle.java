package com.techlab.circle_1;

public class Circle {
	private float radius = 1;
	private String colour = "yellow";
	private float pi=3.14f;

	public float getRadius() {
		return radius;
	}

	public String getColour() {
		return colour;
	}

	public void setRadius(float newRadius) {
		if (newRadius >= 1 && newRadius <= 20)
			radius = newRadius;
	}

	public void setColour(String newColour) {
		if (newColour.equalsIgnoreCase("blue") || newColour.equalsIgnoreCase("green") || newColour.equalsIgnoreCase("black"))
			colour = newColour;
	}
	public double calArea()
	{
		return pi*radius*radius;
	}
	public double calPeri()
	{
		return 2*pi*radius;
	}
	//arr=[1,2,3,4,5,6,3,4]//temp=1
	public float findBiggestCircl(Circle[] arr) {
		
		float temp=arr[0].getRadius();
		
		
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i].getRadius()>temp)//3>2
				temp=arr[i].getRadius();//temp=3
			
		}
		return temp;
	}
	
	
	public Circle findBiggestCircle(Circle[] c_arr) {
		Circle c=null;
		float temp = c_arr[0].getRadius();
		for (int i = 1; i < c_arr.length; i++) {
			if (c_arr[i].getRadius() > temp) {
				temp = c_arr[i].getRadius();
				
				c=c_arr[i];
			}
		}
		return c;
	}
	
	
	
	
	
	
	public Circle findSmallestCircle(Circle[] c_arr) {
		float temp = c_arr[0].getRadius();
		Circle c = c_arr[0];
		for (int i = 1; i < c_arr.length; i++) {
			if (c_arr[i].getRadius() < temp) {
				temp = c_arr[i].getRadius();
				c = c_arr[i];
			}
		}
		return c;
}
}
