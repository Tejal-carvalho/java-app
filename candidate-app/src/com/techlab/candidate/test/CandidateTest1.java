package com.techlab.candidate.test;

import com.techlab.candidate.Candidate;

public class CandidateTest1 {

	public static void main(String[] args) {
		Candidate c1 = new Candidate(1, "abc", 18, "12");
		Candidate c2 = new Candidate(2, "pqr", 18, "7");
		Candidate c3 = new Candidate(3, "asd", 18, "15");
		Candidate c4 = new Candidate(4, "xyz", 18, "10");
		Candidate[] c_arr = new Candidate[4];
		c_arr[0] = c1;
		c_arr[1] = c2;
		c_arr[2] = c3;
		c_arr[3] = c4;
		Candidate c=c1.whoIsBetter(c_arr);
		System.out.println(
				"Largest creadit points:" + c.getCreditpoint() + "\nName of student:" + c.getName() + "\nId of student:" + c.getId());
	}

}