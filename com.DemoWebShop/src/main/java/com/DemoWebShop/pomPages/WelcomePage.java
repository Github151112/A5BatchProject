package com.DemoWebShop.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage  extends BaseClass{

	public WelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/*
	 * register link
	 */
	@FindBy(className = "ico-register")
	private WebElement registerLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	/*
	 * login link
	 */
	
	@FindBy(className = "ico-login")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}
	
	
	
	

}
