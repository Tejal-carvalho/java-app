package com.techlab.assignment.test;

public class ArrayMissingValueTest {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 5, 3, 2, 8, 6 };
		int n = arr.length + 1;
		int sum = (n * (n + 1)) / 2;
		int total = 0;
		for (int i : arr)
			total = total + i;
		System.out.println(sum - total);

	}

}
