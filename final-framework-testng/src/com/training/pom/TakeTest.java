package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeTest {

private WebDriver driver; 
	
	public TakeTest(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	
		
	
	@FindBy(xpath="//table/tbody/tr/td[1]")
	private WebElement Testlink;
	
	public void clicklink() {
		
		this.Testlink.click();
	}
	
    
	

	
	
}
