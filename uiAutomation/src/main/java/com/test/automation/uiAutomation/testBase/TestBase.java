package com.test.automation.uiAutomation.testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	//This variable of type logger should be defined in all the class for class which you wish to log information
	public static final Logger log=Logger.getLogger(TestBase.class.getName());

	public WebDriver driver;
	public String browser = "Firefox";
	String Url = "http://automationpractice.com/index.php";
	
	
	public void init()
	{
		selectBrowser(browser);
		getUrl(Url);
		String log4jConfPath="log4j.properties";  //Registering the logger properties file
		PropertyConfigurator.configure(log4jConfPath);
		
	}

	public void selectBrowser(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			log.info("Creating the object for "+browser);
			driver = new FirefoxDriver();

		}

	}

	public void getUrl(String url) {
		log.info("Navigating to the URL:"+url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

}
