package com.techlab.srp.solution;



public class InvoiceConsolPrinter {
	private Invoice invoice;
	public InvoiceConsolPrinter(Invoice invoice) {
		this.invoice=invoice;	
	}
	public void printInfo() {
		System.out.println("Invoice number:"+invoice.getNo());
		System.out.println("Invoice description:"+invoice.getDesc());
		System.out.println("Cost:"+invoice.getCost());
		System.out.println("Discount:"+invoice.getDiscount());
		System.out.println("Discount rs is:"+invoice.getDiscount());
		System.out.println("Tax is:"+invoice.calculateTax());
		System.out.println("Final cost is:"+invoice.calculateFinalCost());
		
	}

}
