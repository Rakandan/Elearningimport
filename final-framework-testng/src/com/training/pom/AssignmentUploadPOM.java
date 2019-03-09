package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentUploadPOM {

private WebDriver driver; 
	
	public AssignmentUploadPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	
		
	@FindBy(linkText="Upload my assignment")
	private WebElement UploadAssignment;
	
	
	
	
	public void UploadButton() {
		
		this.UploadAssignment.click();
		
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
   
	
	
}
