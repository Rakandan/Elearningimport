package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnersSearchPOM {

private WebDriver driver; 
	
	public LearnersSearchPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	@FindBy(id="search_user_keyword")
	private WebElement searchtext;
	
	@FindBy(id="search_user_submit")
	private WebElement usersubmit;
	
	@FindBy(xpath="//img[@title=\"2rightarrow.png\"]/..")
	private WebElement ClickArrow;
	
	
	
	
   public void ClickArrow() {
	   
	   this.ClickArrow.click();;
	}
   
	
	
	
   public void searchtext(String Name) {
	   
	   this.searchtext.sendKeys(Name);
	}
   
 public void Search() {
	   
	   this.usersubmit.click();
	}
    
	

	
	
}
