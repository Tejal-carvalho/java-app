package com.techlab.srp.solution.test;

import com.techlab.srp.solution.Invoice;
import com.techlab.srp.solution.InvoiceConsolPrinter;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice iobj=new Invoice(1,"abc",1000,10);
		InvoiceConsolPrinter obj=new InvoiceConsolPrinter(iobj);
		obj.printInfo();
	}

}
