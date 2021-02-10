package com.techlab.simplefactory;

public class Audi implements IAutoMobile{

	@Override
	public void start() {
		System.out.println("Audi is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Audi has stopped");
		
	}

}
