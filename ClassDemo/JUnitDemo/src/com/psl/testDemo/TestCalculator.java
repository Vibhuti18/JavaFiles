package com.psl.testDemo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.psl.demo.Calculator;

public class TestCalculator {
	Calculator cal;

	@BeforeClass
	private void SetUp() {
		// TODO Auto-generated method stub
		cal = new Calculator();
	}

	@Test
	public void testAdd() {
		// fail("Not yet implemented");

		int actual = cal.add(10, 10);

		Assert.assertEquals(20, actual);
	}
	
	@Test
	private void testDivide() {
		// TODO Auto-generated method stub
		int actual = cal.divide(20, 0);

		Assert.assertEquals(14, actual);

	}
}
