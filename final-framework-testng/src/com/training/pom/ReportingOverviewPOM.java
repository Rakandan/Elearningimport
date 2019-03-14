package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportingOverviewPOM<WebElements> {

private WebDriver driver; 
	
	public ReportingOverviewPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	@FindBy(linkText="Followed students")
	private WebElement Followedstudents;
	
   public void Followedstudents() {
	   
	   this.Followedstudents.click();
	}
    
	

	
	
}
