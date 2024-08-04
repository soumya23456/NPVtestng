package com.npvtest.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.npvtest.utilities.Highlight;
import com.npvtest.utilities.MouseHover;

public class StartNowButton {

	WebDriver driver;
	WebDriverWait wait;
	Highlight highlight = new Highlight();
	
	@FindBy(xpath = "//a[contains(@class, 'btn-start')]")
	WebElement startButton;
	
	// constructor
		public StartNowButton(WebDriver driver, WebDriverWait wait) {
			this.driver = driver;
			this.wait = wait;
			PageFactory.initElements(driver, this);
		}
	
	public void ClickOnStartNowButton() {
		wait.until(ExpectedConditions.elementToBeClickable(startButton));
		startButton.click();	
	}
	
	public void StartNowButton() {	
	
	}
	
}
