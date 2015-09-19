package com.wbl.appium.tests;

import org.testng.annotations.Test;
import com.wbl.appium.activities.HomePage;
import com.wbl.appium.activities.RegistrationPage;


public class RegistrationPageTest extends BaseTest {

	
	@Test(dataProviderClass=MyDataProvider.class , dataProvider="Fillform")
	public void test2(String UserName,String Email,String Password,String Name, String ProgramLanguage)
	{
		
		System.out.println("Inside Test");
		HomePage appHomePage=new HomePage(appiumDriver);
		appHomePage.clickOnRegistrationButton();
		RegistrationPage formPage=new RegistrationPage(appiumDriver);
		formPage.enterUserName(UserName);
		formPage.enterEmail(Email);
		formPage.enterPassword(Password);
		formPage.enterName(Name);
		formPage.selectProgramLanguage(ProgramLanguage);
		formPage.clickOnRegister();
		
		
	}
	
	
}
