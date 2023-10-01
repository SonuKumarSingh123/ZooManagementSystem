package com.practicePackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Element {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//to find all column
		List<WebElement> columnlist = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		for (WebElement e : columnlist) {
			System.out.println(e.getText());
		}
		
		System.out.println(columnlist.size());
		
		//finding total row in a particular table
		
		 List<WebElement> rowlist = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
			/*
			 * for (WebElement e : rows) { System.out.println(e.getText()); }
			 * System.out.println(rows.size());
			 * 
			 * for(int row=2;row<=rows.size();row++) {
			 * 
			 * }
			 */
	for(int r=2;r<=rowlist.size();r++) {
		for(int c=1;c<=columnlist.size();c++) {
			String tdata = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
			
			
			System.out.print(tdata);
		
		}
		
		System.out.println();
	}
	driver.close();
	
	
	
	}
	

}
