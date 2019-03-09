package com.training.pom;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForumPagePOM {

private WebDriver driver; 
	
	public ForumPagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	@FindBy(xpath="/html/body")
	private WebElement ForumText;
	
	
	
	
	
public void FrameSwitch() {
		
		
		this.driver.switchTo().frame(this.driver.findElement( By.xpath("//*[@id=\"cke_1_contents\"]/iframe")));
		
		
	}


	
	
	public void EnteringText(String Msg) throws InterruptedException {
		
		
		
		if(this.ForumText.isEnabled())
		{
			this.ForumText.sendKeys(Msg);
			
		}
				
		Thread.sleep(3000);
		
		this.driver.switchTo().defaultContent();
		
		
	}
	
   
	
	
}
