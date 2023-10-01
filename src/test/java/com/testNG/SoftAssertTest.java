package com.testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	@Test
	public void softassertTest() {
		String exp ="Login - Zoo Management System";
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://rmgtestingserver/domain/Zoo_Management_System/admin/index.php");
		String actual = driver.getTitle();
		System.out.println(actual);
		
		SoftAssert sa =new SoftAssert();
		//sa.assertEquals(actual, exp);
		//sa.assertNotEquals(actual, exp);
		//sa.assertTrue(false);
		//sa.assertTrue(true);
		int m=5;
		//sa.assertNull(m);
		
		
		
		
		System.out.println("application launched");
		System.out.println("Execution completed");
		
		sa.assertAll();
	}
}
