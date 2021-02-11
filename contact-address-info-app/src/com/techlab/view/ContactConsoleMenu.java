package com.techlab.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.models.Address;
import com.techlab.models.Contact;
import com.techlab.repository.ContactRepository;

public class ContactConsoleMenu {
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		ArrayList<Contact> contactlist = null;
		ArrayList<Address> addresslist = null;
		int ch;
		Scanner sc = new Scanner(System.in);
		ContactRepository repo = new ContactRepository();
		Contact contact=new Contact();
		Address address=new Address();
		String fname,lname,emailid,street_name,city,state,country;
		long phone_number;
		int pincode;
		int update_flag;
		

		System.out.println("Enter your choice:");
		System.out.println("1.Display all contacts");
		System.out.println("2.Search contact details");
		System.out.println("3.Add new Contact");
		System.out.println("4.Delete existing contact");
		System.out.println("5.Update phone number");
		System.out.println("6.Exit");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			contactlist = repo.getAllContacts();
			for (Contact c : contactlist) {
				System.out.println(c.getFname() + " " + c.getLname() + " " + c.getPhone() + " "
						+ c.getEmailid());
				System.out.println("Adrress details:");
				addresslist = repo.getAddress(c.getFname());
				for (Address add : addresslist) {
					System.out.println(add.getStreetName() + " " + add.getCity() + " " + add.getState()
							+ " " + add.getCountry() + " " + add.getPincode());
				}
				System.out.println();

			}
			break;
		case 2:
			System.out.println("Enter first name:");
			fname=sc.next();
			contact=repo.getContact(fname);
			System.out.println(contact.getFname()+" "+contact.getLname()+" "+contact.getPhone()+" "+contact.getEmailid());
			break;
		case 3:
			System.out.println("Please enter the details:");
			System.out.println("firstname");
			fname=sc.next();
			contact.setFname(fname);
			
			System.out.println("lastname:");
			lname = sc.next();
			contact.setLname(lname);
			
			System.out.println("phone_number:");
			phone_number = sc.nextLong();
			contact.setPhone(phone_number);
			
			System.out.println("emailid:");
			emailid = sc.next();
			contact.setEmailid(emailid);
			
			repo.addContact(contact);
			
			System.out.println("Enter number of addresses");
			int addesses=sc.nextInt();
			for (int i = 1; i <= addesses; i++) {
				System.out.println("Enter deatails of address"+i);
				
				System.out.println("Street_name:");
				street_name=sc.next();
				address.setStreetName(street_name);
				
				System.out.println("city:");
				city=sc.next();
				address.setCity(city);
				
				System.out.println("State:");
				state =sc.next();
				address.setState(state);
				
				System.out.println("Country:");
				country =sc.next();
				address.setCountry(country);
				
				System.out.println("Pin code:");
				pincode =sc.nextInt();
				address.setPincode(pincode);
				
				repo.addAddress(contact,address);
			}
		
			System.out.println("Inserted Sucessfully");
			break;
		case 4:
			System.out.println("Enter first name:");
			fname=sc.next();
			update_flag=repo.deleteContact(fname);
			if (update_flag == 0)
				System.out.println("no such contact: " + fname);
			else
				System.out.println("contact deleted sucessfully: " + fname);
			break;
		case 5:
			break;
		case 6:
			break;
	

		}
	}
}
