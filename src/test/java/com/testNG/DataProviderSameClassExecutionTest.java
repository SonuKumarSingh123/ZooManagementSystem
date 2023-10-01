package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSameClassExecutionTest {

	@DataProvider
	public Object[][] storeData() {
		Object[][] obj =new Object[2][2];
		
		obj[0][0] ="Mobile";
		obj[0][1] =43426;
		
		obj[1][0] ="Bike";
		obj[1][1]=3422;
		
		return obj;
		
	}
	
	
	@DataProvider
	public Object[][] dataStore() {
		Object[][] obj =new Object[3][2];
		obj[0][0]="Shoes";
		obj[0][1]="Rebook";
		
		obj[1][0]="Shirts";
		obj[1][1]="peterengland";
		
		obj[2][0]="Jeans";
		obj[2][1]="Lee";
		
		return obj;
	}
	
	@Test(dataProvider = "dataStore")
	public void getData(String name,String brand) {
		System.out.println(name +"  "+brand);
	}
	
	
}
