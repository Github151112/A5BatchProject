package com.DemoWebShop.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BaseClass {

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath ="//label[text()='Male']")
	private WebElement maleRadioButton;
	
	@FindBy(xpath ="//label[text()='Female']")
	private WebElement femaleRadioButton;
	
	@FindBy(id ="FirstName")
	private WebElement firstNameTextField;
	
	@FindBy(id ="LastName")
	private WebElement lastNameTextField;
	
	@FindBy(id ="Email")
	private WebElement emailTextField;
	
	@FindBy(id ="Password")
	private WebElement passwordTextField;
	
	@FindBy(id ="ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	@FindBy(id ="register-button")
	private WebElement registerButton;
	
	
	/*
	 * this method will take care of registartion
	 */
	public void registerInDemoWeb(String firstName,String lastName,String email,String password)
	{
		maleRadioButton.click();
		firstNameTextField.sendKeys(firstName);
		lastNameTextField.sendKeys(lastName);
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		confirmPasswordTextField.sendKeys(password);
		registerButton.click();
	}
	
	
	
	

}
