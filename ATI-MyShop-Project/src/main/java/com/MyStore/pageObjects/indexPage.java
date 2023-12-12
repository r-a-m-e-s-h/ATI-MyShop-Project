package com.MyStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actionDriver.Action;
import com.MyStore.baseClass.BaseClass;

public class indexPage extends BaseClass{
	
	public indexPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),\"Sign in\")]")
	WebElement signinBtn;
	
	@FindBy(xpath="//img[@class=\"logo img-responsive\"]")
	WebElement logo;
	
	@FindBy(xpath="//input[@id=\"search_query_top\"]")
	WebElement serchBar;
	
	@FindBy(xpath="//button[@name=\"submit_search\"]")
	WebElement searchBtn;
	
	public LoginPage clickSigin()
	{
		Action.click(driver, signinBtn);
		return new LoginPage();
	}
	public boolean validateLogo() {
		return Action.isDisplayed(driver, logo);
	}
	public String getTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	public searchResultPage searchProduct(String txt)
	{
		Action.type(serchBar, txt);
		Action.click(driver, searchBtn);
		return new searchResultPage();
	}
	
	
	

}
