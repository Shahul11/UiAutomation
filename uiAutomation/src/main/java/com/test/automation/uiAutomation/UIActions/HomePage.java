package com.test.automation.uiAutomation.UIActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.uiAutomation.homePage.TC001_VerifyLoginWithInvalidCredentails;
import com.test.automation.uiAutomation.testBase.TestBase;

public class HomePage extends TestBase {

	public static final Logger log = Logger.getLogger(HomePage.class.getName());
	//WebDriver driver;

	@FindBy(linkText = "Sign in")
	WebElement Sigin;

	@FindBy(id = "email")
	WebElement loginEmailaddress;

	@FindBy(id = "passwd")
	WebElement loginPassword;

	@FindBy(id = "SubmitLogin")
	WebElement loginSubmit;

	@FindBy(xpath = ".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationFailed;

	//@FindBy(id = "Sign in")
//	WebElement RegistrationSignin;

	@FindBy(id = "email_create")
	WebElement RegistrationemailCreate;

	@FindBy(id = "SubmitCreate")
	WebElement RegistrationSubmitCreate;

	@FindBy(id = "id_gender1")
	WebElement RegistrationSalutionType;

	@FindBy(id = "customer_firstname")
	WebElement RegistrationFirstName;

	@FindBy(id = "customer_lastname")
	WebElement RegistrationLastName;

	@FindBy(id = "email")
	WebElement RegistrationEmail;

	@FindBy(id = "passwd")
	WebElement RegistrationPassword;

	public HomePage(WebDriver driver) {
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyLoginWithIvalidCredentials(String emailAddress, String pwd) {
		Sigin.click();
		log.info("Clicked on sign in  and object is" + Sigin.toString());
		loginEmailaddress.sendKeys(emailAddress);
		log.info("Clicked on email  and object is" + loginEmailaddress.toString());
		loginPassword.sendKeys(pwd);
		log.info("Clicked on password  and object is" + loginPassword.toString());
		loginSubmit.click();
		log.info("Clicked on submit   and object is" + loginSubmit.toString());

	}

	public void verifyRegistration() {
		Sigin.click();
		log.info("Clicked on sign in  and object is" + Sigin.toString());
		RegistrationemailCreate.sendKeys("Bangalore@gmail.com");
		log.info("Clicked on email  object is" + RegistrationemailCreate.toString());
		RegistrationSubmitCreate.click();
		log.info("Clicked on submit button " + RegistrationSubmitCreate.toString());
		RegistrationSalutionType.click();
		log.info("Selected the saultion title " + RegistrationSalutionType.toString());
		RegistrationFirstName.sendKeys("FFname");
		log.info("Entered the first name" + RegistrationFirstName.toString());
		RegistrationLastName.sendKeys("LLname");
		log.info("Entered the Last name" + RegistrationLastName.toString());
		RegistrationEmail.sendKeys("Bang@gmail.com");
		log.info("Entered the email " + RegistrationEmail.toString());
		RegistrationPassword.sendKeys("Bang123");
		log.info("Entered the password" + RegistrationPassword.toString());

	}

	public String getInvalidLoginText() {

		return authenticationFailed.getText();
	}

}
