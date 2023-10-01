package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ZMS.genericUtiliti.ExcelUtility;

public class DataExecutionGeneric {

	@DataProvider
	public Object[][] Data() throws Throwable {
		ExcelUtility eLib =new ExcelUtility();
		return eLib.getMultipleDataFromDataProvider();
		//return value;
	}
	
	
	@Test(dataProvider = "Data")
	public void getdata(String name,String price,String size) {
		System.out.println(name+"  "+price+"  "+size);
	}
}
