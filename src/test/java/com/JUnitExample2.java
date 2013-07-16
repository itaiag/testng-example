package com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JUnitExample2 {

	private String str;

	@Test
	public void asetTest() {
		str = "some value";
	}

	@Test
	public void zgetTest() {
		Assert.assertEquals(str, "some value");
	}

}
