package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CourseCatalogPOM {
	
private WebDriver driver; 
	
	public CourseCatalogPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="search_term")
	private WebElement searchtext;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Button; 
	
	@FindBy(linkText="Subscribe")
	private WebElement Subscribe; 
	
	@FindBy(xpath="/html/body/div[1]/section/div/div[2]")
	private WebElement Savedvalue;
	
	
	
	public void search(String Value) {
		//this.password.clear(); 
		this.searchtext.sendKeys(Value);
	}
	
	public void searchbutton() {
		this.Button.click();
	}
	
	public void SubscribeCourse() {
		this.Subscribe.click();
	}
	
	public void Compare(String Value)
	{
		Assert.assertTrue(this.Savedvalue.getText().startsWith(Value));
				
	}
	
	public void Courselink() {
		this.Subscribe.click();
	}
	
}
