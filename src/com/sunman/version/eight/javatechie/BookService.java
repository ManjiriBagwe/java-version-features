package com.sunman.version.eight.javatechie;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public List<Book> getBookWithSorted() {
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, new BookComparator());
		return books;
	}

	public List<Book> getBookWithSortedSecondWay() {
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book book1, Book book2) {
				return book1.getName().compareTo(book2.getName());
			}
		});
		return books;
	}

	public List<Book> getBookWithSortedWithLambda() {
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, (book1, book2) -> book1.getName().compareTo(book2.getName()));
		return books;
	}

	public List<Book> getBookWithDescendSortedWithLambda() {
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, (book1, book2) -> book2.getName().compareTo(book1.getName()));
		return books;
	}
}


class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		return book1.getName().compareTo(book2.getName());
	}
}