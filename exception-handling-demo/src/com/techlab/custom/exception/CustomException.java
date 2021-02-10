package com.techlab.custom.exception;

public class CustomException {
	public static void validate(int age) throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("welcome to vote");
	}
	

}
