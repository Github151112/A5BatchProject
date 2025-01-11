package com.DemoWebShop.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
	
	/*
	 * this constructor is used to initialize the driver and webelements
	 */
	public BaseClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

}
