package com.psl.question1;

public class Book implements Comparable<Book> {

	int book_id;
	String book_name, book_author;
	double book_price;
	BookCategory book_category;

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public double getBook_price() {
		return book_price;
	}

	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BOOK " + book_id + " " + book_name + " " + book_author + " "
				+ book_price + " " + book_category;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		int i = 0;
		if (book_id < o.book_id)
			i = -1;
		else if (book_id > o.book_id)
			i = 1;
		else
			i = 0;

		return i;
	}

}
