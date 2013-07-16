package com;

import org.junit.Assert;
import org.junit.Test;

public class TestNGExample2 {

	private String str;

	@Test
	public void setTest() {
		str = "some value";
	}

	@Test
	public void getTest() {
		Assert.assertEquals("some value", str);
	}

}
