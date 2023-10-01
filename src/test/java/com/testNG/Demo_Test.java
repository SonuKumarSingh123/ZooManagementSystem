package com.testNG;

import org.testng.annotations.Test;

import com.ZMS.genericUtiliti.BaseClass;

public class Demo_Test extends BaseClass {

	@Test(groups = "smoke")
	public void demo() {
		System.out.println("====demo====");
	}
}
