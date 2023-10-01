package com.practicePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpPractice {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/Zoo_Management_System/admin/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.id("form_submit")).click();
		driver.findElement(By.xpath("//span[text()='Animals Details']")).click();
		driver.findElement(By.xpath("//a[@href='manage-animals.php']")).click();
		driver.findElement(By.xpath("//div[@class='data-tables']/descendant::tbody[2]/descendant::a[text()='Edit']")).click();
		driver.findElement(By.id("aname")).sendKeys("GiraffeLion1");
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		Alert a =driver.switchTo().alert();
		if(a.getText().contains("Animal detail has been Updated")) {
			System.out.println("Animal details updated");
		}
		else {
			System.out.println("Animal details has not updated");
		}
		a.accept();

	}

}
