package com.techlab.interfacedemo;

public class AddresssDb implements Icrudable {

	@Override
	public void create() {
		System.out.println("Creating address database");
		
	}

	@Override
	public void read() {
		System.out.println("Reading from address database");
		
	}

	@Override
	public void update() {
		System.out.println("Updating address database");
		
	}

	@Override
	public void delete() {
		System.out.println("Deleting from address database");
		
	}

}
