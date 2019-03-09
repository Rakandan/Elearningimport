package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AssesmentPickPOM;
import com.training.pom.AssesmentStartPOM;
import com.training.pom.AssesmentTestQuestionsPOM;
import com.training.pom.AssignmentPOM;
import com.training.pom.AssignmentUploadManual;
import com.training.pom.AssignmentUploadPOM;
import com.training.pom.ChatPOM;
import com.training.pom.CourseDetailsPOM;
import com.training.pom.ForumCategoriesPOM;
import com.training.pom.ForumDiscussionLinkPOM;
import com.training.pom.ForumDiscussionReplymSgThreadPOM;
import com.training.pom.ForumPagePOM;
import com.training.pom.GroupForumDiscussionPOM;
import com.training.pom.LoginPOM;
import com.training.pom.MyCourses;
import com.training.pom.MySources;
import com.training.pom.TestQuestions;
import com.training.pom.TestingskillsPOM;
import com.training.pom.TestscenariosPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import java.util.Date;

public class TestCase45 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private MyCourses MyCourse;
	
	private CourseDetailsPOM CourseDetails;
	
	private ChatPOM Chat;
	
	
	
	
	private static Properties properties;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		MyCourse= new MyCourses(driver);
		CourseDetails = new CourseDetailsPOM(driver);
		Chat = new ChatPOM(driver);
		
				
		
		baseUrl = properties.getProperty("baseURL");
		
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void TestDescription() throws InterruptedException {
		
				
		loginPOM.sendUserName("Rkstudent111");
		
		loginPOM.sendPassword("Rkradha6$$$");
		
		loginPOM.clickLoginBtn(); 
		
		MyCourse.SeleniumAdvForForum();
		
		CourseDetails.ClickChat();
		
		CourseDetails.wind();
		
		//Thread.sleep(10000);
		
		Chat.switchwindow();
		
		Chat.SendMsgTxt();
		
		Chat.SendMsgBtn();
		
		Thread.sleep(3000);
		
		Chat.closewind();
		
		
		
	}
}
