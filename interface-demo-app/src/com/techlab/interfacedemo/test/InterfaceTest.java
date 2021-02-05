package com.techlab.interfacedemo.test;

import com.techlab.interfacedemo.AddresssDb;
import com.techlab.interfacedemo.CustomerDb;
import com.techlab.interfacedemo.Icrudable;
import com.techlab.interfacedemo.InvoiceDb;

public class InterfaceTest {

	public static void main(String[] args) {
		AddresssDb aobj = new AddresssDb();
		CustomerDb cobj = new CustomerDb();
		InvoiceDb iobj = new InvoiceDb();
		printInfo(aobj);
		printInfo(cobj);
		printInfo(iobj);
	}

	private static void printInfo(Icrudable obj) {
		obj.create();
		obj.read();
		obj.update();
		obj.delete();

	}

}
