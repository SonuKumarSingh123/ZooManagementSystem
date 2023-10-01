package com.testNG;

import org.testng.annotations.Test;

public class DataProviderExecution {

	@Test(dataProviderClass = ReadDataPrividerFromExcelPracticeTest.class,dataProvider = "storedata")
	public void getData(String name,String price,String size) {
		System.out.println(name+"------>"+price+"------>"+size);
	}
	
}
