package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlinQuizPOM<WebElements> {

private WebDriver driver; 
	
	public OnlinQuizPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	@FindBy(xpath="//a[@class='btn btn-success btn-large'][1]")
	private WebElement Button;
	
   public void Start() {
	   
	   this.Button.click();
	}
    
	

	
	
}
