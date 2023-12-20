package com.MyStore.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.baseClass.BaseClass;
import com.MyStore.pageObjects.AddToCartPage;
import com.MyStore.pageObjects.MorePage_Through_AddToCartPage;
import com.MyStore.pageObjects.OrderPage;
import com.MyStore.pageObjects.indexPage;
import com.MyStore.pageObjects.searchResultPage;

public class OrderPageTestCase extends BaseClass{

	indexPage ip;
	searchResultPage sp;
	AddToCartPage acp;
	MorePage_Through_AddToCartPage mp;
	OrderPage op;

	@BeforeMethod(groups="Regression")
	public void setup()
	{
		launchApplication();
	}
	@AfterMethod(groups="Regression")
	public void tearDown()
	{
		driver.quit();
	}
	@Test(groups="Regression")
	public void verifyPriceTest() throws InterruptedException
	{
		ip =new indexPage();
		sp = ip.searchProduct("t-shirt");
		acp = sp.hoverOnSearchProduct();
		mp = acp.clickOnMoreBtn();
		mp.enterQuantity("2");
		mp.SelctSize("L");
		mp.clickAddToCart();
		
		op = mp.clickonCheckOutBtn();
		
		double unitPrice = op.getUnitPrice();
				
		double totalPrice = op.getTotalPrice();
				
		double expectedTotalPrice = (unitPrice*2)+7; 
		//double expectedTotalPrice = 0.41;
		Assert.assertEquals(totalPrice,expectedTotalPrice);

		op.clickCheckOutBtn();



	}
	
	

}
