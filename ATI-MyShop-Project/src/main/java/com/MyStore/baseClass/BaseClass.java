package com.MyStore.baseClass;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.MyStore.actionDriver.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static Properties properties;
	
	public static Logger logger = Logger.getLogger("MyShop_Logs");
	
	@BeforeTest(groups={"Smoke","Sanity","Regression"})
	public void loadConfig()
	{
		properties = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\Config.properties");
			properties.load(fis);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static void launchApplication()
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.info("driver Initiated");
		
		String browserName = properties.getProperty("BrowserName");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
		}
		else
		{
			driver = new EdgeDriver();
			WebDriverManager.edgedriver().setup();
		}
		
		driver.manage().window().maximize();
		logger.info("driver Maximized");
		driver.manage().deleteAllCookies();
		logger.info("deleted old cookies");
		Action.implicitWait(driver, 10);
		Action.pageLoad(driver, 50);
		driver.get(properties.getProperty("BaseURL"));
		logger.info("My Shop URL Launched");
		
		
	}
	

}
