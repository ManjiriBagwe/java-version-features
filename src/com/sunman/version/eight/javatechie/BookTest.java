package com.sunman.version.eight.javatechie;

public class BookTest {

	public static void main(String[] args) {
		System.out.println(new BookService().getBookWithSorted());
		System.out.println(new BookService().getBookWithSortedSecondWay());
		System.out.println(new BookService().getBookWithSortedWithLambda());
		System.out.println(new BookService().getBookWithDescendSortedWithLambda());
	}

}
