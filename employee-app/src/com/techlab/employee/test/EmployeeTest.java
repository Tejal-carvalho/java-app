package com.techlab.employee.test;

import com.techlab.employee.Programmer;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p=new Programmer(1,"abc",50000,10000);
		System.out.println("ID of programmer:"+p.getId());
		System.out.println("Name of programmer:"+p.getName());
		System.out.println("Salary of programmer:"+p.getSalary());
		System.out.println("Bonus of programmer:"+p.getBonus());

	}

}
