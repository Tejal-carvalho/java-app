package com.techlab.file.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile1 {

	public static void main(String[] args) throws FileNotFoundException {
		String csvfile = "D:\\Java\\ClassWork\\file-io-app\\src\\student.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitby = ",";

		br = new BufferedReader(new FileReader(csvfile));
		try {
			while ((line = br.readLine()) != null) {
				String[] student = line.split(csvSplitby);
				System.out.println("student [id=" + student[0] + " name=" + student[1] + "]");

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
