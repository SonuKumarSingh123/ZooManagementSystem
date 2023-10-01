package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "tv")
	public void getData(String name,int price, String size) {
		System.out.println(name +"---------->"+price+"------------>"+size);
	}
	
	@DataProvider
	public Object[][] mobile() {
		Object[][] obj = new Object[2][2];
		
		obj[0][0] ="Realme";
		obj[0][1] =15987;
		
		obj[1][0] ="Nokia";
		obj[1][1] =12523;
		
		return obj;
	}
	
	@DataProvider
	public Object[][] tv() {
		Object[][] obj = new Object[2][3];
		
		obj[0][0] ="LG";
		obj[0][1] =254364;
		obj[0][2] ="55 inch";
		
		obj[1][0] ="Sony";
		obj[1][1] =25436423;
		obj[1][2] ="90 inch";
		
		return obj;
	}
}
