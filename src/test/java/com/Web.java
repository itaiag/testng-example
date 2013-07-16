package com;

import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Result;

public class Web {
	private String domain;

	private String webDriver;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getWebDriver() {
		return webDriver;
	}

	public void setWebDriver(String webDriver) {
		this.webDriver = webDriver;
	}

	public List<Result> search(String string) {
		return new ArrayList<Result>();
	}

}
