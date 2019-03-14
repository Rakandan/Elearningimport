package com.training.pom;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExerciseAddedPOM {

private WebDriver driver; 
	
	public ExerciseAddedPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
		
	@FindBy(xpath="//img[@title=\"Multiple choice\"]/..")
	private WebElement MultipleChoice;
	
	@FindBy(xpath="//img[@title=\"Preview\"]/..")
	private WebElement preview;
	
	
	public void MultipleChoice() {
		
		this.MultipleChoice.click();
		
	//	this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
   public void previewicon() {
		
		this.preview.click();
		
	//	this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	
	
  
	
}
