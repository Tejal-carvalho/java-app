package com.techlab.file.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("D:\\Java\\ClassWork\\file-io-app\\src\\demo.txt");
		int i;

			try {
				while ((i = fr.read()) != -1)
					System.out.print((int) i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		

	}

}
