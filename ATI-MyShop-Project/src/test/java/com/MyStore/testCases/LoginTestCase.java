package com.MyStore.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.baseClass.BaseClass;
import com.MyStore.pageObjects.HomePage;
import com.MyStore.pageObjects.LoginPage;
import com.MyStore.pageObjects.indexPage;

import Utility.Log;

public class LoginTestCase extends BaseClass{
	
	LoginPage lp;
	indexPage ip;
	HomePage hp;
	
	@BeforeMethod(groups= {"Smoke","Sanity"})
	public void setup()
	{
		launchApplication();
	}
	
	@Test(groups= {"Smoke","Sanity"})
	public void loginTest() throws InterruptedException
	{
		Log.startTestCase("loginTest");
		
		ip= new indexPage();
		
		Log.info("user is on index page");
		
		lp = ip.clickSigin();
		
		Log.info("user clicked on signin btn");
		
		hp=lp.login(properties.getProperty("UserName"), properties.getProperty("PassWord"));
		Log.info("user entered the login credentials");
	}
	
	
	@AfterMethod(groups= {"Smoke","Sanity"})
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
