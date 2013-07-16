package com;

import java.lang.reflect.Method;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	private static final String DATA = null;
	private LoginPage loginPage = new LoginPage();

	@DataProvider(name = "credentials")
	public Object[][] createData(Method m) {
		System.out.println(m.getName());
		return new Object[][] { { "user1", "password1" },
				{ "user2", "password2" } };
	}

	@Test(dataProvider = "credentials")
	public void testLogin(String user, String password) {
		boolean result = loginPage.login(user, password);
		Assert.assertTrue(result);
	}
	
	@DataProvider(name = "test1")
	public Iterator<Object[]> createDataWithIterator() {
	  return new MyIterator(DATA);
	}
	
	@Test
	public void serverStartedOk() {}
	 
	@Test(dependsOnMethods = { "serverStartedOk" })
	public void method1() {}



}
