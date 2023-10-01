package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	@Test(dependsOnMethods = "sample2")
	public void sample() {
		System.out.println("TestScript---1");
	}
	
	@BeforeSuite
	public void configBS() {
		System.out.println("Before suite");
	}
	
	@BeforeClass
	public void configBC() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void configAC() {
		System.out.println("After class");
	}
	
	@AfterSuite
	public void configAS() {
		System.out.println("After suite");
	}
	
	@BeforeMethod
	public void configBM() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void configAM() {
		System.out.println("After method");
	}
	
	
	@Test
	public void sample2() {
		System.out.println("Test Script-2");
	}
	
	
	
}
