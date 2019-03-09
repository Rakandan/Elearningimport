package com.training.pom;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseDetailsPOM {

private WebDriver driver; 
	
	public CourseDetailsPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
		
	@FindBy(linkText="Tests")
	private WebElement CoursetoTest;
	
	@FindBy(linkText="Assessments")
	private WebElement CoursetoAssessments;
	
	@FindBy(linkText="Assignments")
	private WebElement Assignments;
	
	@FindBy(linkText="Forums")
	private WebElement Forum;
	
	@FindBy(linkText="Chat")
	private WebElement Chat;
	
	
	
	public void ClickTests() {
		
		this.CoursetoTest.click();
		
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
   public void ClickAssesments() {
		
		this.CoursetoAssessments.click();
		
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
   
   public void ClickAssignment() {
		
		this.Assignments.click();
		
	}
   
   public void ClickForum() {
		
		this.Forum.click();
	
	}
   
   public void ClickChat() {
		
		this.Chat.click();
	 
	}
   
   public void wind() throws InterruptedException
   {
 	  /*String parentWinHandle = driver.getWindowHandle();
 	  Set<String> winHandles = driver.getWindowHandles();
 	  
 	  Thread.sleep(10000);
       // Loop through all handles
       for(String handle: winHandles)
       {
           
	 		if(!handle.equals(parentWinHandle))
	 		{
	           this.driver.switchTo().window(handle);
	           
	           
	         }
	 	
       }*/
       
	   
	   ArrayList<String> winHandles = new ArrayList<String> (driver.getWindowHandles());
	    Thread.sleep(5000);
	    this.driver.switchTo().window(winHandles.get(1));
   }
 	   
   
   
   
	
}
