package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestscenariosPOM {

private WebDriver driver; 
	
	public TestscenariosPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	
//@FindBy(xpath="//table/tbody/tr/td[1]")
	//private WebElement Testname;
	
	@FindBy(linkText="1em")
	private WebElement Testname;
	
	@FindBy(linkText="ONLINE QUIZ")
	private WebElement OnlineQuiz;
	
	
   public void clicktestname() {
		
		this.Testname.click();
	}
   
   public void clicktestquiz() {
		
		this.OnlineQuiz.click();
	}
	
    
	

	
	
}
