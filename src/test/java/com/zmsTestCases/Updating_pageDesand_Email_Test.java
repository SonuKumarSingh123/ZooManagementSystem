package com.zmsTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ZMS.ObjectRepo.ContactUsPage;
import com.ZMS.ObjectRepo.HomePage;
import com.ZMS.ObjectRepo.LoginPage;
import com.ZMS.genericUtiliti.BaseClass;
import com.ZMS.genericUtiliti.ExcelUtility;
import com.ZMS.genericUtiliti.FileUtility;
import com.ZMS.genericUtiliti.JavaUtility;
import com.ZMS.genericUtiliti.WebdriverUtility;

public class Updating_pageDesand_Email_Test extends BaseClass{

	@Test
	public void  Updating_pageDesand_Email_Test() throws Throwable {
		
		
		ExcelUtility eLib =new ExcelUtility();
		FileUtility fLib =new FileUtility();
		JavaUtility jLib =new JavaUtility();
		WebdriverUtility wLib =new WebdriverUtility();
		
		
		
		
		//Validate the page
		
		HomePage hp =new HomePage(driver);
		
		String exp ="Zoo Management System || Dashboard";
		String actual = driver.getTitle();
		Assert.assertEquals(exp, actual);
		System.out.println("Home page displayed");

	
		hp.clickOnPage_ContactUs();
		
		
				
		ContactUsPage cup =new ContactUsPage(driver);
		
		cup.clearTxt();
		eLib.getMultipleDataFromExcel("ContactUs", 0, 1, driver, jLib);
		
		
		
		

		cup.validate(driver);
						
		
		

	}

}
