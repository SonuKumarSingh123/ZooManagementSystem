package com.zmsTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
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

import com.ZMS.ObjectRepo.HomePage;
import com.ZMS.ObjectRepo.LoginPage;
import com.ZMS.ObjectRepo.ManageTypeTicket_ViewDetailsOfTicketPage;
import com.ZMS.ObjectRepo.UpdateTicketTypeManageTypeTicketPage;
import com.ZMS.genericUtiliti.BaseClass;
import com.ZMS.genericUtiliti.ExcelUtility;
import com.ZMS.genericUtiliti.FileUtility;
import com.ZMS.genericUtiliti.JavaUtility;
import com.ZMS.genericUtiliti.WebdriverUtility;

public class ManageTypeTicket_Test extends BaseClass {

	@Test
	public void ManageTypeTicket_Test() throws Throwable, Throwable{
		
		ExcelUtility eLib =new ExcelUtility();
		FileUtility fLib =new FileUtility();
		JavaUtility jLib =new JavaUtility();
		WebdriverUtility wLib =new WebdriverUtility();
		
		
		
		//Validate the Home page
		HomePage hp =new HomePage(driver);
		
		String exp ="Zoo Management System || Dashboard";
		String actual = driver.getTitle();
		Assert.assertEquals(exp, actual);
		System.out.println("Home page displayed");

		
		hp.clickManageTypeTicket();
		
		
		ManageTypeTicket_ViewDetailsOfTicketPage mtp =new ManageTypeTicket_ViewDetailsOfTicketPage(driver);
		
		mtp.validateViewTktPage(driver);
		
		mtp.clickOnEdit();
		
		
		
		UpdateTicketTypeManageTypeTicketPage utp =new UpdateTicketTypeManageTypeTicketPage(driver);
		utp.enterTestData(eLib.readDataFromExcel(driver, "Manage Type Ticket", 1, 1),driver);
		
		
		//validate the update
		
		
		utp.validate(driver);
				
		

}
	}
