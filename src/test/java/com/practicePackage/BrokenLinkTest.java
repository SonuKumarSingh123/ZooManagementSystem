package com.practicePackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To get all links
		
		List<WebElement> listlinks = driver.findElements(By.xpath("//a"));
		System.out.println(listlinks.size());
		
		ArrayList<String> link =new ArrayList<String>();//empty arraylist
		for(int i=0;i<listlinks.size();i++) {
			
			String eachlink = listlinks.get(i).getAttribute("href");
			
			URL url =null;
			int statusCode =0;
			try {
				
				url =new URL(eachlink);
				
				HttpURLConnection httpconn =(HttpURLConnection) url.openConnection();
				
				statusCode =httpconn.getResponseCode();
				
				if(statusCode>400) {
					
					 link.add(eachlink+"-----"+statusCode); 
					System.out.println(eachlink+"---"+statusCode);
				}
				
			} catch (Exception e) {
				link.add(eachlink); 
				
				
			}
			System.out.println(link+"----"+"unbrokenlinks");
		}
		
	}

}
