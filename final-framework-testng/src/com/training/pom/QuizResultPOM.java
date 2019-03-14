package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuizResultPOM {

private WebDriver driver; 
	
	public QuizResultPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	@FindBy(id="qf_1b3ee9")
	private WebElement SendEmail;
	
	@FindBy(id="myform_submit")
	private WebElement CorrecttestButton;
	
	
   public void SendEmail() {
	   
	   this.SendEmail.click();;
	}
   
public void SendEmailButton() {
	   
	   this.CorrecttestButton.click();;
	}
   

    
	

	
	
}
