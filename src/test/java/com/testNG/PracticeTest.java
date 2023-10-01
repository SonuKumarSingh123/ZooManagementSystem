package com.testNG;

import org.testng.annotations.Test;

public class PracticeTest {

	@Test(invocationCount = 2)
	public void create() {
		System.out.println("=======data  created======");
	}
	
	@Test()
	public void edit() {
		System.out.println("======data edited======");
	}
	
	@Test(priority = 1,invocationCount = 0)
	public void deleted() {
		
		System.out.println("=====data deleted=======");
	}
	
}
