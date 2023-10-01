package com.practicePackage;

import java.awt.Point;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonName_PricePrint_Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-text")).click();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Brand']"));
		
		org.openqa.selenium.Point l =element.getLocation();
		
		int x =l.getX();
		int y =l.getY();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@aria-label='Samsung']//i")).click();
		
		List<WebElement> mobile = driver.findElements(By.xpath("//span[@class='a-price-whole'][number(translate(text(),'₹,',' '))<20000]"));
		
		for (WebElement m : mobile) {
			
			System.out.println(m.getText());
			
		}
		

		driver.close();
	}

}
