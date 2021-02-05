package com.techlab.person;



public class Person {
	private String name;
	private int age;
	private String gender;
	private float height;
	private float weight;
	private float increment_per=0.20f;
	private float decrementt_per=0.05f;

	public Person(String name, String gender, float height, float weight) {
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.age = 25;
	}

	public Person(String name, String gender, float height, float weight, int age) {
		this(name, gender, height, weight);
		this.age = age;
	}

	public String getName() {
		if (name.equals(" ") || name.equals("null"))
			return "unspecified";
		else
			return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public void doWorkOut() {
			this.weight = weight -(float) increment_per*weight;
	}

	public void doEat() {
		this.weight = weight +(float) decrementt_per*weight;

	}
	
	public float calculateBmiIndex(){
		float bmi=(float)( this.weight/(this.height*this.height));
		return bmi;
		
	}
	
	
	
}
