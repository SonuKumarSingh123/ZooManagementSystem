package com.testNG;

import org.testng.annotations.Test;

import com.ZMS.genericUtiliti.BaseClass;

public class SampleTest extends BaseClass {

	@Test(groups = "Regression")
	public void sample() {
		System.out.println("====sample====");
	}
}
