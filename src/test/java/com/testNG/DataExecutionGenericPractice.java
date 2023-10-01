package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ZMS.genericUtiliti.ExcelUtility;

public class DataExecutionGenericPractice {

	@Test(dataProvider = "storedata")
	public void getdata(String name,String price,String size ) {
		System.out.println(name+price+size);
	}
	
	@DataProvider
	public Object[][] storedata() throws Throwable {
		Object[][] obj =new Object[3][2];
		ExcelUtility eLib =new ExcelUtility();
		obj =eLib.getMultipleDataFromDataProvider();
		
		return obj;
	}
}
