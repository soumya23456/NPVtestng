package com.npvtest.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.npvtest.utilities.BrowserSetup;
import com.npvtest.utilities.ReadConfig;


public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
	BrowserSetup browserSetup = new BrowserSetup();
	
	String baseurl = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeTest
	public void setup()
	{
		driver = browserSetup.getBrowserSetUp(browser);
		driver.get(baseurl);	
		
		//logging
		logger = LogManager.getLogger("NpvSeleniumTest");

	}   

	@AfterTest
	public void teardown() {
		driver.quit();
		
	}
	
	public boolean isUrl() {
		return driver.getCurrentUrl().equals(baseurl);
	}
	
//		user method to capture screen shot
		public void captureScreenShot(WebDriver driver,String testName) throws IOException
		{
//			step1: convert web driver object to TakesScreenshot interface
			TakesScreenshot screenshot = ((TakesScreenshot)driver);
			
//			step2: call getScreenshotAs method to create image file
			
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			
			File dest = new File(System.getProperty("user.dir") + "//ScreenShots//" + testName + ".png");
		
//			step3: copy image file to destination
			FileUtils.copyFile(src, dest);
		}
}
