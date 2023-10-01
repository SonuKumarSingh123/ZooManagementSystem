package com.testNG;

import org.testng.annotations.Test;

public class SameClassExecution {

	@Test(dataProviderClass = DataProviderSameClassExecutionTest.class ,dataProvider = "storeData")
	public void getData(String name,int size) {
		System.out.println(name+" "+ size);
	}
}
