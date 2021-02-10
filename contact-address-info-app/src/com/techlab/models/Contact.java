package com.techlab.models;

public class Contact {
	private String fname;
	private String lname;
	private long phone_number;
	private String emailid;
	
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public long getPhone() {
		return phone_number;
		
	}
	public String getEmailid() {
		return emailid;
	}
	public void setFname(String fname) {
		this.fname=fname;
	}
	public void setLname(String lname) {
		this.lname=lname;
	}
	public void setPhone(long phone_number) {
		this.phone_number=phone_number;
	}
	public void setEmailid(String emailid) {
		this.emailid=emailid;
	}

}
