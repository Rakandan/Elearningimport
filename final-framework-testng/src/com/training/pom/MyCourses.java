package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCourses {

private WebDriver driver; 
	
	public MyCourses(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(xpath="/html/body/div[1]/section/div/div[2]/div[1]/div/div[2]/div/div[2]/div/ul/li[4]/a")
	private WebElement EditProfile; 
	
	@FindBy(linkText="Course catalog")
	private WebElement Course;
	
	@FindBy(xpath="/html/body/div[1]/section/div/div[2]/div[2]/div/section/div/div[1]/div/div/div[2]/h4/a")
	private WebElement title;
	
	@FindBy(linkText="Course description")
	private WebElement description;
	
	@FindBy(linkText="1Selenium12")
	private WebElement TestCourse;
	
	@FindBy(linkText="SeleniumCourseSatya")
	private WebElement TestCourseforAssesment;
	
	@FindBy(linkText="SeleniumAdv")
	private WebElement SeleniumAdvforforum;
	
	public void clicklink() {
		
		this.EditProfile.click();
	}
	
	public void Cataloglink() {
		
		this.Course.click();
	}
	
    public void Learnlink() {
		
		this.title.click();
	}
    
     public void clickDescription() {
		
		this.description.click();
	}
     
     public void coursetest() {
    	 this.TestCourse.click();
    	 
    	 
     }
     
     public void CourseAssesment() {
    	 this.TestCourseforAssesment.click();
    	     	 
     }
     
     public void SeleniumAdvForForum() {
    	 this.SeleniumAdvforforum.click();
     }
}
