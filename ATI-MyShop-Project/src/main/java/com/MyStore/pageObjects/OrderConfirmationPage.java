package com.MyStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actionDriver.Action;
import com.MyStore.baseClass.BaseClass;

public class OrderConfirmationPage extends BaseClass {

	public OrderConfirmationPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,  this);
	}

	@FindBy(xpath="//*[text()='Your order on My Shop is complete.']")
	WebElement orderSuccessText;

	public String ValidateOrderSuccessTxt()
	{
		String txt = orderSuccessText.getText();
		return txt;
	}

}
