package com.DemoWebShop.genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

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
	
	/*
	 * this method will take the screenshot of full web page
	 * @param driver
	 * @param name
	 */
	public void getScreenshot(WebDriver driver,String name)
	{
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+name+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
