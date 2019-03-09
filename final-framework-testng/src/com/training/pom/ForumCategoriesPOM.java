package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForumCategoriesPOM {

private WebDriver driver; 
	
	public ForumCategoriesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	@FindBy(linkText="New1")
	private WebElement Topic;
	
	
	public void Topiclink() {
		
		this.Topic.click();
		
		
	}
	
   
	
	
}
