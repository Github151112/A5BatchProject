package com.DemoWebShop.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DemoWebShop.genericLibrary.BaseTest;
import com.DemoWebShop.genericLibrary.CustomListener;
import com.DemoWebShop.pomPages.RegisterPage;
import com.DemoWebShop.pomPages.WelcomePage;

@Listeners(CustomListener.class)
public class RegisterTest extends BaseTest {
	
	String email = "aman"+d.getRandomNo()+"@gmail.com";
	
	@Test(description = "verify the user is able to register or not",groups = "ST")
	public void toRegisterIntoDemoWebShop() throws EncryptedDocumentException, IOException {
		String firstName = ex.getDataFromExcelSheet(EXCEL_PATH, REG_SHEET, 1, 0);
		String LastName = ex.getDataFromExcelSheet(EXCEL_PATH, REG_SHEET, 1, 1);
		String password = ex.getDataFromExcelSheet(EXCEL_PATH, REG_SHEET, 1, 2);
		WelcomePage wp = new WelcomePage(driver);
		wp.getRegisterLink().click();
		RegisterPage rp = new RegisterPage(driver);
		rp.registerInDemoWeb(firstName,LastName,email,password);	
	}

}
