package com.npvtest.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.npvtest.utilities.Highlight;


public class CookieBlock {
	 
	 WebDriver driver;
	 WebDriverWait wait;
	 Highlight highlight = new Highlight();
	 
	 @FindBy(className = "cookie-container")
	 WebElement cookieLocation;
	 
	 @FindBy(xpath = "//p")
	 WebElement cookiePElement;
	 
	 @FindBy(xpath = "//p/a")
	 WebElement cookieAElement;
	 
	 @FindBy(xpath = "//p/button")
	 WebElement btnElement;
	 
	// constructor
	 public CookieBlock(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	 }
	 
	 public void CookieLocation() {
			highlight.highlightElement(driver, cookieLocation);	
	 }
	 
	 public String CookiePElement() {
		 	highlight.highlightElement(driver, cookiePElement);
		 	return cookiePElement.getText();
	 }
	 
	 public String CookieAElement() {
			highlight.highlightElement(driver, cookieAElement);
			return cookiePElement.getText();
	 }
	 
	 public void ClickonBtnElement() {
		 	highlight.highlightElement(driver, btnElement);	
			wait.until(ExpectedConditions.elementToBeClickable(btnElement));
			btnElement.click();	
	 }	
	 
}
