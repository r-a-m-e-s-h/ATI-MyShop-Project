package com.MyStore.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.baseClass.BaseClass;
import com.MyStore.pageObjects.AddToCartPage;
import com.MyStore.pageObjects.MorePage_Through_AddToCartPage;
import com.MyStore.pageObjects.indexPage;
import com.MyStore.pageObjects.searchResultPage;

public class AddToCartTestCase_MoreTC extends BaseClass {
	
	indexPage ip;
	searchResultPage sp;
	AddToCartPage acp;
	MorePage_Through_AddToCartPage mp;
	
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
	public void addToCartTest()
	{
		ip = new indexPage();
		sp = ip.searchProduct("t-shirt");
		acp = sp.hoverOnSearchProduct();
		
	}

}
