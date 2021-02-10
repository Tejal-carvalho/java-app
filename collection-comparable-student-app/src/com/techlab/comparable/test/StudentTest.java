package com.techlab.comparable.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import com.techlab.comparable.Student;

public class StudentTest {

	public static void main(String[] args) {
		LinkedList<Student> al = new LinkedList<Student>();
		al.add(new Student(4, "abc", "ab"));
		al.add(new Student(3, "xyz", "xy"));
		al.add(new Student(2, "pqr", "pq"));
		System.out.println("Before sorting:" + al);
		Collections.sort(al);
		System.out.println("After sorting:" + al);
	}

}
