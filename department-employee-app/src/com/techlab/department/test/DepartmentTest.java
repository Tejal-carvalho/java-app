package com.techlab.department.test;

import java.util.ArrayList;


import com.techlab.department.Department;
import com.techlab.department.Employee;

public class DepartmentTest {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1, "abc", "manager"));
		emp.add(new Employee(2, "aaa", "clerk"));
		Department sale = new Department(1, "Sales", emp);
		
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add (new Employee(1, "xyz", "Assistant manager"));
		emps.add( new Employee(2, "pqr", "Supervisor"));
		emps.add( new Employee(3, "qwe", "clerk"));
		Department account = new Department(1, "Account", emps);
		
		printInfo(sale);
		printInfo(account);
	}

	private static void printInfo(Department department) {
		System.out.println("Id:" + department.getId());
		System.out.println("Department name:" + department.getDname());
		ArrayList<Employee> employees = department.getAllEmployee();
		for (Employee employee : employees) {
			System.out.println("Id: " + employee.getId() + " Employee name: " + employee.getEname() + " Designation: "
					+ employee.getDesignation());

		}

	}

}
