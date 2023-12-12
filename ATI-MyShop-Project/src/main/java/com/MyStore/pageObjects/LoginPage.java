package com.MyStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actionDriver.Action;
import com.MyStore.baseClass.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"email\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@id=\"passwd\"]")
	WebElement pwd;
	
	@FindBy(xpath="//button[@id=\"SubmitLogin\"]")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@id=\"email_create\"]")
	WebElement newUsertxtBox;
	
	@FindBy(xpath="//button[@id=\"SubmitCreate\"]")
	WebElement newUserbtn;
	
	public HomePage login(String name,String pass)
	{
		Action.type(username, name);
		Action.type(pwd, pass);
		Action.click(driver, loginBtn);
		return new HomePage();
	}
	public AccountCreationPage createNewUserAccount(String txt)
	{
		Action.type(newUsertxtBox, txt);
		Action.click(driver, newUserbtn);
		return new AccountCreationPage();
	}
	

}
