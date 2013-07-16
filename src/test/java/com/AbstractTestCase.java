package com;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;


@ContextConfiguration(locations = { "classpath:META-INF/integration-context.xml" })
public abstract class AbstractTestCase extends AbstractTestNGSpringContextTests{

}
