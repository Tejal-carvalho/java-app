package com.techlab.interfacedemo;

public class Man implements ISocialization,IEmotionable{
	public void wish() {
		System.out.println("Man is wishing");
	}
	public void depart() {
		System.out.println("Man is departing");
	}
	public void cry() {
		System.out.println("Man is crying");
	}
	public void laugh() {
		System.out.println("Man is laughing");
	}

}
