package com.beans;

public class Book {
	
	private static int count;
	private String name;
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Book.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(String name, String category, String author) {
		super();
		this.name = name;
		this.category = category;
		this.author = author;
	}
	private String category;
	private String author;
	
}
