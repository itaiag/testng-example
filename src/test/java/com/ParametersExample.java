package com;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

	@Test
	@Parameters({ "user-name", "password" })
	public void login(String userName, String password) {
		Reporter.log("About to login with user " + userName + " and password "
				+ password);
	}

}
