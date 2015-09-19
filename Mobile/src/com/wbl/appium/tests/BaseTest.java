package com.wbl.appium.tests;

import org.apache.log4j.BasicConfigurator;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.wbl.appium.utils.UtilityClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	
	public AppiumDriver appiumDriver=null;
	
	@BeforeClass
	public static void setUpClass()
	{
		BasicConfigurator.configure();
	}
	
	@BeforeTest
	public void setUp() throws Exception {
		appiumDriver=UtilityClass.getDeviceDriver("ANDROID","sample1");
		
	
		appiumDriver.installApp("D:/supriya/softwares/selendroid-test-app-0.16.0.apk");
		((AndroidDriver)appiumDriver).startActivity("io.selendroid.testapp",".HomeScreenActivity");
	}
	
	@AfterTest
	public void After1()
	{
		//((AndroidDriver)appiumDriver).removeApp("io.selendroid.testapp");
		((AndroidDriver)appiumDriver).quit();
	}

}
