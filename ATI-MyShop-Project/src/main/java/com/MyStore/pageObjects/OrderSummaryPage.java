package com.MyStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actionDriver.Action;
import com.MyStore.baseClass.BaseClass;

public class OrderSummaryPage extends BaseClass{
	
	public OrderSummaryPage() {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	WebElement orderConfirmBtn;
	
	public  OrderConfirmationPage clickOnOrderConfirmBtn()
	{
		Action.click(driver, orderConfirmBtn);
		return new OrderConfirmationPage();
	}

}
