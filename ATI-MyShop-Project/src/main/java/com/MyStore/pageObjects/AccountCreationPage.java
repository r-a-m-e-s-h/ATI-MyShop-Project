package com.MyStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actionDriver.Action;
import com.MyStore.baseClass.BaseClass;

public class AccountCreationPage extends BaseClass {
	
	public AccountCreationPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[text()=\"Create an account\"]")
	WebElement formhHeader;
	
	public boolean validateHeader()
	{
		return Action.isDisplayed(driver, formhHeader);
	}

}
