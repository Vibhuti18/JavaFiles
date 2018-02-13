package com.util;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.application.Calculator;

public class TestCalculator {
	
	static Calculator client=null;
	
	@BeforeClass
	void setUp()
	{
		System.out.println("Calculator has been instantiated....!!!!");
		client = new Calculator();
	}

	@Test
	public void testAdd() {
		assertEquals(6, Calculator.add(3, 3));
	}

	@Test
	public void testMultiply() {
		assertEquals(9, Calculator.multiply(3, 3));
	}

}
