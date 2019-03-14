package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElearningTabPOM<WebElements> {

private WebDriver driver; 
	
	public ElearningTabPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	@FindBy(linkText="Reporting")
	private WebElement Reporting;
	
   public void Reporting() {
	   
	   this.Reporting.click();
	}
    
	

	
	
}
