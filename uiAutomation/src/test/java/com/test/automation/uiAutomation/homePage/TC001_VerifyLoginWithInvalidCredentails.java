package com.test.automation.uiAutomation.homePage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.UIActions.HomePage;
import com.test.automation.uiAutomation.testBase.TestBase;

public class TC001_VerifyLoginWithInvalidCredentails extends TestBase {
	
	public static final Logger log=Logger.getLogger(TC001_VerifyLoginWithInvalidCredentails.class.getName());

	HomePage homepage;

	@BeforeTest()
	public void setUp() {

		init();
	}

	@Test()
	public void verifyLoginWithInvalidCredentails() {
		log.info("============Staring verifyLoginWithInvalidCredentails=====================");

		homepage = new HomePage(driver);
		homepage.verifyLoginWithIvalidCredentials("test1@gmail.com", "test");

		Assert.assertEquals(homepage.getInvalidLoginText(), "Invalid password.");
		log.info("============Finished verifyLoginWithInvalidCredentails=====================");
	}

	@AfterTest()
	public void endTest() {

	}

}
