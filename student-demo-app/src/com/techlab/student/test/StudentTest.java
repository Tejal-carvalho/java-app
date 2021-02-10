package com.techlab.student.test;

import com.techlab.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println(s.getCounter());
		s.setId(1);
		s.setName("abc");
		//s.display();
		
		Student s1 = new Student();
		System.out.println(s1.getCounter());
		s1.setId(2);
		s1.setName("abcd");
		//s1.display();
		Student s2 = new Student();
		System.out.println(s2.getCounter());
		System.out.println(s1);
		System.out.println(new Student());
		Student s3=null;
		System.out.println(s3);
		System.out.println(s1.hashCode());


	}

}
