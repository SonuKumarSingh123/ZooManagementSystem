package com.zmsTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ZMS.ObjectRepo.HomePage;
import com.ZMS.ObjectRepo.LoginPage;
import com.ZMS.ObjectRepo.ManageAnimalPage;
import com.ZMS.genericUtiliti.BaseClass;
import com.ZMS.genericUtiliti.ExcelUtility;
import com.ZMS.genericUtiliti.FileUtility;
import com.ZMS.genericUtiliti.JavaUtility;
import com.ZMS.genericUtiliti.WebdriverUtility;

public class AnimalDetailsDeleteAnimal_Test extends BaseClass {

	@Test(groups = "smoke")
	public void AnimalDetailsDeleteAnimal_Test(){
		
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

		
		hp.clickAnimalDetails_ManageAnimals();
		
		//Assert.fail();
		
		//Validate the manage page
		ManageAnimalPage map =new ManageAnimalPage(driver);
		//map.validateManagePage(driver);
		String exp2 ="Manage Animals - Zoo Management System";
		String actual2 = driver.getTitle();
		Assert.assertEquals(exp2, actual2);
		System.out.println("Manage Animals page displayed");
		
		
		//delete any animal
		
		ManageAnimalPage mApage =new ManageAnimalPage(driver);
		mApage.deleteManageBtn(driver);
		
		
		
		
		

	}

}
