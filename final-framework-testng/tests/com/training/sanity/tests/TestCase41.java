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
import com.training.pom.CourseDetailsPOM;
import com.training.pom.LoginPOM;
import com.training.pom.MyCourses;
import com.training.pom.MySources;
import com.training.pom.TestQuestions;
import com.training.pom.TestingskillsPOM;
import com.training.pom.TestscenariosPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TestCase41 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private MyCourses MyCourse;
	private MySources MySource;
	private CourseDetailsPOM CourseDetails;
	private TestingskillsPOM Testingskills;
	private TestscenariosPOM Testscenarios;
	private TestQuestions TestQuestion;
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
		MySource = new MySources(driver);
		CourseDetails = new CourseDetailsPOM(driver);		
		Testscenarios = new TestscenariosPOM(driver);	
		Testingskills=new TestingskillsPOM(driver);
		TestQuestion = new TestQuestions(driver);
		
		
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
		
		loginPOM.sendUserName("Rkstudent111");
		
		loginPOM.sendPassword("Rkradha6$$$");
		
		loginPOM.clickLoginBtn(); 
		
		MyCourse.coursetest();	
		
		CourseDetails.ClickTests();
		
		Testscenarios.clicktestname();
		
		Testingskills.clicklink();
		
		TestQuestion.clickfirstquestion();
		
		TestQuestion.NextButtonclick();
		
		TestQuestion.clicksecondquestion();
		
		TestQuestion.NextButtonclick();
		
		
		
		
	}
}
