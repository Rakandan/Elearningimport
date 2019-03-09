package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssesmentPickPOM {

private WebDriver driver; 
	
	public AssesmentPickPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	

	@FindBy(linkText="OnlineSeleniumTests")
	private WebElement SeleniumTestAssesment;
	
   public void clickAssesmentlink() {
	   
	  this.SeleniumTestAssesment.click();
	}
	
    
	

	
	
}
