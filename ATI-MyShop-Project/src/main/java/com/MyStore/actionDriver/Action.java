package com.MyStore.actionDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.MyStore.baseClass.BaseClass;

public class Action extends BaseClass  {


	public static void click(WebDriver ldriver, WebElement element)
	{
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).build().perform();
	}

	public static boolean findElement(WebDriver ldriver,WebElement element)
	{
		boolean flag=false;
		try {
			element.isDisplayed();
			flag=true;
		} catch (Exception e) {
			// TODO: handle exception
			flag=false;
		}
		finally {
			if(flag=true)
			{
				System.out.println("Successfully element is found at ");
			}
			else
			{
				System.out.println("unable to locate element at ");
			}
			return flag;

		}
	}

	public static boolean isDisplayed(WebDriver ldriver, WebElement element)
	{
		boolean flag=false;
		flag=findElement(ldriver, element);


		if(flag)
		{
			flag=element.isDisplayed();
			if(flag)
			{
				System.out.println("The Element is displayed");
			}
			else
			{
				System.out.println("The element is not displayed");
			}
		}
		else
		{
			System.out.println("not displayed");
		}
		return flag;
	}
	public static boolean isSelected(WebDriver ldriver, WebElement element)
	{
		boolean flag = false;
		flag=findElement(ldriver, element);
		if(flag) {
			flag=element.isSelected();
			if(flag)
			{
				System.out.println("The Element is Selected");
			}
			else
			{
				System.out.println("The Element is not Selected");
			}
		}
		else
		{
			System.out.println("not Selected");
		}
		return flag;
	}
	public static boolean isEnabled(WebDriver ldriver, WebElement element)
	{
		boolean flag = false;
		flag=findElement(ldriver, element);
		if(flag)
		{
			flag=element.isEnabled();
			if (flag) {
				System.out.println("The element is enabled");
			}
			else
			{
				System.out.println("The element is not enabled");
			}
		}
		else
		{
			System.out.println("not Enabled");
		}
		return flag;
	}
	public static boolean type(WebElement element, String txt)
	{
		boolean flag = false;
		try {
			flag=element.isDisplayed();
			element.clear();
			element.sendKeys(txt);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not Found");
			flag = false;
		}
		finally {
			if(flag)
			{
				System.out.println("Value entered");
			}
			else
			{
				System.out.println("value not entered");
			}
		}
		return flag;	
	}
	public static boolean selectBysendKeys(WebElement element,String txt) 
	{
		boolean flag = false;
		try {
			element.sendKeys(txt);
			flag=true;
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		finally
		{
			if(flag)
			{
				System.out.println("vlaue selected from drop down");
			}
			else
			{
				System.out.println("value not selected ");
			}
		}

	}
	public static boolean selectByIndex(WebElement element, int index)
	{
		boolean flag= false;

		try {

			Select select= new Select(element);
			select.selectByIndex(index);
			flag=true;
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		finally {
			if (flag) {
				System.out.println("Valueselected");
			}
			else
			{
				System.out.println("value not selected ");
			}
		}

	}
	public static boolean SelectByValue(WebElement element,String txt)
	{
		boolean flag= false;

		try {

			Select select= new Select(element);
			select.selectByValue(txt);;
			flag=true;
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		finally {
			if (flag) {
				System.out.println("Valueselected");
			}
			else
			{
				System.out.println("value not selected ");
			}
		}

	}
	//public static void 



}
