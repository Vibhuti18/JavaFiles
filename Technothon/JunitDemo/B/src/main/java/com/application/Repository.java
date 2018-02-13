package com.application;

import java.util.HashMap;
import java.util.Map;

import com.beans.Book;
import com.beans.Student;

public class Repository {

	private Map<Book, Student> map;

	public Repository() {

		// TODO Auto-generated constructor stub
		map = new HashMap<Book, Student>();
		//map = null;
	}

	public void addEntry(Book book, Student student) {
		// TODO Auto-generated method stub
		Student s = new Student(101, "Vibhuti");
		Book b = new Book("2 States", "Novel", "Chetan Bhagat");
		map.put(b, student);
		s = null;
		map.put(book, s);
	}
	
	public void removeEntry(Book book, Student student) {
		// TODO Auto-generated method stub

		map.remove(student);
	}

	public Map<Book, Student> getMap() {
		return map;
	}

	public void setMap(Map<Book, Student> map) {
		this.map = map;
	}

	public Repository(Map<Book, Student> map) {
		super();
		this.map = map;
	}

}
