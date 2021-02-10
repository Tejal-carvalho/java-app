package com.techlab.file.test;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {

	public static void main(String[] args) throws IOException {
		String str = "Welcome to swabhav techlabs, " + "i am a developer";
		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter("D:\\Java\\ClassWork\\file-io-app\\src\\demo.txt");
			// myWriter.write("i am learning java\n");
			// System.out.println("Successfully written info file");
			// myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < str.length(); i++)
			myWriter.write(str.charAt(i));
		System.out.println("Written successfully");
		myWriter.close();

	}

}
