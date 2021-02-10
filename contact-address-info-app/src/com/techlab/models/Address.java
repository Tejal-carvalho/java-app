package com.techlab.models;

public class Address {
	private String street_name;
	private String city;
	private String state;
	private String country;
	private int pincode;
	 
	public String getStreetName() {
		return street_name;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setStreetName(String street_name) {
		this.street_name=street_name;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public void setState(String state) {
		this.state=state;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public void setPincode(int pincode) {
		this.pincode=pincode;
	}
}
