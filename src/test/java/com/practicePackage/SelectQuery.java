package com.practicePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQuery {

	public static void main(String[] args) throws Throwable {
	
		Connection con =null;
		
		try {
			
			Driver driver =new Driver();
			
			//step:1 Register the database
			DriverManager.registerDriver(driver);
			
			//step:2 get connection for database
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel", "root", "root");
				
			//step:3 create statement
			Statement state = con.createStatement();
			String query = "select * from project;";
			
			//step:4 Execute query/update query
			ResultSet result = state.executeQuery(query);
			while(result.next()) {
				
				System.out.println(result.getString(1)+ "  "+result.getString(2)+ "  "+result.getString(3)+ "  "+result.getString(4));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		finally {
			con.close();
		}

	}

}
