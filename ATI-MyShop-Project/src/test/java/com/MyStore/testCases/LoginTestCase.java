package com.MyStore.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.baseClass.BaseClass;
import com.MyStore.pageObjects.HomePage;
import com.MyStore.pageObjects.LoginPage;
import com.MyStore.pageObjects.indexPage;

public class LoginTestCase extends BaseClass{
	
	LoginPage lp;
	indexPage ip;
	HomePage hp;
	
	@BeforeMethod(groups={"Sanity","Smoke"})
	public void setup()
	{
		launchApplication();
	}
	
	@Test(groups={"Sanity","Smoke"})
	public void loginTest() throws InterruptedException
	{
		
		logger.info("In the Index page");
		
		ip= new indexPage();
		lp = ip.clickSigin();
		logger.info("clicked on the sign in btn");
		hp=lp.login(properties.getProperty("UserName"), properties.getProperty("PassWord"));
		logger.info("Entered the username and password ");
		
	}
	
	
	@AfterMethod(groups={"Sanity","Smoke"})
	public void tearDown()
	{
		driver.quit();
		logger.info("closed browser");
	}
	
	

}
