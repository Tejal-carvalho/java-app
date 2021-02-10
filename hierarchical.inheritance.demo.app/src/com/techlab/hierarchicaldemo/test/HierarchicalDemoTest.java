package com.techlab.hierarchicaldemo.test;

import com.techlab.hierarchicaldemo.Boy;
import com.techlab.hierarchicaldemo.Infant;
import com.techlab.hierarchicaldemo.Kid;
import com.techlab.hierarchicaldemo.Man;

public class HierarchicalDemoTest {

	public static void main(String[] args) {
		/*
		 * Man mobj=new Man(); mobj.eat(); mobj.play();
		 * 
		 * Boy bobj=new Boy(); bobj.eat(); bobj.play(); bobj.read();
		 * 
		 * Kid kobj=new Kid(); kobj.play();
		 * 
		 * Infant iobj=new Infant(); iobj.play();
		 */
		System.out.println("case 1:");
		case1();
		System.out.println("case 2:");
		case2();
		System.out.println("case 3:");
		case3();
		System.out.println("calling park method:");
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Infant());
		atThePark(new Kid());
		System.out.println("case 4:");
		case4();
	}

	private static void case4() {
		Object x;
		x = 10;
		System.out.println(x.getClass());
		x = "Hello";
		System.out.println(x.getClass());
		x = new Man();
		System.out.println(x.getClass());
	}

	private static void atThePark(Man x) {
		System.out.println("At the park:");
		x.eat();
		x.play();
	}

	private static void case3() {
		Man x = new Boy();
		x.eat();
		x.play();
	}

	private static void case2() {
		Boy y = new Boy();
		y.eat();
		y.play();
		y.read();
	}

	private static void case1() {
		Man x;
		x = new Man();
		x.eat();
		x.play();
	}

}
