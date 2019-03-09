package com.training.pom;


import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ChatPOM {

private WebDriver driver; 
	
	public ChatPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	public String newwindow;
		
	@FindBy(xpath="//*[@id=\"tab1\"]/div/div[1]/div")
	private WebElement sendMsgtxt;
	
	@FindBy(id="chat-send-message")
	private WebElement SendMessageButton;
	
	
	public void switchwindow() throws InterruptedException{
		
		 ArrayList<String> winHandles = new ArrayList<String> (driver.getWindowHandles());
		    Thread.sleep(5000);
		    this.driver.switchTo().window(winHandles.get(1));
	}
	
  public void SendMsgTxt() throws InterruptedException {
	  
		Date date = new Date();
		this.sendMsgtxt.sendKeys(date.toString());
		
	}
  
  public void SendMsgBtn() {
		
		
		this.SendMessageButton.click();
		
		
	}
  
  
  public void closewind()
  {
	  this.driver.close();
  }
  
	


	
	
	
	
   
	
	
}
