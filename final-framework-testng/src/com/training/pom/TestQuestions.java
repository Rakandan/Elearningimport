package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestQuestions {

private WebDriver driver; 
	
	public TestQuestions(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	@FindBy(id="choice-122-1")
	private WebElement firstq;
	
	@FindBy(name="save_now")
	private WebElement NextButton;
	
	
		
	@FindBy(id="choice-123-1")
	private WebElement SecondQ;
	
	@FindBy(linkText="End test")
	private WebElement EndButton;
	
    public void clickfirstquestion() {
		
		this.firstq.click();
	}
    
   public void NextButtonclick() {
		
		this.NextButton.click();
	}
   
   public void clicksecondquestion() {
		
		this.SecondQ.click();
	}
   
  public void ClickEndButton() {
		
		this.EndButton.click();
	}
   
   
  
	
    
	

	
	
}
