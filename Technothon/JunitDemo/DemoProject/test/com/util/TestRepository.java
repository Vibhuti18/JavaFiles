package com.util;

import static org.junit.Assert.*;

import org.junit.Test;

import com.application.Repository;
import com.beans.Book;
import com.beans.Student;

public class TestRepository {

	@Test
	public void testRepository() {
	Repository r = new Repository();
	
	assertNotNull(r.getMap());
	assertEquals(0, r.getMap().size());
	}

	@Test
	public void testAddEntry() {
	//	fail("Not yet implemented");
		Repository r = new Repository();
		Book book = new Book("Java", "Education", "Balaguruswamy");
		Student student = new Student(103, "Prabhav");
		r.addEntry(book, student);
		
		assertTrue(r.getMap().containsKey(book));
		
		assertSame(student, r.getMap().get(book));
		
		
	}

	@Test
	public void testRemoveEntry() {
		//fail("Not yet implemented");
	}

}
