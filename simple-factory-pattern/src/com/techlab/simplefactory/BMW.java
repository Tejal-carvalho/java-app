package com.techlab.simplefactory;

public class BMW implements IAutoMobile{

	@Override
	public void start() {
		System.out.println("BMW is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW has stopped");
		
	}

}
