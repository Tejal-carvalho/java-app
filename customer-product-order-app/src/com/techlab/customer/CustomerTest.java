package com.techlab.customer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomerTest {
	@Test
	void testCustomer() {
		ArrayList<Product> products=new ArrayList<Product>();
		ArrayList<Order> orderlist=new ArrayList<Order>();
		products.add(new Product(10,"abc",4000,10f));
		products.add(new Product(11,"pqr",600,5f));
		Order order=new Order(111,"20-march-2020",products);
		orderlist.add(order);
		int expectedid=101;
		String expectedname="john";
		ArrayList<Order> expectedorders=orderlist;
		Customer cust=new Customer(101,"john",orderlist);
		assertEquals(expectedid,cust.getCustId());
		assertEquals(expectedname,cust.getCustName());
		assertEquals(expectedorders,cust.getAllOrders());
	}

	@Test
	void testAddOrders() {
		ArrayList<Product> products=new ArrayList<Product>();
		ArrayList<Order> orderlist=new ArrayList<Order>();
		products.add(new Product(10,"abc",4000,10f));
		products.add(new Product(11,"pqr",600,5f));
		Order order=new Order(111,"20-march-2020",products);
		orderlist.add(order);
		Customer cust=new Customer(101,"john",orderlist);
		Order ordertwo=new Order(117,"25-april-2020",products);
		Order orderthree=new Order(117,"25-april-2020",products);
		ArrayList<Order> expectedorders=orderlist;
		cust.addOrders(ordertwo);
		cust.addOrders(orderthree);
		assertEquals(expectedorders,cust.getAllOrders());
		
	}

	@Test
	void testGetOrderCount() {
		ArrayList<Product> products=new ArrayList<Product>();
		ArrayList<Order> orderlist=new ArrayList<Order>();
		products.add(new Product(10,"abc",4000,10f));
		products.add(new Product(11,"pqr",600,5f));
		Order order=new Order(111,"20-march-2020",products);
		orderlist.add(order);
		Customer cust=new Customer(101,"john",orderlist);
		Order ordertwo=new Order(117,"25-april-2020",products);
		cust.addOrders(ordertwo);
		int expectedcount=2;
		System.out.println(cust.getOrderCount());
		assertEquals(expectedcount,cust.getOrderCount());
	}

}
