package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForumDiscussionReplymSgThreadPOM {

private WebDriver driver; 
	
	public ForumDiscussionReplymSgThreadPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	@FindBy(xpath="//*[@id=\"reply-to-post-17\"]")
	private WebElement replytomsg;
	
	@FindBy(name="SubmitPost")
	private WebElement ReplyBtn;
	
	public void FrameSwitch() {
		
		//this.replytomsg.click();
		
		//System.out.println(this.driver.getWindowHandle());
		
		this.driver.switchTo().frame(0);
		
		
	}
	
	public void Reply()
	{
		this.ReplyBtn.click();
	}
	
   
	
	
}
