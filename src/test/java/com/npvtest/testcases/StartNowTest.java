package com.npvtest.testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.npvtest.pageobject.CookieBlock;
import com.npvtest.pageobject.StartNowButton;

public class StartNowTest extends BaseClass{

	@Test
	public void VerifyStartNowButton() throws InterruptedException{
		logger.info("************Start now button*************");
		logger.info(driver.getCurrentUrl());
		logger.info("URL opened!");
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5));
		CookieBlock cookieBlock = new CookieBlock(driver, wait);
		
		logger.info("cookie policy block");
		logger.info("CookiePElement highlighted");
		logger.info("CookiePElement.getText()");
		cookieBlock.CookieAElement();
		logger.info("CookieAElement.getText()");
		cookieBlock.ClickonBtnElement();
		logger.info("clicked on Clickon button Element");
		
		logger.info("Start now block");
		StartNowButton startBtnClick = new StartNowButton(driver, wait);
		logger.info("Start now button highlighted!");
		startBtnClick.ClickOnStartNowButton();
		
		logger.info("Start now button clicked!");
		
	}
	
	
}
