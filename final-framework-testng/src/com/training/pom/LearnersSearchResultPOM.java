package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnersSearchResultPOM {

private WebDriver driver; 
	
	public LearnersSearchResultPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[4]/table/tbody/tr[5]/td[7]/a/img")
	private WebElement ClickArrow;
	
	
	
	
   public void ClickArrow() {
	   
	   this.ClickArrow.click();;
	}
   

    
	

	
	
}
