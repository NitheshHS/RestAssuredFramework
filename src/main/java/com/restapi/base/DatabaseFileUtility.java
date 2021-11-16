package com.restapi.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DatabaseFileUtility {
	private DatabaseFileUtility() {}
	private static DatabaseFileUtility dataBaseFileUtility=new DatabaseFileUtility();
	private static Properties properties;
	
	public static DatabaseFileUtility getInstance() {
		try {
			FileInputStream file=new FileInputStream(".\\src\\main\\resources\\DatabaseCredentials.properties");
			properties=new Properties();
			properties.load(file);
		} catch (FileNotFoundException e) {
			System.out.println("Database property file not found!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Not able to load the properties");
			e.printStackTrace();
		}
		return dataBaseFileUtility;
	}
	
	public String getDatabaseURL() {
		return properties.getProperty("DB_URL");
	}
	
	public String getDatabaseName() {
		return properties.getProperty("DATABASE_NAME");
	}
	
	public String getDatabaseUsername() {
		return properties.getProperty("USERNAME");
	}
	
	public  String getDataBasePassword() {
		return properties.getProperty("PASSWORD");
	}

}
