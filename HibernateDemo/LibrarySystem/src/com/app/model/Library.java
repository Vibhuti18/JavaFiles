package com.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="Library")
public class Library implements Serializable{
	
	private int bookId;
	private String bookName;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
}
