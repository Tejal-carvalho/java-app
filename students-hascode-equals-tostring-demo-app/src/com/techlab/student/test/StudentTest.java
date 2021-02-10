package com.techlab.student.test;

import com.techlab.student.Branch;
import com.techlab.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student(101,"abc",7.56,Branch.COMP);
		Student s2=new Student(102,"xyz",9.56,Branch.IT);
		Student s3=new Student(101,"abc",8.56,Branch.EXTC);
		s3=s1;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s1==s3);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		

	}

}
