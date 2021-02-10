package com.techlab.contact.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.techlab.contact.Contact;

public class ContactTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("1.Select all contacts");
		System.out.println("2.Search contact details");
		System.out.println("3.Add new Contact");
		System.out.println("4.Delete existing contact");
		System.out.println("5.Update phone number");
		String fname,lname,emailid;
		Long phone_number;
		ResultSet rs;
		int flag;
		int ch = sc.nextInt();
		Contact contact = new Contact();
		switch (ch) {
		case 1:
			contact.getConnection();
			rs=contact.selectAllContacts();
			while (rs.next()) {
				System.out.println(rs.getString("fname") + " " + rs.getString("lname") + " " + rs.getLong("phone_number")
						+ " " + rs.getString("emailid"));
			}
			
			break;
		case 2:
			contact.getConnection();
			System.out.println("Enter name:");
			fname=sc.next();
			rs=contact.selectContact(fname);
			if(rs.next()) {
				rs.beforeFirst();
				while (rs.next()) {
					System.out.println(rs.getString("fname") + " " + rs.getString("lname") + " " + rs.getLong("phone_number")
							+ " " + rs.getString("emailid"));
				}
			}
			else {
				System.out.println("no such contact");
			}
			
			
			break;
			
		case 3:
			System.out.println("Enter first name, last name, phone_number and emailid");
			fname=sc.next();
			lname=sc.next();
			phone_number=sc.nextLong();
			emailid=sc.next();
			contact.getConnection();
			contact.addContact(fname,lname,phone_number,emailid);
			System.out.println("Inserted Sucessfully");
			break;
		case 4:
			System.out.println("Enter fistname to delete the contact:");
			fname=sc.next();
			contact.getConnection();
			flag=contact.deleteContact(fname);
			if(flag==0)
				System.out.println("no such contact: "+fname);
			else
				System.out.println("contact deleted sucessfully: "+fname);
			break;
			
		case 5:
			System.out.println("Enter fistname to update the contact:");
			fname=sc.next();
			System.out.println("Enter new phone number");
			phone_number=sc.nextLong();
			contact.getConnection();
			flag=contact.updateContact(phone_number, fname);
			if(flag==0)
				System.out.println("no such contact: "+fname);
			else
				System.out.println("contact updated sucessfully: "+fname);
			break;
			
		}

	}

}
