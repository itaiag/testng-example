package com;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExample {
	private Calculator calc;

	@BeforeMethod
	public void setUp() {
		calc = new Calculator();
	}

	@Test
	public void testAdd() {
		Reporter.log("About to test the add function");
		int result = calc.add(5, 5);
		Assert.assertEquals(result, 10);
	}

	@Test
	public void testSubstract() {
		Reporter.log("About to test the substract function");
		int result = calc.sub(10, 5);
		Assert.assertEquals(result, 5);
	}

}
