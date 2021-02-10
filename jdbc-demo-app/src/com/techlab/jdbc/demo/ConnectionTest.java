package com.techlab.jdbc.demo;

//1.import package
import java.sql.*;

public class ConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection=null;
	    try {
			//2.load and register driver
			Class.forName("com.mysql.jdbc.Driver");
			//3. Establish a connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav techlab","root", "root");
			//4. create the statement
			java.sql.Statement stmt=connection.createStatement();
			//5. Execute the query
			ResultSet rs=stmt.executeQuery("select * from candidate");
			//6. process the result
			while(rs.next())
				System.out.println(rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getInt(3));	
	    }catch(SQLException e) {
	    	e.printStackTrace();
	    }
	    finally {
	    	connection.close();
	    }
		

	}

}
