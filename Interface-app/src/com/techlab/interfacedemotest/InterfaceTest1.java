package com.techlab.interfacedemotest;

import com.techlab.interfacedemo.Boy;
import com.techlab.interfacedemo.Man;

public class InterfaceTest1 {
	public static void main(String args[]) {
		Man m = new Man();
		m.cry();
		m.depart();
		m.laugh();
		m.wish();
		Boy b = new Boy();
		b.cry();
		b.laugh();
	}

}
