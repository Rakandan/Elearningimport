package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForumDiscussionLinkPOM {

private WebDriver driver; 
	
	public ForumDiscussionLinkPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	@FindBy(xpath="//*[@id=\"reply-to-post-17\"]")
	private WebElement replytomsg;
	
	
	public void ReplyMsg() {
		
		this.replytomsg.click();
		
		
		
		
	}
	
   
	
	
}
