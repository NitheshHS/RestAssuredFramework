package com.restapi.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
	private static Connection connection;
	public static void getDataBaseConnection()  {
		try {
			DatabaseFileUtility database = DatabaseFileUtility.getInstance();
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection(database.getDatabaseURL()+database.getDatabaseName(), database.getDatabaseUsername(), database.getDataBasePassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void closeDataBaseConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean executeQuery(String selectQuery, String dbcolumnName, String jsonData)  {
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(selectQuery);
			while(result.next()) {
				String data=result.getString(dbcolumnName);
				if(data.equals(jsonData)) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
