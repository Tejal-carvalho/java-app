package com.techlab.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeFilterTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee no:");
		String empNo = sc.nextLine();
		Connection connection = null;
		try {
			// 2.load and register driver
			Class.forName("com.mysql.jdbc.Driver");
			// 3. Establish a connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav techlab", "root", "root");
			// 4. create the statement
			java.sql.Statement stmt = connection.createStatement();
			// 5. Execute the query
			ResultSet rs = stmt.executeQuery("select * from employee where empno=" + empNo);
			// 6. process the result
			while (rs.next())
				System.out.println("empno:" + rs.getInt(1) + " empname:" + rs.getString(2) + " job:" + rs.getString(3)
						+ " MGR:" + rs.getString(4) + " HireDate:" + rs.getDate(5) + " salary:" + rs.getInt(6) + " com:"
						+ rs.getInt(7) + " deptno:" + rs.getInt(8));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

	}

}
