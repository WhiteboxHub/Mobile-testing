package com.wbl.appium.tests;

import org.testng.annotations.DataProvider;

public class MyDataProvider {

	@DataProvider(name = "Fillform")
	 
	  public static Object[][] FilltheForm() {
	 
	        return new Object[][] { {"whiteBox","Box@g.com","whiteboxqa","innovapath","Java"},
				{"whiteBox1","Box@g.com1","whiteboxqa1","innovapath1","Java Script"}};
	 
	  }
	 
}
