package com.techlab.interfacedemo;

public class CustomerDb implements Icrudable{

	@Override
	public void create() {
		System.out.println("Creating customer database");
		
	}

	@Override
	public void read() {
		System.out.println("Reading from customer database");
		
	}

	@Override
	public void update() {
		System.out.println("Updating customer database");
		
	}

	@Override
	public void delete() {
		System.out.println("Deleting from customer database");
		
	}

}
