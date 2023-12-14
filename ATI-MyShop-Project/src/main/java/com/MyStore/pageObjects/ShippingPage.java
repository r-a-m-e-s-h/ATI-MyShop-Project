package com.MyStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actionDriver.Action;
import com.MyStore.baseClass.BaseClass;

public class ShippingPage  extends BaseClass{

	public ShippingPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='cgv']")
	WebElement termsCheckBox;
	
	@FindBy(xpath="//button//span[contains(text(),'Proceed to checkout')]")
	WebElement checkoutBtn;
	
	public void clicktermCheckBox()
	{
		Action.click(driver, termsCheckBox);
	}
	public PaymentPage clickOnCheckOutBtn()
	{
		Action.click(driver, checkoutBtn);
		return new PaymentPage();
	}
}
