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
		LoggerClass.getLogger().info("successfully connected to database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void closeDataBaseConnection() {
		try {
			connection.close();
			LoggerClass.getLogger().info("database connection closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean executeQuery(String selectQuery, String dbcolumnName, String jsonData)  {
		boolean flag=false;
		try {
			LoggerClass.getLogger().info("Executing query: "+selectQuery+" fetching column: "+dbcolumnName+" expected data: "+jsonData);
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(selectQuery);
			while(result.next()) {
				String data=result.getString(dbcolumnName);
				if(data.equals(jsonData) && data!=null) {
					flag = true;
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void getDBColumnData(String query){
		try {
			Statement statement = connection.createStatement();

			ResultSet result = statement.executeQuery(query);
			while(result.next()){
				 result.getString(1);
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}

	}

}
