package com.techlab.triangle;

public class Triangle {

	public float a,b,c,h;
	double area,peri;
	public void calculate()
	{
		area=0.5*b*h;
		peri=a+b+c;
	}
	public void display()
	{
		System.out.println("Area of traingle:"+area);
		System.out.println("Perimeter of traingle:"+peri);
	}
	
}
