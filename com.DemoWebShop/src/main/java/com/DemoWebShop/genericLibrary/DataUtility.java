package com.DemoWebShop.genericLibrary;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;

public class DataUtility {
	
	/*
	 * this method is used to maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/*
	 * this method is used to provide implicit wait
	 */
	
	public void implicitWait(WebDriver driver,int sec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	/*
	 * this method is used to launch the application
	 * @param driver
	 * @param url
	 */
	public void toLaunchApplication(WebDriver driver,String url)
	{
		driver.get(url);
	}
	
	/*
	 * this method will generate some random no
	 */
	public int getRandomNo()
	{
		Random r = new Random();
		return r.nextInt(10000);
	}
	
	
}
