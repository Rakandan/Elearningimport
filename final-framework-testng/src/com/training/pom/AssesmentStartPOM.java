package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssesmentStartPOM {

private WebDriver driver; 
	
	public AssesmentStartPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	

	@FindBy(id="choice-33-4")
	private WebElement firstq;
	
	@FindBy(name="save_now")
	private WebElement NextButton;
	
	@FindBy(id="choice-34-4")
	private WebElement secondq;
	
	@FindBy(id="choice-35-1")
	private WebElement thirdq;
	
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[4]/div/div/h3")
	private WebElement Result;
	
   public void StartTestForAssement1() {
	   
	  this.firstq.click();
	}
   
   public void StartTestForAssement2() {
	   
		  this.secondq.click();
		}
   
   public void StartTestForAssement3() {
	   
		  this.thirdq.click();
		}
	
    public String Result()
    {
    	return this.Result.getText();
    }
    
    public void ButtonClick() {
 	   
		  this.NextButton.click();
		}
 
	

	
	
}
