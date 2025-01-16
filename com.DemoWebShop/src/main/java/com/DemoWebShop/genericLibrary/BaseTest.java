package com.DemoWebShop.genericLibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest implements IAutoConstant {

	public WebDriver driver;
	public FileUtility fl = new FileUtility();
	public DataUtility d = new DataUtility();
	public ExcelUtility ex = new ExcelUtility();

	@BeforeSuite
	public void toConnectServer() {
		Reporter.log("==server connected successfully==",true);
	}

	@BeforeTest
	public void toConnectDatabase() {
		Reporter.log("==database connected sucessfully==",true);
	}

	@BeforeClass
	public void setUp() throws IOException {
		String browser = fl.getDataFromProperty(PROP_PATH, "browser");
		String url = fl.getDataFromProperty(PROP_PATH, "url");
		Reporter.log("****Launching " + browser + " browser****", true);
		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else
			Reporter.log("Invalid browser", true);
		d.maximizeWindow(driver);
		d.implicitWait(driver, TIMESECONDS);
		d.toLaunchApplication(driver, url);
	}

	@AfterClass
	public void tearDown() {
		Reporter.log("====Browser closed successfully====", true);
		driver.quit();
	}

	@AfterTest
	public void toCloseDatabase() {
		Reporter.log("==database closed sucessfully==", true);
	}

	@AfterSuite
	public void toCloseServer() {
		Reporter.log("==server closed sucessfully", true);
	}

}
