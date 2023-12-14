package com.MyStore.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.baseClass.BaseClass;
import com.MyStore.pageObjects.AccountCreationPage;
import com.MyStore.pageObjects.HomePage;
import com.MyStore.pageObjects.LoginPage;
import com.MyStore.pageObjects.indexPage;

public class AccountCreationPageTestCase extends BaseClass{
	
	AccountCreationPage ac;
	indexPage ip;
	LoginPage lp;
	
	
	
	@BeforeMethod
	public void setup()
	{
		launchApplication();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void verifyAccountCreationTest()
	{
		ip = new indexPage();
		lp = ip.clickSigin();
		ac = lp.createNewUserAccount("testPractise@test.com");
		boolean result = ac.validateHeader();
		Assert.assertTrue(result);
	}

}
