package com.techlab.assignment.test;

public class ArrayEqualityTest {

	public static void main(String[] args) {
		int arr[] = {21, 57, 11, 37, 24};
		int barr[]= {21, 57, 11, 37, 24};
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=barr[i])
			{
				flag=1;
			     break;
			}
		}
		if(flag==1)
			System.out.println("Both array are not equal");
		else
			System.out.println("Both array are equal");
		

	}

}
