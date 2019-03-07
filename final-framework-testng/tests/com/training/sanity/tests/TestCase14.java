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
import com.training.pom.CourseCatalogPOM;
import com.training.pom.LoginPOM;
import com.training.pom.MyCourses;
import com.training.pom.MySources;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TestCase14 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private MyCourses MyCourse;	
	private CourseCatalogPOM CourseCatalog;
	
	private static Properties properties;
	
    private String outputvalue="Your new profile has been saved";

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
	    CourseCatalog = new CourseCatalogPOM(driver);
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
	public void TestProfilePassword() {
		
		loginPOM.sendUserName("rk_student");
		
		loginPOM.sendPassword("student");
		
		loginPOM.clickLoginBtn(); 
		
		MyCourse.Cataloglink();
		
		CourseCatalog.search("Selenium");
		
		CourseCatalog.searchbutton();
		
		CourseCatalog.SubscribeCourse();
		
		CourseCatalog.Compare("You have been registered to course:");
		
		
	}
}
