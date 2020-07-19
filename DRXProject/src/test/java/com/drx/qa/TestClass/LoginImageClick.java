package com.drx.qa.TestClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.drx.qa.BaseClass.BaseClass;
import com.drx.qa.allPages.InnitialPage;
import com.drx.qa.allPages.LoginPage;

public class LoginImageClick extends BaseClass {

	public static InnitialPage ipage;
	public static LoginPage lnpage;

	public LoginImageClick() {
		super();

	}

	@BeforeMethod
	public void Setup() {
		browserSetUp();
		ipage = new InnitialPage();
	}

	@Test
	public void verifyLoginImpageLink()  {
		//Thread.sleep(2000);
		lnpage	=ipage.clickOnLoginImage();
		
	}

	@AfterMethod()
	public void tearDown() {
		d1.quit();
	}
}
