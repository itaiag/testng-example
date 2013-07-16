package com;

import org.testng.annotations.Test;

public class DependenciesExample {

	@Test
	public void startServer() {
		System.out.println("Starting server");
	}

	@Test(dependsOnMethods = "startServer")
	public void testDeployApp() {
		System.out.println("Deploying app");
	}
}
