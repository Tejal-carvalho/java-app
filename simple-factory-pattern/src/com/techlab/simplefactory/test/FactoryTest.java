package com.techlab.simplefactory.test;

import com.techlab.simplefactory.AutoType;
import com.techlab.simplefactory.AutomobileFactory;
import com.techlab.simplefactory.IAutoMobile;

public class FactoryTest {

	public static void main(String[] args) {
		AutomobileFactory factory = new AutomobileFactory();
		IAutoMobile bmw = factory.make(AutoType.BMW);
		bmw.start();
		bmw.stop();

		IAutoMobile audi = factory.make(AutoType.AUDI);
		audi.start();
		audi.stop();

		IAutoMobile telsa = factory.make(AutoType.TELSA);
		telsa.start();
		telsa.stop();

	}

}
