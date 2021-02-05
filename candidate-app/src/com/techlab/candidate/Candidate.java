package com.techlab.candidate;

public class Candidate {
	private int id;
	private String name;
	private int age;
	private String creditpoint;

	public Candidate(int newid, String newname, int newage, String newcreditpoint) {
		id = newid;
		name = newname;
		age = newage;
		creditpoint = newcreditpoint;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCreditpoint() {
		return creditpoint;
	}

	public Candidate whoIsBetter(Candidate[] c_arr) {
		int temp = Integer.parseInt(c_arr[0].getCreditpoint());
		Candidate c = c_arr[0];
		for (int i = 1; i < c_arr.length; i++) {
			if (Integer.parseInt(c_arr[i].getCreditpoint()) > temp) {
				temp = Integer.parseInt(c_arr[i].getCreditpoint());
				c = c_arr[i];
			}
		}
		return c;
	}

}
