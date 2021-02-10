package com.techlab.interfacedemo;

public class Child implements Parent1,Parent2{

	@Override
	public void dispaly() {
		System.out.println("Hello Parent1");
		
	}

	@Override
	public void message() {
		System.out.println("Hello Parent2");
		
	}

}
