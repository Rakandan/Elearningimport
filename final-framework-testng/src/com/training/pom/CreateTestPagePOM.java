package com.training.pom;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTestPagePOM {

private WebDriver driver; 
	
	public CreateTestPagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
		
	@FindBy(id="exercise_title")
	private WebElement Title;
	
	@FindBy(id="advanced_params")
	private WebElement AdvancedButton;
	
	@FindBy(xpath="/html/body")
	private WebElement Context;
	
	@FindBy(id="exerciseType_0")
	private WebElement exercisetype;
	
	@FindBy(name="activate_start_date_check")
	private WebElement InlcudeStarttime;
	
	
	@FindBy(id="pass_percentage")
	private WebElement PassPercentage;
	
	@FindBy(name="submitExercise")
	private WebElement ProceedtoQuestion;
	
	
	public void ClickCreateTestICON(String Data) {
		
		this.Title.sendKeys(Data);
	}
	
    public void ClickAdvancedButton() {
		
		this.AdvancedButton.click();
		
	}
    
    public void FrameSwitch() {
    	
    	try {
	    
    		
		   this.driver.switchTo().frame(0);
    	}
    	
    	catch (Exception e) 
    	{
    		System.out.println("ERROR");
    	}
	 }
	
    public void FrameData() {
    	
		this.Context.sendKeys("QUIZ");
		this.driver.switchTo().defaultContent();
		
	 }
  
    
    public void exertype()
    {
    	this.exercisetype.click();
    }
    
    public void checkstarttime()
    {
    	this.InlcudeStarttime.click();
    }
    
    public void PassPercentage(String value)
    {
    	this.InlcudeStarttime.sendKeys(value);
    }
    
    public void ProceedtoQuestion()
    {
    	this.ProceedtoQuestion.click();
    }
	
}
