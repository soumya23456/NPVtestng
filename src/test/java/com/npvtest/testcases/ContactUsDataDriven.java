package com.npvtest.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.npvtest.pageobject.HomePage;
import com.npvtest.pageobject.StartNowButton;
import com.npvtest.testcases.BaseClass;
import com.npvtest.utilities.Highlight;

public class ContactUsDataDriven extends BaseClass{

	@Test(dataProvider = "ContactFormDataProvider")
	public void VerifyContactFormPage(String userEmail, String userPwd, String expectedUsername) throws IOException, InterruptedException
	{
		logger.info("************Start now button*************");
		logger.info(driver.getCurrentUrl());
		logger.info("URL opened!");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5));
		Highlight highlight = new Highlight();
		JavascriptExecutor jsExecutor= (JavascriptExecutor)driver;
		StartNowButton startBtnClick = new StartNowButton(driver, wait);
		
		startBtnClick.ClickOnStartNowButton();
		logger.info("clicked on start now button");
		
		HomePage homePage = new HomePage(driver, wait);
		
		homePage.contactLink();
		logger.info("clicked on contact form");
		homePage.contactUsHeading();
		logger.info("Highlighted Contact us");
		
		String name = null;
		homePage.setName(name);
		logger.info("Entered name");

		String email = null;
		homePage.setEmail(email);
		logger.info("Entered email");
		
		String subject = null;
		homePage.setSubject(subject);
		logger.info("Entered subject");
		
		String message = null;
		homePage.setMessage(message);
		logger.info("Entered message");
		
		homePage.clickSubmitButton();
		logger.info("submit button clicked!");
		
		homePage.getSuccessMessage();
		logger.info("success message displayed!");
	}
	
	
	@DataProvider(name = "ContactFormDataProvider")
	public String[][] getContactFormTestData(){
		String[][] testData = new String[1][4];
		
		testData[0][0] = "test name";
		testData[0][1] = "test@test.com";
		testData[0][2] = "test subject";
		testData[0][3] = "test message";
		return testData;
		
	}
		
		
}

