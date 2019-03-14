package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnerDetailsinCoursePOM {

private WebDriver driver; 
	
	public LearnerDetailsinCoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
		
	@FindBy(xpath="//img[@title=\"quiz.png\"]/..")
	private WebElement Quiz;
	
	
	
	
   public void ClickQuiz() {
	   
	   this.Quiz.click();;
	}
   

    
	

	
	
}
