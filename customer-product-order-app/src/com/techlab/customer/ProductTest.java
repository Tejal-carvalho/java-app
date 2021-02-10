package com.techlab.customer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void testProduct() {
		int expectedpid = 10;
		String expectedpname = "abc";
		double expectedcost = 4000;
		float expectedpercentagediscount = 10f;
		Product product = new Product(10, "abc", 4000, 10f);
		assertEquals(expectedpid, product.getProductId());
		assertEquals(expectedpname, product.getProductName());
		assertEquals(expectedcost, product.getCost());
		assertEquals(expectedpercentagediscount, product.getDiscount());
	}

	@Test
	void testCalculateTotalCost() {
		double expectedtotalcost = 3600;
		Product product = new Product(10, "abc", 4000, 10f);
		product.calculateTotalCost();
		System.out.println(product.calculateTotalCost());
		assertEquals(expectedtotalcost, product.calculateTotalCost());
	}

}
