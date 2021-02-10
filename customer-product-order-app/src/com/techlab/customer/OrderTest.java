package com.techlab.customer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class OrderTest {

	@Test
	void testOrder() {
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(new Product(10,"abc",4000,10f));
		products.add(new Product(11,"pqr",600,5f));
		int expectedorderid=111;
		String expectedorderdate="20-feb-2020";
		ArrayList<Product> expectedproducts=products;
		Order order=new Order(111,"20-feb-2020",products);
		assertEquals(expectedorderid,order.getOrderId());
		assertEquals(expectedorderdate,order.getOderDate());
		assertEquals(expectedproducts,order.getAllProducts());
		
	}

	@Test
	void testAddProduct() {
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(new Product(10,"abc",4000,10f));
		products.add(new Product(11,"pqr",600,5f));
		Order order=new Order(111,"20-feb-2020",products);
		order.addProduct(new Product(12,"qwe",2000,8f));
		ArrayList<Product> expectedproducts=products;
		assertEquals(expectedproducts,order.getAllProducts());
	
	}

	@Test
	void testRemoveProduct() {
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(new Product(10,"abc",4000,10f));
		products.add(new Product(11,"pqr",600,5f));
		Order order=new Order(111,"20-feb-2020",products);
		order.removeProduct(new Product(10,"abc",4000,10f));
		ArrayList<Product> expectedproducts=products;
		assertEquals(expectedproducts,order.getAllProducts());	
	}

	@Test
	void testGetProductCountAfterAdd() {
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(new Product(10,"abc",4000,10f));
		products.add(new Product(11,"pqr",600,5f));
		Order order=new Order(111,"20-feb-2020",products);
		order.addProduct(new Product(12,"qwe",2000,8f));
		int expectedcountafteradd=3;
		assertEquals(expectedcountafteradd,order.getProductCount());
		
	}
	
	@Test
	void testGetProductCountAfterRemove() {
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(new Product(10,"abc",4000,10f));
		products.add(new Product(11,"pqr",600,5f));
		Order order=new Order(111,"20-feb-2020",products);
		order.removeProduct(new Product(11,"pqr",600,5f));
		int expectedcountafterremove=2;
		assertEquals(expectedcountafterremove,order.getProductCount());
	}
	

}
