package com.restapi.base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import javax.xml.crypto.Data;


public class APIBaseClass {
	

	@BeforeSuite
	public void configBS() {
		LoggerClass.getLogger().info("Connecting to database");
		DataBaseUtility.getDataBaseConnection();
	}
	
	@AfterSuite
	public void configAS() {
		DataBaseUtility.closeDataBaseConnection();
	}
	

}
