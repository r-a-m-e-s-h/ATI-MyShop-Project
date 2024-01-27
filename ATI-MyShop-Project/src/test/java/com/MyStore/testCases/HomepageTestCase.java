package com.MyStore.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.baseClass.BaseClass;
import com.MyStore.pageObjects.HomePage;
import com.MyStore.pageObjects.LoginPage;
import com.MyStore.pageObjects.indexPage;

public class HomepageTestCase extends BaseClass{
	
	indexPage ip;
	LoginPage lp;
	HomePage hp;
	
	@BeforeMethod(groups="Smoke")
	public void setup()
	{
		launchApplication();
	}
	@AfterMethod(groups="Smoke")
	public void tearDown()
	{
		driver.quit();
	}
	@Test(groups="Smoke")
	public void oderHistoryTest()
	{
		ip =new indexPage();
		lp = ip.clickSigin();
		hp = lp.login(properties.getProperty("UserName"), properties.getProperty("PassWord"));
		boolean result = hp.validateoderHistoryIsDisplayed();
		Assert.assertTrue(result);
	}
	@Test
	public void personalInformationTest()
	{
		ip =new indexPage();
		lp = ip.clickSigin();
		hp = lp.login(properties.getProperty("UserName"), properties.getProperty("PassWord"));
		boolean result = hp.validatepersonalInformationIsDisplayed();
		Assert.assertTrue(result);
	}
	

}
