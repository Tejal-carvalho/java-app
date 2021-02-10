package com.techlab.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


import com.techlab.models.Contact;
import com.techlab.repository.ContactRepository;

public class ContactConsoleMenu 
{
	public static void main(String args[]) throws SQLException, ClassNotFoundException{
		ArrayList<Contact> contactlist = null;
		int ch;
		Scanner sc = new Scanner(System.in);
		ContactRepository repo = new ContactRepository();

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
			contactlist = repo.selectAllContacts();
			for (Contact contact : contactlist) {
				System.out.println(contact.getFname());
			}

		}
	}
}
