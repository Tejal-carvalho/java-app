package com.techlab.studentcomparator;

public class Student {
	private int rollno;
	private String fname;
	private String lname;

	public Student(int rollno, String fname, String lname) {
		this.rollno = rollno;
		this.fname = fname;
		this.lname = lname;
	}

	public int getRollno() {
		return rollno;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	@Override
	public String toString() {
		return "\nrollno=" + rollno + ", fname=" + fname + ", lname=" + lname;
	}

}
