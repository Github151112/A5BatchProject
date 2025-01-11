package com.DemoWebShop.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.DemoWebShop.genericLibrary.BaseTest;
import com.DemoWebShop.pomPages.BaseClass;
import com.DemoWebShop.pomPages.LoginPage;
import com.DemoWebShop.pomPages.WelcomePage;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginIntoDemoWeb() throws EncryptedDocumentException, IOException
	{
		String username = ex.getDataFromExcelSheet(EXCEL_PATH, LOGIN_SHEET, 1, 0);
		String password = ex.getDataFromExcelSheet(EXCEL_PATH, LOGIN_SHEET, 1, 1);
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.toPerformLogin(username, password);
	}

}
