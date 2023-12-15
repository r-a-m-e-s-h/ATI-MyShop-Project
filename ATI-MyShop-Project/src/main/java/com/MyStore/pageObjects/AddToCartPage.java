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
	
	@FindBy(xpath="//a[@class=\"product_img_link\"]//following::img")
	WebElement searchResultProduct;

	
	
	
	public AddToCartPage clickOnSearchResultProduct()
	{
		Action.click(driver, searchResultProduct);
		return new AddToCartPage();
	}
	
	public MorePage_Through_AddToCartPage clickOnMoreBtn()
	{
		Action.click(driver, Morebtn);
		return new MorePage_Through_AddToCartPage();
	}
	

}
