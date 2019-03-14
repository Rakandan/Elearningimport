package com.training.pom;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleChoiceQAPOM {

private WebDriver driver; 
	
	public MultipleChoiceQAPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
		
	@FindBy(name="questionName")
	private WebElement questionName;
	
	@FindBy(xpath="/html/body")
	private WebElement ans;
	
	@FindBy(id="submit-question")
	private WebElement SubmitQuestion;
	
	
	public void NameOfQuestion(String QA) {
		
		this.questionName.sendKeys(QA);
		
	
	}
	
	 public void FrameSwitch(int i) {
			
			this.driver.switchTo().frame(i);
			
		 }
	 
	 public void ans(String value)
	 {
		 this.ans.sendKeys(value);
	 }

	 
	 public void FrameClose()
	 {
		 this.driver.switchTo().defaultContent();
	 }
	 
	 public void SubmitButton()
	 {
		 this.SubmitQuestion.click();
	 }

	
	
  
	
}
