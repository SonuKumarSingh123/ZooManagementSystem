package com.practicePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class UnselectQuery {

	public static void main(String[] args) throws Throwable {
		
		Connection con =null;
		Driver driver =new Driver();
		
		DriverManager.registerDriver(driver);
		
		con =DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel", "root", "root");
		
		Statement state = con.createStatement();
		
		String query ="insert into project values('API','Sachin','Bangalore',1);";
		
		int result = state.executeUpdate(query);
		
		if(result==1) {
			System.out.println("data is created");
		}
		
		else {
			System.out.println("data is not created");
		}
		
		con.close();

	}

}
