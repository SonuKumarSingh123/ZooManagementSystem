package com.practicePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDataPropertFile_Test {

	public static void main(String[] args) throws Throwable {
		Properties p =new Properties();
		p.setProperty("browser", "chrome");
		p.setProperty("url", "http://rmgtestingserver/domain/Zoo_Management_System/admin/index.php");
		p.setProperty("username", "admin");
		p.setProperty("password", "Test@123");
		
		FileOutputStream fos =new FileOutputStream(".\\src\\test\\resources\\CommonData.properties");
		p.store(fos, "write data successfully");
		System.out.println("Write data sucessfully");
		
		//Reading data from property file
		
		FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		p.load(fis);
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		//Launch the browser
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("form_submit")).click();

	}

}
