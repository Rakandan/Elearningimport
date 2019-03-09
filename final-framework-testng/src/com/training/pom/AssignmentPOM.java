package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentPOM {

private WebDriver driver; 
	
	public AssignmentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	
		
	@FindBy(linkText="new assignment after test")
	private WebElement pickAssignment;
	
	
	
	
	
	public void ClickAssignment() {
		
		this.pickAssignment.click();
		
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
  
	
	
}
