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
import com.training.pom.CourseDetailsPOM;
import com.training.pom.LoginPOM;
import com.training.pom.MyCourses;
import com.training.pom.MySources;
import com.training.pom.TestQuestions;
import com.training.pom.TestingskillsPOM;
import com.training.pom.TestscenariosPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TestCase42 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private MyCourses MyCourse;
	
	private CourseDetailsPOM CourseDetails;
	
	
	private AssesmentPickPOM AssesmentPick;
	private AssesmentTestQuestionsPOM AssesmentTestQuestions;
	private AssesmentStartPOM AssesmentStart;
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
		
	    AssesmentPick = new AssesmentPickPOM(driver);
	    AssesmentTestQuestions= new AssesmentTestQuestionsPOM(driver);
	    AssesmentStart = new AssesmentStartPOM(driver);
		
		
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
	public void TestDescription() {
		
		String Result; 
		
		loginPOM.sendUserName("Rkstudent111");
		
		loginPOM.sendPassword("Rkradha6$$$");
		
		loginPOM.clickLoginBtn(); 
		
		MyCourse.CourseAssesment();
		
		CourseDetails.ClickAssesments();
		
		AssesmentPick.clickAssesmentlink();
		
		AssesmentTestQuestions.StartTestForAssement();
		
		AssesmentStart.StartTestForAssement1();
		
		AssesmentStart.ButtonClick();
		
        AssesmentStart.StartTestForAssement2();
		
		AssesmentStart.ButtonClick();
		
        AssesmentStart.StartTestForAssement3();
		
		AssesmentStart.ButtonClick();
		
		Result =AssesmentStart.Result();
		
		
		System.out.println(Result);
		
	}
}
