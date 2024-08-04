package com.npvtest.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlight {

	public Highlight() {
        // TODO Auto-generated constructor stub
    }
    
    public void highlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].setAttribute('style', 'border: 2px solid yellow;')", element);
    }

    public void removehighlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].setAttribute('style', 'border: none;')", element);
    }
}
