package com.MyStore.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.baseClass.BaseClass;
import com.MyStore.pageObjects.AddToCartPage;
import com.MyStore.pageObjects.AddressPage;
import com.MyStore.pageObjects.LoginPage;
import com.MyStore.pageObjects.MorePage_Through_AddToCartPage;
import com.MyStore.pageObjects.OrderConfirmationPage;
import com.MyStore.pageObjects.OrderPage;
import com.MyStore.pageObjects.OrderSummaryPage;
import com.MyStore.pageObjects.PaymentPage;
import com.MyStore.pageObjects.ShippingPage;
import com.MyStore.pageObjects.indexPage;
import com.MyStore.pageObjects.searchResultPage;

public class EndToEndTest extends BaseClass{

	indexPage index;
	searchResultPage searchResult;
	AddToCartPage addtocart;
	MorePage_Through_AddToCartPage more_and_addtocart;
	OrderPage orderPage;
	LoginPage loginPage;
	AddressPage addressPage;
	ShippingPage ship;
	PaymentPage paymentPage;
	OrderSummaryPage orderSummary;
	OrderConfirmationPage orderConfirmation;
	

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
	public void endToendTest() throws InterruptedException
	{
		index =new indexPage();
		searchResult = index.searchProduct("t-shirt");
		addtocart = searchResult.hoverOnSearchProduct();
		more_and_addtocart = addtocart.clickOnMoreBtn();
		more_and_addtocart.enterQuantity("2");
		more_and_addtocart.SelctSize("L");
		more_and_addtocart.clickAddToCart();
		orderPage = more_and_addtocart.clickonCheckOutBtn();
		loginPage = orderPage.clickCheckOutBtn();
		addressPage =loginPage.login_For_AddressPage(properties.getProperty("UserName"), properties.getProperty("PassWord"));
		ship = addressPage.clickOnCheckOutBtn();
		ship.clicktermCheckBox();
		paymentPage = ship.clickOnCheckOutBtn();
		orderSummary = paymentPage.clickOnBankWireBtn();
		orderConfirmation = orderSummary.clickOnOrderConfirmBtn();
		String ActualMsg = orderConfirmation.ValidateOrderSuccessTxt();
		String expectedMsg = "Your order on My Shop is complete.";
		Assert.assertEquals(ActualMsg, expectedMsg);
		
		
		
		
		


	}
}
