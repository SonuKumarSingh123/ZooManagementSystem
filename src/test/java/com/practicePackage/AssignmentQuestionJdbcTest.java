package com.practicePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class AssignmentQuestionJdbcTest {

	public static void main(String[] args) throws Throwable {
		Connection con=null;
		Driver driver =new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel", "root", "root");
		
		Statement stmt = con.createStatement();
		
		  Scanner sc =new Scanner(System.in);
		  System.out.println("Enter the name");
		  String name = sc.next();
		  int count =0;
		  String query1="select name from tyss;";
		  String query2 ="insert into tyss(name) values('"+name+"');";
		 
		ResultSet result = stmt.executeQuery(query1);
		while(result.next()) {
			String name1 = result.getString(1);
			if(name1.equalsIgnoreCase(name)) {
				System.out.println("Name is present in data base"+name);
				count++;
				break;
			}
		}
		
		
		int result2=0;
		if(count==0) {
			result2=stmt.executeUpdate(query2);
		}
		if(result2>0) {
			System.out.println(name+"name has been added to database");
		}
		System.out.println();
		String query3 = "select * from tyss order by id;";
		ResultSet result3 = stmt.executeQuery(query3);
		System.out.println("table got updated");
		while(result3.next()) {
			System.out.println(result3.getString(1)+" "+result3.getString(2));
		}
		con.close();
		sc.close();
	}

}
