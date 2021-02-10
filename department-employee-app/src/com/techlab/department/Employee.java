package com.techlab.department;

public class Employee {
	private int id;
	private String ename;
	private String designation;

	public Employee(int id, String ename, String designation) {
		this.id = id;
		this.ename = ename;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public String getEname() {
		return ename;
	}

	public String getDesignation() {
		return designation;
	}

}
