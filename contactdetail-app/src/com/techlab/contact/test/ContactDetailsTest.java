package com.techlab.contact.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.techlab.contact.ContactDetail;

public class ContactDetailsTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		String fname, lname, emailid;
		Long phone_number;
		ResultSet rs, rs1;
		int update_flag;
		int ch;
		ContactDetail contact = new ContactDetail();
		do {
			System.out.println("\nEnter your choice:");
			System.out.println("1.Display all contacts");
			System.out.println("2.Search contact details");
			System.out.println("3.Add new Contact");
			System.out.println("4.Delete existing contact");
			System.out.println("5.Update phone number");
			System.out.println("6.Exit");
			ch = sc.nextInt();
		switch (ch) {
		case 1:
			contact.getConnection();
			rs = contact.selectAllContacts();
			while (rs.next()) {
				System.out.println();
				System.out.println(rs.getString("fname") + " " + rs.getString("lname") + " "
						+ rs.getLong("phone_number") + " " + rs.getString("emailid"));
				
				String fname1 = rs.getString("fname");
				System.out.println("addresses of " + fname1 +":");
				rs1 = contact.selectAddress(fname1);
				while (rs1.next()) {
					System.out.println(rs1.getString("street_name") + " " + rs1.getString("city") + " "
							+ rs1.getString("state") + " " + rs1.getString("country") + " " + rs1.getInt("pincode"));
				}
			}

			break;
		case 2:
			contact.getConnection();
			System.out.println("Enter name:");
			fname = sc.next();
			rs = contact.selectContact(fname);
			rs1=contact.selectAddress(fname);
			if (rs.next()) {
				rs.beforeFirst();
				while (rs.next()) {
					System.out.println(rs.getString("fname") + " " + rs.getString("lname") + " "
							+ rs.getLong("phone_number") + " " + rs.getString("emailid"));
				}
				System.out.println("addresses of " + fname + ":");
				while (rs1.next()) {
					System.out.println(rs1.getString("street_name") + " " + rs1.getString("city") + " "
							+ rs1.getString("state") + " " + rs1.getString("country") + " " + rs1.getInt("pincode"));
				}
			} else {
				System.err.println("no such contact");
			}

			break;

		case 3:
			contact.getConnection();
			System.out.println("Please enter the details:");
			System.out.println("firstname");
			fname = sc.next();
			System.out.println("lastname:");
			lname = sc.next();
			System.out.println("phone_number:");
			phone_number = sc.nextLong();
			System.out.println("emailid:");
			emailid = sc.next();
			contact.addContact(fname, lname, phone_number, emailid);
			System.out.println("Enter number of addresses");
			int addesses=sc.nextInt();
			for (int i = 1; i <= addesses; i++) {
				System.out.println("Enter deatails of address"+i);
				System.out.println("Street_name:");
				String street_name=sc.nextLine();
				System.out.println("city:");
				String city=sc.nextLine();
				System.out.println("State:");
				String state =sc.nextLine();
				System.out.println("Country:");
				String country =sc.nextLine();
				System.out.println("Pin code:");
				int pincode =sc.nextInt();
				contact.addAddress(street_name, city, state, country, pincode, emailid);
			}
		
			System.out.println("Inserted Sucessfully");
			break;
		case 4:
			System.out.println("Enter fistname to delete the contact:");
			fname = sc.next();
			contact.getConnection();
			update_flag = contact.deleteContact(fname);
			if (update_flag == 0)
				System.out.println("no such contact: " + fname);
			else
				System.out.println("contact deleted sucessfully: " + fname);
			break;

		case 5:
			System.out.println("Enter fistname to update the contact:");
			fname = sc.next();
			System.out.println("Enter new phone number");
			phone_number = sc.nextLong();
			contact.getConnection();
			update_flag = contact.updateContact(phone_number, fname);
			if (update_flag == 0)
				System.out.println("no such contact: " + fname);
			else
				System.out.println("contact updated sucessfully: " + fname);
			break;
		default:
			System.out.println("bye");
			break;

		}

	}while(ch!=6);
	}

}
