package com.techlab.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;
import com.techlab.models.Address;
import com.techlab.models.Contact;

public class ContactRepository {
	
	private static Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private java.sql.PreparedStatement pstmt = null;
	private int flag_update;
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

	public ArrayList<Contact> getAllContacts() throws ClassNotFoundException, SQLException {
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
	public ArrayList<Address> getAddress(String fname) throws ClassNotFoundException, SQLException {
		ArrayList<Address> addresses=new ArrayList<Address>();
		pstmt = con.prepareStatement("select * from addresses where emailid=(select emailid from contactdetails where fname=?)");
		pstmt.setString(1,fname);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			Address address=new Address();
			address.setStreetName(rs.getString("street_name"));
			address.setCity(rs.getString("city"));
			address.setState(rs.getString("state"));
			address.setCountry(rs.getString("country"));
			address.setPincode(rs.getInt("pincode"));
			addresses.add(address);
		}
		return addresses;
	}
	public Contact getContact(String fname) throws ClassNotFoundException, SQLException {
		Contact contact=new Contact();
		pstmt = con.prepareStatement("select * from contactdetails where fname=?");
		pstmt.setString(1,fname);
		rs=pstmt.executeQuery();
		if(rs.next()) {
			rs.beforeFirst();
			while(rs.next()) {
				contact.setFname(rs.getString("fname"));
				contact.setLname(rs.getString("lname"));
				contact.setPhone(rs.getLong("phone_number"));
				contact.setEmailid(rs.getString("emailid"));
			}
		}
		return contact;
	}
	public void addContact(Contact c) throws SQLException {
		pstmt = con.prepareStatement("insert into contactdetails values(?,?,?,?)");
		pstmt.setString(1, c.getFname());
		pstmt.setString(2, c.getLname());
		pstmt.setLong(3, c.getPhone());
		pstmt.setString(4, c.getEmailid());
		pstmt.executeUpdate();

	}

	public void addAddress(Contact c,Address a) throws SQLException {
		pstmt = con.prepareStatement("insert into addresses values(?,?,?,?,?,?)");
		pstmt.setString(1, a.getStreetName());
		pstmt.setString(2, a.getCity());
		pstmt.setString(3, a.getState());
		pstmt.setString(4, a.getCountry());
		pstmt.setInt(5, a.getPincode());
		pstmt.setString(6, c.getEmailid());
		pstmt.executeUpdate();

	}
	public int deleteContact(String fname) throws SQLException {
		pstmt = con.prepareStatement("delete from addresses where emailid=(select emailid from contactdetails where fname=?)");
		pstmt.setString(1, fname);
		pstmt.executeUpdate();
	    pstmt = con.prepareStatement("delete from contactdetails where fname=?");
		pstmt.setString(1, fname);
		flag_update=pstmt.executeUpdate();
		return flag_update;
	}
	
	
}
		