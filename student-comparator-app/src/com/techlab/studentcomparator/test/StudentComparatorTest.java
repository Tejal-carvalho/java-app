package com.techlab.studentcomparator.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.techlab.studentcomparator.Student;
import com.techlab.studentcomparator.RollNoSorter;

public class StudentComparatorTest {
	public static void main(String args[]) {

	ArrayList<Student> students = new ArrayList<Student>();
	students.add(new Student(4, "abc", "ab"));
	students.add(new Student(3, "xyz", "xy"));
	students.add(new Student(2, "pqr", "pq"));
	System.out.println("Before Sorting"+students);
	Collections.sort(students, new RollNoSorter());
	System.out.println("After Sorting"+students);

}
}
