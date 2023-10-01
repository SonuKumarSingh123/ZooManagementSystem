package com.testNG;

import org.testng.annotations.Test;

import com.ZMS.genericUtiliti.BaseClass;

public class SimpleTest extends BaseClass {

	@Test(groups = {"smoke","Regression"})
	public void simple() {
		System.out.println("=====Simple====");
	}
}
