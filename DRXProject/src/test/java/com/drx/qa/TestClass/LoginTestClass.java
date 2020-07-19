package com.drx.qa.TestClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.drx.qa.BaseClass.BaseClass;
import com.drx.qa.allPages.LoginPage;
import com.drx.qa.allPages.PatientSearchPage;

public class LoginTestClass extends BaseClass {

	static LoginPage lpage;
	PatientSearchPage parent;

	public LoginTestClass() {
		super();
	}

	@BeforeMethod()
	public void SetupBrowser() {
		browserSetUp();
		lpage = new LoginPage();

	}

	@Test
	public void doLogin() {
		lpage.enterUserdetails(pro.getProperty("usename"), pro.getProperty("password"));
	}

	@Test
	public void submitbutton() {
		parent = lpage.submitButton();
	}

	@AfterMethod()
	public void tearDown() {
		d1.quit();
	}

}
