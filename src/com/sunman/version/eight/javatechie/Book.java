package com.sunman.version.eight.javatechie;

public class Book {
	private int id;
	private String name;
	private int pageCount;

	public Book() {
		super();
	}

	public Book(int id, String name, int pageCount) {
		super();
		this.id = id;
		this.name = name;
		this.pageCount = pageCount;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pageCount=" + pageCount + "]";
	}
}
