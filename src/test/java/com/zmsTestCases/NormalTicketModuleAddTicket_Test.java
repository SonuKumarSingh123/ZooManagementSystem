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

import com.ZMS.ObjectRepo.AddNormalZooTicketPage;
import com.ZMS.ObjectRepo.HomePage;
import com.ZMS.ObjectRepo.LoginPage;
import com.ZMS.ObjectRepo.UpdateTicketTypeManageTypeTicketPage;
import com.ZMS.genericUtiliti.BaseClass;
import com.ZMS.genericUtiliti.ExcelUtility;
import com.ZMS.genericUtiliti.FileUtility;
import com.ZMS.genericUtiliti.JavaUtility;
import com.ZMS.genericUtiliti.WebdriverUtility;

public class NormalTicketModuleAddTicket_Test extends BaseClass {

		@Test
		public void NormalTicketModuleAddTicket_Test() throws Throwable{
		
		
		
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

				
				hp.clickNormalTicket_AddTicket();
				
				//validate Add normal zoo ticket page
				
				AddNormalZooTicketPage anztp =new AddNormalZooTicketPage(driver);
				
				anztp.validate(driver);
				anztp.enterTestData(eLib.getMultipleDataFromExcel("Add_Ticket", 0, 1, driver, jLib), driver, wLib);
				
				
				UpdateTicketTypeManageTypeTicketPage utmtp =new UpdateTicketTypeManageTypeTicketPage(driver);
				utmtp.validateTktGenerated(driver);
				
						
				
	}

}
