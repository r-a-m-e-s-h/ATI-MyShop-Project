package com.MyStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actionDriver.Action;
import com.MyStore.baseClass.BaseClass;

public class PaymentPage extends BaseClass{

	public PaymentPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Pay by bank wire')]")
	WebElement bankWireBtn;
	
	public OrderSummaryPage clickOnBankWireBtn()
	{
		Action.click(driver, bankWireBtn);
		return new OrderSummaryPage();
	}

}
