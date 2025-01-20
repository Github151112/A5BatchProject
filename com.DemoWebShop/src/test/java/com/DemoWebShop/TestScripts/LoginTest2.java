package com.DemoWebShop.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.DemoWebShop.genericLibrary.BaseTest;
import com.DemoWebShop.genericLibrary.CustomListener;
import com.DemoWebShop.pomPages.BaseClass;
import com.DemoWebShop.pomPages.LoginPage;
import com.DemoWebShop.pomPages.WelcomePage;


public class LoginTest2 extends BaseTest {
	
	@Test(groups = {"FT","ST","RT"})
	public void loginIntoDemoWeb() throws EncryptedDocumentException, IOException
	{
		/*
		 * use Soft Assert
		 */
		
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(driver.getTitle(), "Demo Web Sho");
		String username = ex.getDataFromExcelSheet(EXCEL_PATH, LOGIN_SHEET, 1, 0);
		String password = ex.getDataFromExcelSheet(EXCEL_PATH, LOGIN_SHEET, 1, 1);
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		s.assertEquals(driver.getTitle(), "Demo Web Shop. Login");
		LoginPage lp = new LoginPage(driver);
		lp.toPerformLogin(username, password);
		s.assertEquals(lp.getLogoutLink().isDisplayed(), true);
		s.assertAll();
		
	}

}
