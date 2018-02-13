package com.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestValidatorUtil {

	@Test
	public void testValidEmails() {
		assertTrue(ValidatorClass.isValid("vibhutisawant@gmail.com"));
		assertTrue(ValidatorClass.isValid("vibhutisawant@gmail@.com"));
		
	}
	
	@Test
	public void testInvalidEmails() {
		assertFalse(ValidatorClass.isValid("vibhutisawant@gmail"));
		assertFalse(ValidatorClass.isValid("vibhutisawant@gmailcom"));
	}
	
	@Test
	public void testSpeed() {
		assertEquals(70.0, ValidatorClass.calculateSpeed(35, 2),0);
		
	}

}
