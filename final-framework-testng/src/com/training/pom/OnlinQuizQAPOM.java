package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlinQuizQAPOM<WebElements> {

private WebDriver driver; 
	
	public OnlinQuizQAPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	@FindBy(id="choice-268-1")
	private WebElement Selenium;
	
	@FindBy(id="choice-269-2")
	private WebElement Java;
	
	@FindBy(xpath="//*[@id=\"question_div_268\"]/div[3]/button")
	private WebElement Next;
	
	@FindBy(xpath="//*[@id=\"question_div_269\"]/div[3]/button[2]")
	private WebElement EndTest;
	
	
	
   public void Click1Q() {
	   
	   this.Selenium.click();
	}
    
 public void Clicknext() {
	   
	   this.Next.click();
	}
 
 public void Click2Q() {
	   
	   this.Java.click();
	}
	
  public void endtest() {
	  this.EndTest.click();
  }

	
	
}
