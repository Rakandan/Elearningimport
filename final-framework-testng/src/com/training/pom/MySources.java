package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MySources {
	
private WebDriver driver; 
	
	public MySources(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="profile_password0")
	private WebElement OldPassword;
	
	@FindBy(id="profile_password2")
	private WebElement ConfirmPassword; 
	
	@FindBy(id="password1")
	private WebElement NewPassword; 
		
	@FindBy(id="profile_apply_change")
	private WebElement ApplyBtn; 
	
	@FindBy(xpath="/html/body/div[1]/section/div/div[2]/div/div[1]")
	private WebElement Savedvalue;
	
	public void SendOldPassword(String OldPass) {
		
		this.OldPassword.sendKeys(OldPass);
	}
	
	public void sendPassword(String NewPass) {
		//this.password.clear(); 
		this.NewPassword.sendKeys(NewPass); 
	}
	
	public void ConfPassword(String ConfPass) {
		//this.password.clear(); 
		this.ConfirmPassword.sendKeys(ConfPass); 
	}
	
	public void SaveProfileBtn() {
		this.ApplyBtn.click(); 
	}
	
	public void Compare(String Value)
	{
		Assert.assertEquals(this.Savedvalue.getText(), Value);
				
	}

}
