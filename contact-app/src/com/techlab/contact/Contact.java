package com.techlab.contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Contact {
	Connection con = null;
	java.sql.Statement stmt = null;
	ResultSet rs = null;
	java.sql.PreparedStatement pstmt = null;
	private int flag_update;

	public void getConnection() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav techlab", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ResultSet selectAllContacts() throws ClassNotFoundException, SQLException {
		stmt = con.createStatement();
		rs = stmt.executeQuery("select * from contact order by fname");
		return rs;
	}
	public ResultSet selectContact(String fname) throws SQLException {
		pstmt=con.prepareStatement("select * from contact where fname=?");
		pstmt.setString(1,fname);
		rs=pstmt.executeQuery();
		return rs;
	}

	public void addContact(String fname, String lname, Long phone_number, String emailid) throws SQLException {
		pstmt = con.prepareStatement("insert into contact values(?,?,?,?)");
		pstmt.setString(1, fname);
		pstmt.setString(2, lname);
		pstmt.setLong(3, phone_number);
		pstmt.setString(4, emailid);
		pstmt.executeUpdate();

	}

	public int deleteContact(String fname) throws SQLException {
		pstmt = con.prepareStatement("delete from contact where fname=?");
		pstmt.setString(1, fname);
		flag_update=pstmt.executeUpdate();
		return flag_update;
	}
	public int updateContact(Long phone_number,String fname) throws SQLException {
		pstmt = con.prepareStatement("update contact set phone_number=? where fname=?");
		pstmt.setLong(1, phone_number);
		pstmt.setString(2, fname);
		flag_update=pstmt.executeUpdate();
		return flag_update;
	}

}
