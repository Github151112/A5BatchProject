package com.DemoWebShop.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BaseClass{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id ="Password")
	private WebElement passwordTextField;
	
	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	/*
	 * this method will perform login operation
	 * @param username
	 * @param password
	 */
	public void toPerformLogin(String email,String password)
	{
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		rememberMeCheckBox.click();
		loginButton.click();
	}
	
	public void toPerforminvalidLogin(String email,String password)
	{
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		rememberMeCheckBox.click();
		loginButton.click();
		emailTextField.clear();
	}
}
