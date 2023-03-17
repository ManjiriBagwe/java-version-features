package com.sunman.version.eight.javatechie;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "A",45));
		books.add(new Book(2, "B",75));
		books.add(new Book(3, "C",445));
		books.add(new Book(4, "AD",545));
		return books;
	}
}
