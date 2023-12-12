package com.MyStore.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.actionDriver.Action;
import com.MyStore.baseClass.BaseClass;
import com.MyStore.pageObjects.indexPage;

public class indexTestCase extends BaseClass{
	
	indexPage ip;
	
	@BeforeMethod
	public void setup()
	{
		launchApplication();
	}
	
	@Test
	public void validateLogo()
	{
		ip =  new indexPage();			
		boolean result = ip.validateLogo();
		Assert.assertTrue(result);	
	}
	@Test
	public void verifyTitle()
	{
		ip =  new indexPage();
		String title = ip.getTitle();
		Assert.assertEquals(title, "My Shop");
	}
	
	@AfterMethod
	public void tearDown()
	{
		Action.quit(driver);
	}
	

}