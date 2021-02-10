package com.techlab.student;

public class Student {
	// data members+member functions
	// access specifiers
	private int id;
	private String name;
	private static String collegename="sfit";
    private static int counter=0;
    
    static {
    	System.out.println("Inside static block");
    }
    public Student() {
    	System.out.println("Inside Constructor");
    	counter++;
    }
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getCounter() {
		return counter;
	}

	public void display() {
		System.out.println("id:" + id + " name:" + name +" College name:"+collegename);
	}

}
