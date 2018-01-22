package com.test.automation.uiAutomation.homePage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.UIActions.HomePage;
import com.test.automation.uiAutomation.testBase.TestBase;

public class TC002_VerifyRegistration extends TestBase {
	
	public  static final Logger log= Logger.getLogger(TC002_VerifyRegistration.class.getName());
	HomePage homepage;

	@BeforeTest()
	public void setup() {
		init();
	}
	
	
	@Test
	public void VerifyRegistration()
	{
		log.info("============Staring VerifyRegistration=====================");
		homepage = new HomePage(driver);
		homepage.verifyRegistration();
		
		log.info("============Ending VerifyRegistration=====================");
		
		
		
		
	}
	

	@AfterTest()
	public void endTest() {
		
		//driver.quit();

	}

}
