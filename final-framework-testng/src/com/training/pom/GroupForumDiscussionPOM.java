package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroupForumDiscussionPOM {

private WebDriver driver; 
	
	public GroupForumDiscussionPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	
		
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[4]/div[1]/div/div/div[1]/div[1]/div")
	private WebElement SeleniumAdvDiscussion;
	
	
	
	
	public void GroupForumClick() {
		
		this.SeleniumAdvDiscussion.click();
		
		
	}
	
   
	
	
}
