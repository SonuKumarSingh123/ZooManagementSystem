package com.practicePackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JioMartGrocessary {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiomart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		WebElement grocessary = driver.findElement(By.xpath("//ul[@class='header-nav-l1 custom-scrollbar']/descendant::a[text()='Groceries']"));
	
		Actions a =new Actions(driver);
		a.moveToElement(grocessary).perform();
		
		WebElement fruit_veg = driver.findElement(By.xpath("//a[text()='Fruits & Vegetables']"));
		a.moveToElement(fruit_veg).perform();
		

		String element = driver.findElement(By.xpath("//ul[@class='header-nav-l3 custom-scrollbar']")).getText();
		
		System.out.println(element);
		
		System.out.println("==================================");
		WebElement dairy_baikary = driver.findElement(By.xpath("//a[.='Dairy & Bakery']"));		
		
		a.moveToElement(dairy_baikary).perform();
		
		
		String element1 = driver.findElement(By.xpath("//li[@id='nav_sub_cat_61']/descendant::ul[@class='header-nav-l3 custom-scrollbar']")).getText();
		System.out.println(element1);
		
		
		driver.close();
	}

}
