package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssesmentTestQuestionsPOM {

private WebDriver driver; 
	
	public AssesmentTestQuestionsPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	

	@FindBy(linkText="Start test")
	private WebElement StarttestforAssesmentButton;
	
	
	
	@FindBy(xpath="//a[@class='btn btn-success btn-large'][1]")
	private WebElement Button;
	
   public void StartTestForAssement() {
	   
	  //this.StarttestforAssesmentButton.click();
	   this.Button.click();
	}
	
    
	

	
	
}
