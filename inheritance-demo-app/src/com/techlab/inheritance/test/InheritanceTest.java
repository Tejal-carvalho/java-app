package com.techlab.inheritance.test;

import com.techlab.singleinheritance.Addition;
import com.techlab.singleinheritance.AdditionSubtraction;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add=new Addition();
		add.sum(5, 6);
		AdditionSubtraction addsub=new AdditionSubtraction();
		addsub.sum(6, 7);
		addsub.sub(9, 6);

	}

}
