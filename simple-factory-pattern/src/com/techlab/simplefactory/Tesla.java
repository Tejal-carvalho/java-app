package com.techlab.simplefactory;

public class Tesla implements IAutoMobile{

	@Override
	public void start() {
		System.out.println("Telsa is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Telsa has stopped");
		
	}

}
