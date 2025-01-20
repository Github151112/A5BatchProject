package com.DemoWebShop.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.genericLibrary.BaseTest;
import com.DemoWebShop.pomPages.LoginPage;
import com.DemoWebShop.pomPages.WelcomePage;

public class InvalidLoginTest extends BaseTest {
	
	@DataProvider(name="invalidData")
	public Object[][] invalidData() throws EncryptedDocumentException, IOException
	{
		return ex.getMultipleData(EXCEL_PATH, INVALIDSHEET);
	}
	
	@Test(dataProvider = "invalidData",groups = {"RT","ST","IT","FT"})
	public void invalidLogin(String username,String password)
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.toPerforminvalidLogin(username,password);
	}

}
