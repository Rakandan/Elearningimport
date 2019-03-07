package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LostPasswordPOM {
	
private WebDriver driver; 
	
	public LostPasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="lost_password_user")
	private WebElement userName; 
	
	@FindBy(id="lost_password_submit")
	private WebElement SubmitBtn;
	
	public void SendUsername(String uname) {
		this.userName.sendKeys(uname);
	}
	
	public void SendMsg()
	{
		this.SubmitBtn.click();
	}
	

}
