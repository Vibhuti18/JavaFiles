package com.app.model;

import java.io.Serializable;

public class Novels extends Books implements Serializable{
	
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
