package com;

import org.testng.annotations.Test;

public class GroupExample {
	
	@Test(threadPoolSize = 10, invocationCount = 30)
	public void parallelTest(){
		System.out.println("Crunching...");
	}
	
	
	
}
