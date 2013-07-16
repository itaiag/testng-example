package com;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JUnitExample {
	
	private Calculator calc;
	
	@Before
	public void setUp(){
		calc = new Calculator();
	}
	
	@Test
	public void testAdd(){
		int result = calc.add(5,5);
		Assert.assertEquals(10, result);
	}
	
	@Test
	public void testSubstract(){
		int result = calc.sub(10,5);
		Assert.assertEquals(5, result);
	}
	
}
