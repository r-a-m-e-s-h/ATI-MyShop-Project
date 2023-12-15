package com.MyStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actionDriver.Action;
import com.MyStore.baseClass.BaseClass;

public class searchResultPage extends BaseClass {
	
	public searchResultPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class=\"product_img_link\"]//following::img")
	WebElement searchResultProduct;
	
	@FindBy(xpath="//a//span[text()='More']")
	WebElement Morebtn;
	
	
	public boolean validateSearchProductDisplayed()
	{
		return Action.isDisplayed(driver, searchResultProduct);
	}
	public AddToCartPage hoverOnSearchProduct()
	{
		Action.moveToElement(driver, searchResultProduct);
		return new AddToCartPage();
	}
	
	
}
