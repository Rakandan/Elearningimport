package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingskillsPOM<WebElements> {

private WebDriver driver; 
	
	public TestingskillsPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	@FindBy(linkText="Proceed with the test")
	private WebElement ProceedTestButton;
	
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/div[2]/div/a")
	private WebElement PButton;

	@FindBy(linkText="Start test")
	private WebElement StartTest;
	
	@FindBy(xpath="//a[@class='btn btn-success btn-large'][1]")
	private WebElement Button;
	
   public void clicklink() {
	   
	   this.Button.click();
	}
	
    
	

	
	
}
