package com.techlab.assignment.test;

public class ArrayReveseTest {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 8, 9, 10 };
		for (int i = 0; i < arr.length / 2; i++) {
			int t = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = t;

		}
		for (int i : arr)
			System.out.print(" "+i);

	}

}
