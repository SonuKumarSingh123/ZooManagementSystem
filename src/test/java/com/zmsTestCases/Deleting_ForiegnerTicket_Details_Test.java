package com.zmsTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ZMS.ObjectRepo.ForeignersPage;
import com.ZMS.ObjectRepo.HomePage;
import com.ZMS.ObjectRepo.LoginPage;
import com.ZMS.ObjectRepo.ViewDetilsOfForeignersTicketPage;
import com.ZMS.genericUtiliti.BaseClass;
import com.ZMS.genericUtiliti.ExcelUtility;
import com.ZMS.genericUtiliti.FileUtility;
import com.ZMS.genericUtiliti.JavaUtility;
import com.ZMS.genericUtiliti.WebdriverUtility;

public class Deleting_ForiegnerTicket_Details_Test extends BaseClass {

	@Test
	public void Deleting_ForiegnerTicket_Details_Test(){

		// Create Object of Generic utility class
		ExcelUtility eLib = new ExcelUtility();
		FileUtility fLib = new FileUtility();
		JavaUtility jLib = new JavaUtility();
		WebdriverUtility wLib = new WebdriverUtility();

		

		// Validate the page
		HomePage hp = new HomePage(driver);
		
		String exp ="Zoo Management System || Dashboard";
		String actual = driver.getTitle();
		Assert.assertEquals(exp, actual);
		System.out.println("Home page displayed");


		ForeignersPage fp = new ForeignersPage(driver);
		fp.clickOnForeignersManagePage();
		
		//Assert.fail();

		ViewDetilsOfForeignersTicketPage vdfpage = new ViewDetilsOfForeignersTicketPage(driver);
		vdfpage.deleteForeignersTicket(driver);

		//fp.validateDeleteForeignersTicket(driver);
		
		String exp1 ="Manage Ticket - Zoo Management System";
		String actual1 = driver.getTitle();
		Assert.assertEquals(exp1, actual1);
		System.out.println("Ticket has successfully deleted");

	

	}

}
