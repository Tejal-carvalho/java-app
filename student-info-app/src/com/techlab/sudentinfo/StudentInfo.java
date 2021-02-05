package com.techlab.sudentinfo;

public class StudentInfo {
	
	public int id;
	public String name;
	//constructors 1. default
	//parameterized constructor
	public StudentInfo(int newid,String newname){
		id=newid;
		name=newname;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
}
