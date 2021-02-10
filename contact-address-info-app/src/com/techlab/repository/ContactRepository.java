package com.techlab.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;
import com.techlab.models.Contact;

public class ContactRepository {
	
	private static Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private PreparedStatement pstmt = null;
	private ArrayList<Contact> contacts=new ArrayList<Contact>();
	
	
    static{
			try {
				initializeConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
    }
	public static void initializeConnection() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav techlab", "root", "root");
		} catch (SQLException |ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Contact> selectAllContacts() throws ClassNotFoundException, SQLException {
		stmt = con.createStatement();
		rs = stmt.executeQuery("select * from contactdetails order by fname");
		
		while(rs.next()) {
		    Contact contact=new Contact();
			contact.setFname(rs.getString("fname"));
			contact.setLname(rs.getString("lname"));
			contact.setPhone(rs.getLong("phone_number"));
			contact.setEmailid(rs.getString("emailid"));
			contacts.add(contact);
		}
		
		return contacts;
	}
}
		