package com.MyStore.testCases;

import org.apache.poi.ss.formula.functions.Index;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.baseClass.BaseClass;
import com.MyStore.pageObjects.HomePage;
import com.MyStore.pageObjects.LoginPage;
import com.MyStore.pageObjects.indexPage;
import com.MyStore.pageObjects.searchResultPage;

public class SearchResultPageTestCase extends BaseClass{

	indexPage ip;
	HomePage hp;
	LoginPage lp;
	searchResultPage sp;

	@BeforeMethod
	public void setUp()
	{
		launchApplication();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void productAvailabilityTest()
	{
		ip = new indexPage();
		sp = ip.searchProduct("t-shirt");
		boolean result = sp.validateSearchProductDisplayed();
		Assert.assertTrue(result);	
		
	}

}
