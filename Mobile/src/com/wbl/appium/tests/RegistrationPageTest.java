package com.wbl.appium.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.wbl.appium.activities.HomePage;
import com.wbl.appium.activities.RegistrationPage;
import com.wbl.appium.activities.WebViewPage;
import com.wbl.appium.utils.UtilityClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegistrationPageTest {
	public AppiumDriver appiumDriver=null;
	
	@BeforeClass
	public static void setUpClass()
	{
		BasicConfigurator.configure();
	}
	@Before
	public void setUp() throws Exception {
		appiumDriver=UtilityClass.getDeviceDriver("ANDROID","sample1");
		
	
		appiumDriver.installApp("D:/supriya/softwares/selendroid-test-app-0.16.0.apk");
		((AndroidDriver)appiumDriver).startActivity("io.selendroid.testapp",".HomeScreenActivity");
	}
	
	@Test
	public void test1()
	{
		HomePage appHomePage=new HomePage(appiumDriver);
		appHomePage.clickOnChromeButton();
		WebViewPage webViewPage=new WebViewPage(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver,10,TimeUnit.SECONDS),webViewPage);
		webViewPage.selectWebViewHtml("formPage");
		webViewPage.switchToWebView();
		
	   // WebElement txt=appiumDriver.findElement( By.className("android.widget.TextView"));
		//Assert.assertEquals("Web View Interaction", txt.getText());
		
	}
	
	@Test
	public void test2()
	{
		
		System.out.println("Inside Test");
		HomePage appHomePage=new HomePage(appiumDriver);
		appHomePage.clickOnRegistrationButton();
		RegistrationPage formPage=new RegistrationPage(appiumDriver);
		formPage.enterUserName("whiteBox");
		formPage.enterEmail("Box@gg.com");
		formPage.enterPassword("whiteboxqa");
		formPage.enterName("innovapath");
		formPage.selectProgramLanguage("Java");
		formPage.clickOnRegister();
		
		
	}
	
	@org.junit.After
	public void After()
	{
		//((AndroidDriver)appiumDriver).removeApp("io.selendroid.testapp");
		((AndroidDriver)appiumDriver).quit();
	}


}
