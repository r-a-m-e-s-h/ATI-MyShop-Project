package com.MyStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actionDriver.Action;
import com.MyStore.baseClass.BaseClass;

public class AddressPage extends BaseClass {
	
	public AddressPage() {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	WebElement checkOutBtn;
	
	public ShippingPage clickOnCheckOutBtn()
	{
		Action.click(driver, checkOutBtn);
		return new ShippingPage();
	}

}
