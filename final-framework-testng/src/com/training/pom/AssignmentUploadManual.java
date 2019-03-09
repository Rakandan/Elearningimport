package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentUploadManual {

private WebDriver driver; 
	
	public AssignmentUploadManual(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	
		
	@FindBy(linkText="Click or drag and drop files here to upload them")
	private WebElement ClickBttn;
	
	
	
	
	public void ClickTests() {
		
		//this.ClickBttn.click();
		
		this.driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		//this.driver.manage().timeouts().implicitlyWait(TimeSpan.F, arg1)
		
		this.driver.navigate().back();
	}
	
   
		
	
	
	
}
