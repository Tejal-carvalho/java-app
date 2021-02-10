package com.techlab.student;

public class Student {
	private int id;
	private String name;
	private double cgpa;
	private Branch branch;

	public Student(int id, String name, double cgpa, Branch branch) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}
	public Branch getBranch() {
		return branch;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (id == s.id && name.contentEquals(s.name)) {
			return true;
		} else {
			return false;

		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + ", branch="+ branch + "]";
	}
}
