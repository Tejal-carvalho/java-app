package com.techlab.library.test;

import com.techlab.library.Book;
import com.techlab.library.Library;

public class LibraryTest {

	public static void main(String[] args) {
		Book[] b = new Book[3];
		b[0] = new Book("abc", "xyz");
		b[1] = new Book("lmn", "jkl");
		b[2] = new Book("def", "qwe");
		Library library = new Library(b);
		Book books[] = library.getAllBooks();
		for (Book book : books) {
			System.out.println("book name: " + book.getBookName() + " Author:" + book.getAuthor());
		}

	}

}
