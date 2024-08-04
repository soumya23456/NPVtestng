package com.npvtest.testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.npvtest.pageobject.HomePage;
import com.npvtest.pageobject.StartNowButton;
import com.npvtest.utilities.Highlight;


public class HomePageTest extends BaseClass{
	
	@Test
	public void VerifyStartNowButton() throws InterruptedException{
		
	//logger.info(" ");
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
	
	homePage.HeaderDiv();
	logger.info("header highlighted");
	homePage.npvStartLink();
	logger.info("npvStartLink highlighted");
	homePage.homeLink();
	logger.info("homeLink highlighted");
//	homePage.aboutUs();
//	logger.info("about us section is visible");
//	
	homePage.aboutUsLink2();
	logger.info("about us section is visibility");
	homePage.aboutUsDropdownElement();
	logger.info("about us section Dropdown is visibility");
	homePage.productsLink();
	logger.info("products section is visibility");
	homePage.productsDropdownElement();
	logger.info("products section Dropdown is visibility");
	homePage.danElement();
	logger.info("products section danElement is visibility");
	homePage.servicesLink();
	logger.info("services section is visibility");
	homePage.servicesDropdownElement();
	logger.info("services section Dropdown is visibility");
	homePage.cpElement();
	logger.info("services section cpElement is visibility");
	homePage.miccElement();
	logger.info("services section miccElement is visibility");
	homePage.bigDataElement();
	logger.info("services section bigDataElement is visibility");
	homePage.lmElement();
	logger.info("services section lmElement is visibility");
	homePage.sdrmElement();
	logger.info("services section sdrmElement is visibility");
	homePage.arElement();
	logger.info("services section arElement is visibility");
	homePage.SAsElement();
	logger.info("services section cpElement is visibility");
	homePage.mspvmsElement();
	logger.info("services section cpElement is visibility");
//	
	homePage.careersLink();
	logger.info(" careersLink");
	homePage.careersHeading();
	logger.info(" careersHeading");
	homePage.careerssubHeading();
	logger.info(" careerssubHeading");
	
	List<WebElement> careers = driver.findElements(By.xpath("//div[contains(@class,'table-container')]"));
	List<WebElement> designation = driver.findElements(By.xpath("//div[contains(@class,'table-container')]/table/tbody/tr"));
	
	for (WebElement career : careers) {
		int index = careers.indexOf(career);
//		Thread.sleep(1000);
		System.out.println("index: " + index);
		jsExecutor.executeScript("arguments[0].scrollIntoView();", career);
//		Thread.sleep(1000);
		jsExecutor.executeScript("window.scrollBy(0, -150)");
//		Thread.sleep(3000);				
				
		List<WebElement> tablerows = career.findElements(By.xpath("table/tbody/tr"));
		
		for (WebElement row : tablerows) {
			highlight.highlightElement(driver, row);
			System.out.println(row.getText());
		}
	
	}
	
	homePage.contactLink();
	logger.info(" contactLink");
	homePage.contactUsHeading();
	logger.info(" contactUsHeading");
	homePage.contactUssubHeading();
	logger.info(" contactUssubHeading");
	homePage.conatctFormBlock();
	logger.info(" conatctFormBlock");
	homePage.addressBlock();
	logger.info(" addressBlock");
	homePage.Address();
	logger.info(" address");
	homePage.Phone();
	logger.info(" phone");
	homePage.emailAddress();
	logger.info(" emailAddress");
}
}
