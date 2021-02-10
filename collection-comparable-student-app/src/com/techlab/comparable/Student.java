package com.techlab.comparable;

public class Student implements Comparable<Student> {
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
		return "\nrollno=" + rollno + ", fname=" + fname + ", lname=" + lname ;
	}


	@Override
	public int compareTo(Student o) {
		if(rollno==o.rollno)
			return 0;
		else if(rollno>o.rollno)
			return 1;
		else
			return -1;
	}

}
