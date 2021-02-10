package com.techlab.jdbc.demo;
import java.sql.*;
public class UpdateTest {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		java.sql.Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav techlab","root","root");
			System.out.println("Before update operation:");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from intern");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("lang"));
			}
			
			System.out.println("After update operation:");
			stmt.executeUpdate("update intern set id=102 where name=\"xyz\";");
			stmt.executeUpdate("update intern set id=103 where name=\"pqr\";");
			stmt.executeUpdate("update intern set id=104 where name=\"qwe\";");
			rs=stmt.executeQuery("select * from intern");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("lang"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			con.close();
		}

	}

}
