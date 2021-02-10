package com.techlab.jdbc.demo;

import java.sql.*;

public class InsertionTest {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		java.sql.Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav techlab","root","root");
			stmt=con.createStatement();
			stmt.executeUpdate("insert into intern(id,name,lang)" + "values(5,\"lmn\",\"java\");");
			rs=stmt.executeQuery("select * from intern");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+ " " + rs.getString("lang"));
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		finally {
			con.close();
		}
		}
		

	}


