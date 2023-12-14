package com.MyStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actionDriver.Action;
import com.MyStore.baseClass.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()=\"Order history and details\"]")
	WebElement orderHistory;
	
	@FindBy(xpath="//span[text()=\"My personal information\"]")
	WebElement personalInformation;
	
	public boolean validateoderHistoryIsDisplayed()
	{
		return Action.isDisplayed(driver, orderHistory);
	}
	public boolean validatepersonalInformationIsDisplayed()
	{
		return Action.isDisplayed(driver, personalInformation);
	}

}
