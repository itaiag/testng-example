package com;

import java.util.List;

import javax.xml.transform.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class WebTests extends AbstractTestCase {
	
	@Autowired
	private Web web;
	
	@Test
	public void testSearch(){
		List<Result> results = web.search("Cheese");
		assert results.size() > 0;
	}
	
}
