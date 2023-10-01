package com.testNG;

import  org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {

	@Test
	public void hardassert1() {
		int m =5;

		System.out.println("=====Step-1=====");
		System.out.println("=====Step-2=====");
		
		//Assert.assertEquals("A", "A");
		//Assert.assertNotEquals(5, 5, "5 is not equal to 5");
		//Assert.assertNull(m, "value is found");
		//Assert.assertNull(m);
		//Assert.assertTrue(true);
		//Assert.fail();
		
		Assert.assertFalse(true);
		
		System.out.println("=====Step-3=====");
		System.out.println("=====Step-4=====");
		
		
	}
	
	@Test
	public void hearassert2() {
		System.out.println("=====Step-5=====");
		System.out.println("=====Step-6=====");
		
		
		//Assert.assertEquals("A", "A");
		//Assert.assertNotEquals(5, 5, "5 is not equal to 5");
		//Assert.assertNull(m, "value is found");
		//Assert.assertNull(m);
		//Assert.assertTrue(true);
		//Assert.fail();
		
		Assert.assertFalse(true);
		
		System.out.println("=====Step-7=====");
		System.out.println("=====Step-8=====");
	}
}
