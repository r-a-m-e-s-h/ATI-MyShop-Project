package com.MyStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actionDriver.Action;
import com.MyStore.baseClass.BaseClass;

public class MorePage extends BaseClass{
	
	public MorePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement checkOutBtn;
	
	@FindBy(xpath="//a//span[text()='More']")
	WebElement Morebtn;
	
	@FindBy(xpath="//input[@id='quantity_wanted']")
	WebElement quantity;
	
	@FindBy(xpath="//*[@id='group_1']")
	WebElement size;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]//h2/i")
	WebElement successMsg;
	
	public void enterQuantity(String required)
	{
		Action.type(Morebtn, required);
	}
	public void SelctSize(String Requiredsize)
	{
		Action.SelectByValue(size, Requiredsize);
	}
	public AddToCartPage clickAddToCart()
	{
		Action.click(driver, addToCartBtn);
		return new AddToCartPage();
	}
	public boolean validateAddtoCArtSuccessMsg()
	{
		return Action.isDisplayed(driver, successMsg);
	}
	public OrderPage clickonCheckOutBtn()
	{
		 Action.click(driver, checkOutBtn);
		 return new OrderPage();
	}
	
	

}
