package com.wbl.appium.tests;

import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.wbl.appium.utils.UtilityClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class HomePageTest {
	
	public AppiumDriver appiumDriver=null;
	
	private static final By NONOBUTTON=By.xpath("//*[@class='android.widget.Button' and @text='No, no']");
	private static final By ENBUTTON=By.xpath("//*[@class='android.widget.Button' and @text='EN Button']");
	//private static final By TEXTBOX1=By.xpath("//*[@class='android.widget.EditText' and @id='io.selendroid.testapp:id/my_text_field']");
	

	
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
	public void test() throws InterruptedException
	{
		System.out.println("Inside Test");
		WebElement inputField = appiumDriver.findElement(By.className("android.widget.EditText"));
		inputField.click();
		Assert.assertEquals("true", inputField.getAttribute("enabled"));
		inputField.sendKeys("Appium");
		Assert.assertEquals("Appium", inputField.getText());
		//Thread.sleep(4000);
		appiumDriver.findElement(ENBUTTON).click();
	//	List<WebElement > btns=appiumDriver.findElements(By.id("io.selendroid.testapp:id/buttonTest"));
	//	System.out.println(btns.get(0).getText());
	//	btns.get(0).click();
		
		Thread.sleep(2000);
		appiumDriver.findElement(NONOBUTTON).click();
//	List<WebElement> noBtns=appiumDriver.findElements(By.id("android:id/button2"));
//	noBtns.get(1).click();
	} 
	
	@org.junit.After
	public void After()
	{
		//((AndroidDriver)appiumDriver).removeApp("io.selendroid.testapp");
		((AndroidDriver)appiumDriver).quit();
	}

}
