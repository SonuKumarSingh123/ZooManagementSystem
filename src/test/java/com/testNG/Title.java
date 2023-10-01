package com.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Zoo_Management_System/admin/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.id("form_submit")).click();
		//driver.get("http://rmgtestingserver/domain/Zoo_Management_System/admin/add-animals.php");
		//String value = driver.getTitle();
		//System.out.println(value);
		
		/*
		 * driver.get(
		 * "http://rmgtestingserver/domain/Zoo_Management_System/admin/manage-animals.php"
		 * ); String value1 = driver.getTitle(); System.out.println(value1);
		 */
		
		driver.get("http://rmgtestingserver/domain/Zoo_Management_System/admin/manage-foreigners-ticket.php");
		String value = driver.getTitle();
		System.out.println(value);
		
		//driver.quit();

	}

}
