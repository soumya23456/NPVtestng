package com.npvtest.pageobject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.npvtest.testcases.BaseClass;
import com.npvtest.utilities.Highlight;
import com.npvtest.utilities.MouseHover;

public class HomePage extends BaseClass{
	
	 WebDriver driver;
	 WebDriverWait wait;
	 Highlight highlight;
	 Actions actions;
	 MouseHover hoverJs;
	 JavascriptExecutor jsExecutor= (JavascriptExecutor)driver;
	 
//	 Start now
	 @FindBy(className = "collapse")
	 WebElement headerDiv;
	 
	 @FindBy(className = "navbar-brand")
	 WebElement npvStartLink;
//	 About us
	 @FindBy(xpath = "//li/a[@href='#about-us']")
	 WebElement aboutUsLink;
	 
	 @FindBy(id = "home")
	 WebElement homeLink;

	 @FindBy(id = "about-us")
	 WebElement aboutUs;
//	 Careers
	 @FindBy(xpath = "//li/a[@href='#career']")
	 WebElement careersLink;
	 
	 @FindBy(xpath = "//h2[contains(b,'::Careers::')]")
	 WebElement careersHeading;
	
	 @FindBy(xpath = "//section[contains(@id,'career')]/div/div/div/h4")
	 WebElement careerssubHeading;
	 
	 @FindBy(xpath = "//section[contains(@id,'career')]/div/div/div/h4")
	 List<WebElement> contactMailElement;
	 
	 @FindBy(xpath = "//div[contains(@class,'table-container')]")
	 List<WebElement> careers;
	 
	 @FindBy(xpath = "//div[contains(@class,'table-container')]/table/tbody/tr")
	 List<WebElement> designation;
	 
	 @FindBy(xpath = "table/tbody/tr")
	 WebElement tablerows;
//	 Contact us
	 @FindBy(xpath = "//li/a[@href='#contact']")
	 WebElement contactLink;
	 
	 @FindBy(xpath = "//div[contains(@id, 'contact-us')]/div/div/div/h2")
	 WebElement contactUsHeading;
	 
	 @FindBy(xpath = "//div[contains(@id, 'contact-us')]/div/div/div/p")
	 WebElement contactUssubHeading;
	 
	 @FindBy(xpath = "(//div[contains(@class, 'contact-form')]/div/div)[1]")
	 WebElement conatctFormBlock;
	 
	 @FindBy(xpath = "(//div[contains(@class, 'contact-form')]/div/div)[2]")
	 WebElement addressBlock;
	 
	 @FindBy(xpath = "//div[contains(@class, 'contact-info')]/ul/li")
	 WebElement address;
	 
	 @FindBy(xpath = "//div[contains(@class, 'contact-info')]/ul/li")
	 WebElement phone;
	 
	 @FindBy(xpath = "//div[contains(@class, 'contact-info')]/ul/li")
	 WebElement emailAddress;
	 
	 @FindBy(xpath = "//input[contains(@name,'name')]")
	 WebElement nameInput;

	 @FindBy(xpath = "//input[contains(@name,'email')]")
	 WebElement emailInput;

	 @FindBy(xpath = "//input[contains(@name,'subject')]")
	 WebElement subjectInput;

	 @FindBy(xpath = "//textarea[contains(@name,'message')]")
	 WebElement messageInput;

	 @FindBy(className = "btn-submit")
	 WebElement submitButton;

	 @FindBy(className = "form_status")
	 WebElement successMessage;
//	 Header events
	 @FindBy(linkText = "NOVO PROVIGILANCE LLC")
	 WebElement NPV;
	 
	 @FindBy(xpath = "(//li/ul)[1]")
	 WebElement aboutUsDropdownElement;
	 
	 @FindBy(xpath = "(//li/ul/li/a[contains(@href, 'csr.html')]")
	 WebElement csrElement;
	 
	 @FindBy(xpath = "//li/a[@href='#products']")
	 WebElement productsLink;
	 
	 @FindBy(xpath = "(//li/ul)[2]")
	 WebElement productsDropdownElement;
	 
	 @FindBy(xpath = "//li/ul/li/a[contains(@href, 'DSAN.html')]")
	 WebElement danElement;
	 
	 @FindBy(xpath = "//li/a[@href='#services']")
	 WebElement servicesLink;
	 
	 @FindBy(xpath = "(//li/ul)[3]")
	 WebElement servicesDropdownElement;
	 
	 @FindBy(xpath = "//li/ul/li/a[contains(@href,'cp.html')]")
	 WebElement cpElement;
	 
	 @FindBy(xpath = "//li/ul/li/a[contains(@href, 'micc.html')]")
	 WebElement miccElement;
	 
	 @FindBy(xpath = "//li/ul/li/a[contains(@href, 'bigData.html')]")
	 WebElement bigDataElement;
	 
	 @FindBy(xpath = "//li/ul/li/a[contains(@href, 'lm.html')]")
	 WebElement lmElement;
	 
	 @FindBy(xpath = "//li/ul/li/a[contains(@href, 'sdrm.html')]")
	 WebElement sdrmElement;
	 
	 @FindBy(xpath = "//li/ul/li/a[contains(@href, 'ar.html')]")
	 WebElement arElement;
	 
	 @FindBy(xpath = "//li/ul/li/a[contains(@href, 'SAs.html')]")
	 WebElement SAsElement;
	 
	 @FindBy(xpath = "//li/ul/li/a[contains(@href,'mspvms.html')]")
	 WebElement mspvmsElement;
	 
	// constructor
	 public HomePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		this.actions = new Actions(driver);
		this.highlight = new Highlight();
		this.hoverJs = new MouseHover();
//		this.title = new String();
		PageFactory.initElements(driver, this);
	 }
	 
	// assert title
		
	 
//	 Start now
	 public void HeaderDiv() {
		 highlight.highlightElement(driver, headerDiv);
	 }
	 
	 public void aboutUsLink1() throws InterruptedException{
		 System.out.println("about us nav element : " + aboutUsLink.getText());
		 highlight.highlightElement(driver, aboutUsLink);
	 }
	 
	 public void npvStartLink() {
		 highlight.highlightElement(driver, npvStartLink);
	 }
	 
	 public void homeLink() {
		 highlight.highlightElement(driver, homeLink);
	 }
	 
//	 About us
	 public void aboutUs() {
		 highlight.highlightElement(driver, aboutUs);
	 }

//	 Careers
	 public void careersLink() throws InterruptedException{
		 highlight.highlightElement(driver, careersLink);
		 Thread.sleep(200);
		 System.out.println("careers nav element : " + careersLink.getText());
//		 actions.moveToElement(careersLink).perform();
		 hoverJs.mouseHoverJScript(careersLink, driver);
		 wait.until(ExpectedConditions.elementToBeClickable(careersLink));
		 Thread.sleep(200);
		 careersLink.click(); 
	 }
	  
	 public void careersHeading() {
		 highlight.highlightElement(driver, careersHeading);
//		 wait.until(d -> careersHeading.isDisplayed());
	 }
	 
	 public void careerssubHeading() {
		 highlight.highlightElement(driver, careerssubHeading);
		 System.out.println("::Work with us and Grow with us::" + careerssubHeading.getText());
	 }	
	 
	 public void contactMailElement(int index) {
		 contactMailElement.get(index).getText();
		 System.out.println("Send Your resume to " + ((WebElement) contactMailElement).getText());
	 }
	 
	 public void careers(int index) {
		 careers.get(index).getText();
	 }
	 
	 public void tablerows(int index) {
		 tablerows.getText();
	 }
	 
//	 Contact us
	 public void contactLink() throws InterruptedException{
		 highlight.highlightElement(driver, contactLink);
		 Thread.sleep(200);
		 System.out.println("contact nav element : " + contactLink.getText());
		 hoverJs.mouseHoverJScript(contactLink, driver);
		 wait.until(ExpectedConditions.elementToBeClickable(careersLink));
		 Thread.sleep(500); 
	 }
	 
	 public void contactUsHeading() {
		 highlight.highlightElement(driver, careerssubHeading);
		 System.out.println("Main Heading in Contact us: " + contactUsHeading.getText());
	 }
	 
	 public void contactUssubHeading() {
		 highlight.highlightElement(driver, contactUssubHeading);
		 System.out.println("SubHeading in Contact us: " + contactUssubHeading.getText());
	 }
	 
	 public void conatctFormBlock() {
		 System.out.println("contact us location: " + conatctFormBlock.getLocation());
	 }
	 
	 public void addressBlock() {
		 System.out.println("Address block location" + addressBlock.getLocation());
	 }
	 
	 public void Address() {
		 highlight.highlightElement(driver, address);
		 System.out.println("Address given: " + address.getText());
	 }
	 
	 public void Phone() {
		 highlight.highlightElement(driver, phone);
		 System.out.println("Phone number : " + phone.getText());
	 }
	 
	 public void emailAddress() {
		 highlight.highlightElement(driver, emailAddress);
		 System.out.println("Email address : " + emailAddress.getText());
	 }
	 
	//get contact number
	public String getPhoneNumber() {
		return phone.getText();
	}
		
	//get contact email address
	public String getContactEmailAddress() {
		return emailAddress.getText();
	}
	
	//enter name into contact form input
	public void setName(String name) {
		highlight.highlightElement(driver, nameInput);
		nameInput.sendKeys(name);
	}
		
	//enter email into contact form input
	public void setEmail(String email) {
		highlight.highlightElement(driver, emailInput);
		emailInput.sendKeys(email);
	}
	
	//enter subject into contact form input
	public void setSubject(String subject) {
		highlight.highlightElement(driver, subjectInput);
		subjectInput.sendKeys(subject);
	}
		
	//enter message into contact form input
	public void setMessage(String message) {
		highlight.highlightElement(driver, messageInput);
		messageInput.sendKeys(message);
	}
	
	//click submit button in contact form 
	public void clickSubmitButton() {		
		jsExecutor.executeScript("arguments[0].scrollIntoView();", submitButton);
		wait.until(d -> submitButton.isDisplayed());
		hoverJs.mouseHoverJScript(submitButton, driver);
		highlight.highlightElement(driver, submitButton);
		submitButton.click();
	}
	
	//get success message contact form
	public String getSuccessMessage() {
		jsExecutor.executeScript("arguments[0].scrollIntoView();", successMessage);
		jsExecutor.executeScript("window.scrollBy(0,150)");
		wait.until(d -> successMessage.isDisplayed());				
		highlight.highlightElement(driver, messageInput);
		return successMessage.getText();
	}

//	 Header events
	 public void title() {
		 String title = driver.getTitle();
		 System.out.println("Title :" + title);
	 }
	 
	 public void NPV() throws InterruptedException{
		 hoverJs.mouseHoverJScript(NPV, driver);
//		 Thread.sleep(200); 
	 }
	 
	 public void aboutUsLink2() throws InterruptedException{
		 wait.until(d-> aboutUsLink.isDisplayed());
		 wait.until(ExpectedConditions.visibilityOf(aboutUsLink));
		 System.out.println("about us nav element : " + aboutUsLink.getText());
		 highlight.highlightElement(driver, aboutUsLink);
		 hoverJs.mouseHoverJScript(aboutUsLink, driver);
		 Thread.sleep(200);
	 }
	 
	 public void aboutUsDropdownElement() throws InterruptedException{
		 highlight.highlightElement(driver, aboutUsDropdownElement);
		 hoverJs.mouseHoverJScript(aboutUsDropdownElement, driver);
	 }
	 
	 public void productsLink() throws InterruptedException{
		 wait.until(d-> productsLink.isDisplayed());
		 wait.until(ExpectedConditions.visibilityOf(productsLink));
		 System.out.println("products nav element : " + productsLink.getText());
		 highlight.highlightElement(driver, productsLink);
		 hoverJs.mouseHoverJScript(productsLink, driver);
		 Thread.sleep(200);
	 }
	 
	 public void productsDropdownElement() throws InterruptedException{
		 hoverJs.mouseHoverJScript(productsDropdownElement, driver);
		 Thread.sleep(100);
		 highlight.highlightElement(driver, productsDropdownElement);
//		 wait.until(d -> productsDropdownElement.isDisplayed());
		 Thread.sleep(100);
	 }
	 
	 public void danElement() throws InterruptedException{
		 hoverJs.mouseHoverJScript(danElement, driver);
		 highlight.highlightElement(driver, danElement);
	 }
	 
	 public void servicesLink() throws InterruptedException{
		 wait.until(d-> servicesLink.isDisplayed());
		 wait.until(ExpectedConditions.visibilityOf(servicesLink));
		 System.out.println("services nav element : " + servicesLink.getText());
		 highlight.highlightElement(driver, servicesLink);
		 hoverJs.mouseHoverJScript(servicesLink, driver);
		 Thread.sleep(200);
	 }
	 
	 public void servicesDropdownElement() throws InterruptedException{
		 wait.until(d -> servicesDropdownElement.isDisplayed());
		 highlight.highlightElement(driver, servicesDropdownElement);
		 hoverJs.mouseHoverJScript(servicesDropdownElement, driver);
		 
	 }
	 
	 public void cpElement() throws InterruptedException{
		 hoverJs.mouseHoverJScript(cpElement, driver);
		 highlight.highlightElement(driver, cpElement);
	 }
	 
	 public void miccElement() throws InterruptedException{
		 hoverJs.mouseHoverJScript(miccElement, driver);
		 highlight.highlightElement(driver, miccElement);
	 }
	 
	 public void bigDataElement() throws InterruptedException{
		 hoverJs.mouseHoverJScript(bigDataElement, driver);
		 highlight.highlightElement(driver, bigDataElement);
	 }
	 
	 public void lmElement() throws InterruptedException{
		 hoverJs.mouseHoverJScript(lmElement, driver);
		 highlight.highlightElement(driver, lmElement);
	 }
	 
	 public void sdrmElement() throws InterruptedException{
		 hoverJs.mouseHoverJScript(sdrmElement, driver);
		 highlight.highlightElement(driver, sdrmElement);
	 }
	 
	 public void arElement() throws InterruptedException{
		 hoverJs.mouseHoverJScript(arElement, driver);
		 highlight.highlightElement(driver, arElement);
	 }
	 
	 public void SAsElement() throws InterruptedException{
		 hoverJs.mouseHoverJScript(SAsElement, driver);
		 highlight.highlightElement(driver, SAsElement);
	 }
	 
	 public void mspvmsElement() throws InterruptedException{
		 hoverJs.mouseHoverJScript(mspvmsElement, driver);
		 highlight.highlightElement(driver, mspvmsElement);
	 }
//	 
}
