package com.practicePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpiceJetTicketBookTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		//WebDriver driver =new FirefoxDriver();
		String monthYear ="September 2023";
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='round trip']")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[text()='Kempegowda International Airport']")).click();
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();
		driver.findElement(By.xpath("//div[text()='Indira Gandhi International Airport']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
		
		driver.findElement(By.xpath("//div[text()='Return Date']")).click();
		
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-October-2023']/descendant::div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']/../../descendant::div[text()='5']")).click();
		
		
		//driver.close();
		
		
		

	}

}
