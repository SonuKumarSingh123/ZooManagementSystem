package com.zmsTestCases;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ZMS.ObjectRepo.AddAnimalDetailsPage;
import com.ZMS.ObjectRepo.HomePage;
import com.ZMS.ObjectRepo.LoginPage;
import com.ZMS.ObjectRepo.ManageAnimalPage;
import com.ZMS.ObjectRepo.UpdateAnimalDetailPage;
import com.ZMS.genericUtiliti.BaseClass;
import com.ZMS.genericUtiliti.ExcelUtility;
import com.ZMS.genericUtiliti.FileUtility;
import com.ZMS.genericUtiliti.JavaUtility;
import com.ZMS.genericUtiliti.WebdriverUtility;

@Listeners(com.ZMS.genericUtiliti.ListnerImpClass.class)
public class AddAnimalandManageAnimal_Test extends BaseClass {

	@Test(groups ="smoke")
	public void  AddAnimalandManageAnimal_Test() throws Throwable {
		
		//WebDriver driver =null;
		
	//Create Object of Generic utility class
		ExcelUtility eLib =new ExcelUtility();
		FileUtility fLib =new FileUtility();
		JavaUtility jLib =new JavaUtility();
		WebdriverUtility wLib =new WebdriverUtility();
		
	
		
		//Validate the page
		HomePage hp =new HomePage(driver);
		
		String exp1 ="Zoo Management System || Dashboard";
		String actual1 = driver.getTitle();
		Assert.assertEquals(exp1, actual1);
		System.out.println("Home page displayed");

		
		hp.clickAnimalsDetails_AddAnimal();
		
		String exp2 ="Add Animal Detail - Zoo Management System";
		String actual2 = driver.getTitle();
		Assert.assertEquals(exp2, actual2);
		System.out.println("Add Animal Details page opened");
	
		
		AddAnimalDetailsPage andp =new AddAnimalDetailsPage(driver);
		andp.enterTestData(eLib.getMultipleDataFromExcel("Add_Animal", 0, 1, driver, jLib), driver, wLib);
		
	
				
		hp.clickAnimalDetails_ManageAnimals();
		
		String exp3 ="Manage Animals - Zoo Management System";
		String actual3 = driver.getTitle();
		Assert.assertEquals(exp3, actual3);
		System.out.println("Manage Animals page displayed");
		
		//Assert.fail();
		
		
		
		
		ManageAnimalPage mApage =new ManageAnimalPage(driver);
		mApage.editManageAnimal();
				
		UpdateAnimalDetailPage uadp =new UpdateAnimalDetailPage(driver);
		uadp.enterTestData(eLib.getMultipleDataFromExcel("Manage_Animal", 0, 1, driver, jLib), driver);
				
	
				wLib.acceptAlert(driver);
				
				hp.clickAnimalDetails_ManageAnimals();
				
					
				
	}

}
