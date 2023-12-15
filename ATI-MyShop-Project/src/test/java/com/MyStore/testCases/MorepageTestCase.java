package com.MyStore.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.baseClass.BaseClass;
import com.MyStore.pageObjects.AddToCartPage;
import com.MyStore.pageObjects.MorePage_Through_AddToCartPage;
import com.MyStore.pageObjects.indexPage;
import com.MyStore.pageObjects.searchResultPage;

public class MorepageTestCase extends BaseClass{
	
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
	public void MorePageTest() throws InterruptedException
	{
		ip =new indexPage();
		sp = ip.searchProduct("t-shirt");
		acp = sp.hoverOnSearchProduct();
		mp = acp.clickOnMoreBtn();
		mp.enterQuantity("1");
		mp.SelctSize("L");
		mp.clickAddToCart();
		boolean result = mp.validateAddtoCArtSuccessMsg();
		Assert.assertTrue(result);
	}

}
