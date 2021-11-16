package com.restapi.base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class APIBaseClass {
	
	public Logger log;
	@BeforeSuite
	public void configBS() {
		
	}
	
	@AfterSuite
	public void configAS() {
	
	}
	

}
