package com.wbl.appium.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wbl.appium.activities.HomePage;
import com.wbl.appium.activities.WebViewPage;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WebviewPageTest extends BaseTest {
	
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
}