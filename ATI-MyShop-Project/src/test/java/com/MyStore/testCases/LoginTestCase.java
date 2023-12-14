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
	
	@BeforeMethod
	public void setup()
	{
		launchApplication();
	}
	
	@Test
	public void loginTest() throws InterruptedException
	{
		ip= new indexPage();
		lp = ip.clickSigin();
		hp=lp.login(properties.getProperty("UserName"), properties.getProperty("PassWord"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
