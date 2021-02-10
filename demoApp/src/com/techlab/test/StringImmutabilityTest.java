package com.techlab.test;

public class StringImmutabilityTest {

	public static void main(String[] args) {
		String str1="abcd";
		String str2="xyz";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}

}
