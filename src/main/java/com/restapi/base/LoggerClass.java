package com.restapi.base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerClass {
	
	
	static Logger log=Logger.getLogger(LoggerClass.class);
	
	public static Logger getLogger() {
		PropertyConfigurator.configure(".\\src\\main\\resources\\log4j.properties");
		return log;
	}
	

}
