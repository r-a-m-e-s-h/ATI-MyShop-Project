package com.MyStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actionDriver.Action;
import com.MyStore.baseClass.BaseClass;

public class AddToCartPage extends BaseClass{
	
	public AddToCartPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a//span[text()='More']")
	WebElement Morebtn;
	
	public MorePage clickOnMoreBtn()
	{
		Action.click(driver, Morebtn);
		return new MorePage();
	}
	

}
