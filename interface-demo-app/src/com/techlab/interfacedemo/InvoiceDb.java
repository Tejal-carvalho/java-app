package com.techlab.interfacedemo;

public class InvoiceDb implements Icrudable{

	@Override
	public void create() {
		System.out.println("Creating InvoiceDb database");
		
	}

	@Override
	public void read() {
		System.out.println("Reading from InvoiceDb database");
		
	}

	@Override
	public void update() {
		System.out.println("Updating InvoiceDb database");
		
	}

	@Override
	public void delete() {
		System.out.println("Deleting from InvoiceDb database");
		
	}

}
