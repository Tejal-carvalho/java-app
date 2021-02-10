package com.techlab.department;

import java.util.ArrayList;

public class Department {
	private ArrayList<Employee> employee;
	private int id;
	private String dname;
	
	public Department(int id,String dname, ArrayList<Employee> emp) {
		this.id=id;
		this.dname=dname;
		this.employee=emp;
	}
	
	public int getId() {
		return id;
	}
	public String getDname() {
		return dname;
	}
	public ArrayList<Employee> getAllEmployee() {
		return employee;
	}

}
