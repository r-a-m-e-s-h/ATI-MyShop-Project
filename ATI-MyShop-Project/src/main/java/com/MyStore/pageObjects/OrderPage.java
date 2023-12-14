package com.MyStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actionDriver.Action;
import com.MyStore.baseClass.BaseClass;

public class OrderPage extends BaseClass {
	
	public OrderPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//tr[@id='product_1_1_0_0']//ul/li")
	WebElement unitPrice;
	
	@FindBy(xpath="//span[@id='total_price']")
	WebElement totalPrice;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	WebElement proceedtoCheckOutBtn;
	
	public double getUnitPrice()
	{
		String unitprice1 = unitPrice.getText();
		String price = unitprice1.replaceFirst("[^a-zA-Z0-9]", "");
		double finalunitprice = Double.parseDouble(price);
		return finalunitprice/100;
		
	}
	public double getTotalPrice()
	{
		String totalprice1 = totalPrice.getText();
		String price = totalprice1.replaceFirst("[^a-zA-Z0-9]", "");
		double finalunitprice = Double.parseDouble(price);
		return finalunitprice/100;
	}
	public LoginPage clickCheckOutBtn()
	{
		 Action.click(driver, proceedtoCheckOutBtn);
		 return new LoginPage();
	}
}
