package com.MyStore.actionDriver;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.MyStore.baseClass.BaseClass;

public class Action extends BaseClass  {
	
	
	public static boolean jsClick(WebDriver ldriver,WebElement element)
	{
		boolean flag=false;
		try {
			
			JavascriptExecutor js = (JavascriptExecutor)ldriver;
			js.executeScript("arguments[0].click();", element);
			flag=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally
		{
			if(flag)
			{
				System.out.println("js click is perfomed ");
			}
			else
			{
				System.out.println(" js click not perfomed");
			}
		}
		return flag;
		
	}
	
	public static void explicitWait(WebDriver ldriver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void fluentWait(WebDriver ldriver,WebElement element, int seconds )
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(ldriver)
								.withTimeout(Duration.ofSeconds(30))
								.pollingEvery(Duration.ofSeconds(3))
								.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	public static void moveToElement(WebDriver ldriver,WebElement element )
	{
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).build().perform();
	}
	
	public static void quit(WebDriver ldriver)
	{
		ldriver.quit();
	}

	public static void pageLoad(WebDriver ldriver, int seconds)
	{
		ldriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(seconds));
	}
	
	public static void implicitWait(WebDriver ldriver, int second)
	{
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
	}
	

	public static void click(WebDriver ldriver, WebElement element)
	{
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().build().perform();
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
				System.out.println("Successfully element is found at "+element);
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
	
	public static boolean SelectByVisibleText(WebElement element,String txt)
	{
		boolean flag= false;

		try {

			Select select= new Select(element);
			select.selectByVisibleText(txt);;
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
	
	public static void JSClick(WebElement element,WebDriver ldriver)
	{
		boolean flag=false;
		
		try {
			JavascriptExecutor e = (JavascriptExecutor)ldriver;
			e.executeScript("arguments[0].click()", element);
			flag = true;
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		finally {
			if(flag)
			{
				System.out.println("js clickis perfomed");
			}
			else
			{
				
			}
		}
			
	}
	
	public static boolean switchToFrameByIndex(int index)
	{
		boolean flag=false;
		try {
			new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
			driver.switchTo().frame(index);
			flag=true;					
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		finally {
			if(flag)
			{
				System.out.println("Frame is Selcted");
			}
			else
			{
				System.out.println("Frame is not Selcted");
				
			}
		}
	}
	
	public static boolean switchToFrameByName(String txt)
	{
		boolean flag=false;
		try {
			new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
			driver.switchTo().frame(txt);
			flag=true;					
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		finally {
			if(flag)
			{
				System.out.println("Frame is Selcted");
			}
			else
			{
				System.out.println("Frame is not Selcted");
				
			}
		}
	}
	
	public static boolean switchToDefaultFrame()
	{
		boolean flag=false;
		try {
			new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
			driver.switchTo().defaultContent();
			flag=true;					
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		finally {
			if(flag)
			{
				System.out.println("Frame is Selcted");
			}
			else
			{
				System.out.println("Frame is not Selcted");
				
			}
		}
	}


}
