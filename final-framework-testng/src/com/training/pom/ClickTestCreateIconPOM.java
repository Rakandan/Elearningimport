package com.training.pom;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickTestCreateIconPOM {

private WebDriver driver; 
	
	public ClickTestCreateIconPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
		
	@FindBy(xpath="//img[@title=\"Create a new test\"]/..")
	private WebElement CreateTestIcon;
	
	
	public void ClickCreateTestICON() {
		
		this.CreateTestIcon.click();
		
	//	this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
  
	
}
