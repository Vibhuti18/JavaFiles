package com.psl.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.psl.client.UserManagement;

public class TestUserManagement {
	UserManagement user;

	@Before
	public void setUp() throws Exception {
		user = new UserManagement();
	}

	@After
	public void tearDown() throws Exception {
	user=null;
	}

	@Test
	public void testCreateUser() {
		
		assertEquals("Created", user.createUser());
		//fail("Not yet implemented");
	}

	@Test
	public void testDeleteUser() {
		
		assertEquals("Deleted", user.deleteUser());
		//fail("Not yet implemented");
	}

}
