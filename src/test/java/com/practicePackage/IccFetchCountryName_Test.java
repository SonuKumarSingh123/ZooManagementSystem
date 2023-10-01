package com.practicePackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IccFetchCountryName_Test {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/homepage");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.xpath("//div[@class='main-navigation__header u-hide-desktop']/descendant::button[contains(text(),' Rankings')]")).click();
		driver.findElement(By.xpath("(//a[@href='/rankings/mens/team-rankings'])[1]")).click();
		List<WebElement> rank = driver.findElements(By.xpath("//table/tbody/tr[*]/td[3][@class='table-body__cell u-center-text' and text()<40]"));
	
		List<WebElement> countryName = driver.findElements(By.xpath("//table/tbody/tr[*]/td[2]"));
		
		for (WebElement r : rank ) {
			
			System.out.println(r.getText());
			
		}
	
	}

}
