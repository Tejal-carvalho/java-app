package com.techlab.studentcomparable.test;

import java.util.ArrayList;
import java.util.Collections;

import com.techlab.studentcomparable.Student;

public class SortingTest {

	public static void main(String[] args) {
		ArrayList<Student> as = new ArrayList<Student>();

		as.add(new Student(1, "abc", 21));
		as.add(new Student(2, "xyz", 22));
		as.add(new Student(3, "prq", 20));
		
		Collections.sort(as);
		
		for (Student student : as) {
			System.out.println(student.getRollno()+ " " +student.getName() + " " + student.getAge());
			
		}

	}

}
